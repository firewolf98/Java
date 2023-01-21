package it.unisa.POO.lavoratore;

public class LavoratoreAdOre extends Lavoratore
{
	public LavoratoreAdOre(String name,int oreLavorative)
	{
		super(name,oreLavorative);
		paga=0;
	}
	
	public int getPaga()
	{
		if(super.getOreLavorative()>40)
		{
			int diff=super.getOreLavorative()-40;
			paga=40*pagaPerOra+diff+pagaPerOra/2;
		}
		else 
			paga=super.getOreLavorative()*pagaPerOra;
		return paga;
	}
	
	private int paga;
	private static final int pagaPerOra=25;
}