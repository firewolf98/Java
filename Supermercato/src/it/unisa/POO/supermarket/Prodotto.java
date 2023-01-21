package it.unisa.POO.supermarket;

import java.util.GregorianCalendar;

public class Prodotto 
{
	public Prodotto(int cod,String descr,String mar,double price,int quant,boolean off)
	{
		codice=cod;
		descrizione=descr;
		marca=mar;
		prezzo=price;
		prezzo2=price;
		quantit�=quant;
		inofferta=off;
		datascad=null;
	}
	
	public int getCodice()
	{
		return codice;
	}
	
	public String getDescrizione()
	{
		return descrizione;
	}
	
	public String getMarca()
	{
		return marca;
	}
	
	public double getPrezzo()
	{
		return prezzo;
	}
	
	public int getQuantit�()
	{
		return quantit�;
	}
	
	public boolean getInOfferta()
	{
		return inofferta;
	}
	
	public void mettiInOfferta(double p,GregorianCalendar g)
	{
		prezzo=prezzo-p;
		datascad=g;
	}
	
	public void setQuantit�(int q)
	{
		quantit�=quantit�+q;
	}
	
	public void controllaOfferta()
	{
		GregorianCalendar dataAttuale = new GregorianCalendar();
		if(dataAttuale.after(datascad))
		{
			inofferta=false;
			prezzo=prezzo2;
		}
			
	}
	
	private int codice,quantit�;
	private double prezzo,prezzo2;
	private String descrizione,marca;
	private boolean inofferta;
	private GregorianCalendar datascad;
}