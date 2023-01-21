package it.unisa.POO.lavoratore;

public class Lavoratore 
{
	public Lavoratore(String nome,int oreLavorative)
	{
		name=nome;
		orel=oreLavorative;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getOreLavorative()
	{
		return orel;
	}
	
	private int orel;
	private String name;
}