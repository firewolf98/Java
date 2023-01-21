package it.unisa.POO.ospedale;

public class Medico 
{
	public Medico(int codice,String nome,String cognome)
	{
		cod=codice;
		name=nome;
		surname=cognome;
		numVisite=0;
	}
	
	public int getCodice()
	{
		return cod;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public void setNumVisite()
	{
		numVisite++;
	}
	
	public int getNumVisite()
	{
		return numVisite;
	}
	
	private int numVisite;
	private int cod;
	private String name,surname;
}