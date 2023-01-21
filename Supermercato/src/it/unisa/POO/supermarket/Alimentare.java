package it.unisa.POO.supermarket;

import java.util.GregorianCalendar;

public class Alimentare extends Prodotto
{
	public Alimentare(int cod,String descr,String mar,double price,int quant,boolean off,GregorianCalendar date,double pes)
	{
		super(cod,descr,mar,price,quant,off);
		datascad=date;
		peso=pes;
	}
	
	public GregorianCalendar getDataScad()
	{
		return datascad;
	}
	
	public double getPeso()
	{
		return peso;
	}
	
	public boolean prodottoScaduto()
	{
		GregorianCalendar dataAttuale = new GregorianCalendar();
		if(dataAttuale.after(datascad))
			return true;
		return false;
	}
	
	public boolean acquista(int p)
	{
		if(p<peso)
		{
			peso=peso-p;
			return true;
		}
		return false;
	}
	
	private GregorianCalendar datascad;
	private double peso;
}