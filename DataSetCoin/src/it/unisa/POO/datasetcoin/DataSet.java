package it.unisa.POO.datasetcoin;

public class DataSet 
{
	public DataSet() 
	{
		sum = 0;
		count = 0;
		minimum = null;
		maximum= null;
	}
	
	public double getAverage()
	{
		if (count == 0) 
			return 0;
		else 
			return sum / count;
	}
	
	public Coin getMaximum()
	{
		return maximum;
	}
	
	public Coin getMinimum() 
	{ 
		return minimum; 
	}
	
	public void add(Coin x) 
	{
		sum = sum + x.getValue();
		if (count == 0 || minimum.getValue() > x.getValue())
			minimum = x;
		if (count == 0 || maximum.getValue() < x.getValue())
			maximum = x;
		count++;
	}
	
	private double sum;
	private Coin minimum;
	private Coin maximum;
	private int count;
}