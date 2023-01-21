package it.unisa.POO.supermarket;

public class Elettronico extends Prodotto
{
	public Elettronico(int cod,String descr,String mar,double price,int quant,boolean off,int annig,double priceg)
	{
		super(cod,descr,mar,price,quant,off);
		annigaranzia=annig;
		prezzog=priceg;
	}
	
	public int getAnniGaranzia()
	{
		return annigaranzia;
	}
	
	public double getPrezzoGaranzia()
	{
		return prezzog;
	}
	
	public double calcoloPrezzoGaranzia(int a)
	{
		return a*prezzog;
	}
	
	public boolean acquista(int q)
	{
		if(q<super.getQuantità())
		{
			super.setQuantità(-q);
			return true;
		}
		return false;
	}
	
	private int annigaranzia;
	private double prezzog;
}