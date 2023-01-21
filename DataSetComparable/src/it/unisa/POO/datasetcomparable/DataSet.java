package it.unisa.POO.datasetcomparable;

public class DataSet
{
	public DataSet() 
	{
		//sum = 0;
		count = 0;
		minimum = null;
		maximum= null;
	}
	
	public Comparable getMaximum()
	{
		return maximum;
	}
	
	public Comparable getMinimum() 
	{ 
		return minimum; 
	}
	
	public void add(Comparable x) 
	{
		//sum = sum + x.compareTo();
		if (count == 0 || minimum.compareTo(x)<0)
			minimum = x;
		if (count == 0 || maximum.compareTo(x) >0)
			maximum = x;
		count++;
	}
	
	private double sum;
	private Comparable minimum;
	private Comparable maximum;
	private int count;
	
	
}