package it.unisa.POO.cars;

public class Car 
{
	public Car(String marca,String modello,int anno,int price)
	{
		nome=marca;
		mode=modello;
		year=anno;
		prezzo=price;
	}
	
	public String getName()
	{
		return nome;
	}
	
	public String getMode()
	{
		return mode;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public int getPrezzo()
	{
		return prezzo;
	}
	
	private String nome,mode;
	private int year,prezzo;
}
