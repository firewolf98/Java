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
		quantità=quant;
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
	
	public int getQuantità()
	{
		return quantità;
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
	
	public void setQuantità(int q)
	{
		quantità=quantità+q;
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
	
	private int codice,quantità;
	private double prezzo,prezzo2;
	private String descrizione,marca;
	private boolean inofferta;
	private GregorianCalendar datascad;
}