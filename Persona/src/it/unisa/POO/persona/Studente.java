package it.unisa.POO.persona;

public class Studente extends Persona
{
	public Studente(String name,int anno,String special)
	{
		super(name,anno);
		specializzazione=special;
	}
	
	public String getSpecializzazione()
	{
		return specializzazione;
	}
	
	private String specializzazione;
}