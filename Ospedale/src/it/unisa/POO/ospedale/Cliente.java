package it.unisa.POO.ospedale;

import java.util.*;

public class Cliente 
{
	public Cliente(String codiceFiscale,int numInterventi)
	{
		cod=codiceFiscale;
		numInt=numInterventi;
		cure=new ArrayList<String>();
	}
	
	public void setNumInterventi()
	{
		numInt++;
	}
	
	public String getCodice()
	{
		return cod;
	}
	
	public void setCure(String s)
	{
		cure.add(s);
	}
	
	public int getNumInt()
	{
		return numInt;
	}
	
	private String cod;
	private int numInt;
	private ArrayList<String> cure;
}