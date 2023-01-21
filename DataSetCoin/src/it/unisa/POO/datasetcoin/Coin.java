package it.unisa.POO.datasetcoin;

public class Coin 
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
	
	private String name;
	private double value;
}