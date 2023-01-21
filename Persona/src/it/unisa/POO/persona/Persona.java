package it.unisa.POO.persona;

public class Persona 
{
	public Persona(String name,int anno)
	{
		nome=name;
		year=anno;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public int getAnno()
	{
		return year;
	}
	
	private String nome;
	private int year;
}