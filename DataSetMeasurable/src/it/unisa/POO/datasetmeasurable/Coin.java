package it.unisa.POO.datasetmeasurable;

public class Coin implements Measurable
{
	public Coin(double unValue,String unName)
	{
		name=unName;
		value=unValue;
	}
	
	public String getName()
	{
		return name;
	}

	public double getValue()
	{
		return value;
	}

	public boolean equals(Coin moneta)
	{
		return name.equals(moneta.getName());
	}
	
	public double getMeasure()
	{
		return value;
	}
	
	private String name;
	private double value;
}