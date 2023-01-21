package it.unisa.POO.lavoratore;

public class LavoratoreFisso extends Lavoratore
{
	public LavoratoreFisso(String name,int oreLavorative)
	{
		super(name,oreLavorative);
	}
	
	public int getPaga()
	{
		return 40*pagaPerOra;
	}

	private static final int pagaPerOra=25;
}