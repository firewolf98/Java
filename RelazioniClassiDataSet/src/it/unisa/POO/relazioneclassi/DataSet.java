package it.unisa.POO.relazioneclassi;

import java.util.Comparator;

public class DataSet
{
	public DataSet(Comparator comparator) 
	{
		count = 0;
		minimum = null;
		maximum= null;
		comparer=comparator;
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
		if (count == 0)
		{
			maximum=x;
			minimum=x;
		}
		else
		{
			if(comparer.compare(x,maximum)>0)
				maximum=x;
			else if(comparer.compare(x,minimum)<0)
				minimum=x;
		}
		count++;
	}
		
	private Object minimum;
	private Object maximum;
	private int count;
	private Comparator comparer;	
}