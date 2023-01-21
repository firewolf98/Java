package it.unisa.POO.datasetfilter;

public class DataSet 
{
	public DataSet(Measurer M,Filter filter)
	{
		sum = 0;
		count = 0;
		minimum = null;
		maximum = null;
		measurer = M;
		f=filter;
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
	
	public void add(BankAccount x) 
	{
		if(f.accept(x)) 
		{
		sum = sum + measurer.measure(x);
		if (count == 0 || measurer.measure(minimum) > measurer.measure(x))
			minimum = x;
		if (count == 0 || measurer.measure(maximum) < measurer.measure(x))
			maximum = x;
		count++;
		}
	}
	
	private double sum;
	private BankAccount minimum;
	private BankAccount maximum;
	private int count;
	private Measurer measurer;
	private Filter f;
}