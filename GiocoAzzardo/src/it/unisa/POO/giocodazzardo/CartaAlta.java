package it.unisa.POO.giocodazzardo;

public class CartaAlta extends GiocoAzzardo
{
	public CartaAlta(double costo)
	{
		super(costo);
		carta=new int[2];
		carta[0]=generatore().nextInt(10)+1;
		carta[1]=generatore().nextInt(10)+1;
		banco=new int[2];
		banco[0]=generatore().nextInt(10)+1;
		banco[1]=generatore().nextInt(10)+1;
	}
	
	public boolean gioca()
	{
		if((carta[0]>banco[0])&&(carta[1]>banco[1]))
			return true;
		return false;
	}
	
	public String toString()
	{
		return "BANCO: " + banco[0] + " " + banco[1] + "\nCARTE: " + carta[0] + " " + carta[1];
	}
	
	public double dammiVincita()
	{
		return getCosto()*5;
	}
	
	private int[] carta,banco;
}