package it.unisa.POO.phone;

public class Utente 
{
	public Utente(int codice,String name,String cognome,int minutipieni,int minutirid)
	{
		cod=codice;
		nome=name;
		surname=cognome;
		minp=minutipieni;
		minr=minutirid;
	}
	
	public int getCodice()
	{
		return cod;
	}
	
	public String getName()
	{
		return nome;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public int getMinutiPieni()
	{
		return minp;
	}
	
	public int getMinutiRidotti()
	{
		return minr;
	}
	
	private String nome,surname;
	private int cod,minp,minr;
}
