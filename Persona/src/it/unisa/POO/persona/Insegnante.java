package it.unisa.POO.persona;

public class Insegnante extends Persona
{
	public Insegnante(String name,int anno,int stipendio)
	{
		super(name,anno);
		stip=stipendio;
	}
	
	public int getStipendio()
	{
		return stip;
	}
	
	private int stip;
}