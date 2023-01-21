package it.unisa.POO.dataset;

public class DataSet 
{
	public DataSet() 
	{
		sum = 0;
		count = 0;
		minimum = 0;
		maximum=0;
	}
	
	public void add(double x) 
	{
		sum += x;
		if (count == 0 || minimum > x)
		minimum = x;
		if (count == 0 || maximum < x)
		maximum = x;
		count++;
	}
	
	public double getAverage() 
	{
		if (count == 0) return 0;
		else return sum / count;
	}
	
	public double getMaximum() 
	{
		return maximum;
	}
	
	public double getMinimum()
	{
		return minimum;
	}
		
	private double sum;
	private double minimum;
	private double maximum;
	private int count;
}