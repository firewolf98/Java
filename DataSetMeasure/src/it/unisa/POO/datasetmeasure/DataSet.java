package it.unisa.POO.datasetmeasure;

public class DataSet 
{
	public DataSet(Measurer M)
	{
		sum = 0;
		count = 0;
		minimum = null;
		maximum = null;
		measurer = M;
	}
	
	public double getAverage()
	{
		if (count == 0) 
			return 0;
		else 
			return sum / count;
	}
	
	public Object getMaximum()
	{
		return maximum;
	}
	
	public Object getMinimum() 
	{ 
		return minimum; 
	}
	
	public void add(Object x) 
	{
		sum = sum + measurer.measure(x);
		if (count == 0 || measurer.measure(minimum) > measurer.measure(x))
			minimum = x;
		if (count == 0 || measurer.measure(maximum) < measurer.measure(x))
			maximum = x;
		count++;
	}
	
	private double sum;
	private Object minimum;
	private Object maximum;
	private int count;
	private Measurer measurer;
}