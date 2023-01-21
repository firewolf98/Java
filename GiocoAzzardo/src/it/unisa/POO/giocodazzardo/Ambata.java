package it.unisa.POO.giocodazzardo;

public class Ambata extends GiocoAzzardo
{
	public Ambata(int c)
	{
		super(c);
		ambata=generatore().nextInt(45)+1;
		ruota=new int[10];
		for(int i=0;i<10;i++)
		{
			int generato=generatore().nextInt(45)+1;
			for(int j=0;j<i;j++)
				if(generato==ruota[j])
					generato=0;
			if(generato==0)
				i--;
			else
				ruota[i]=generato;
		}
	}
	
	public boolean gioca()
	{
		for(int i=0;i<10;i++)
			if(ruota[i]==ambata)
				return true;
		return false;
	}
	
	public String toString()
	{
		String r="";
		for(int i=0;i<10;i++)
			r+=ruota[i]+"";
		return "RUOTA: " + r + "\nAMBATA: " + ambata;
	}
	
	public double dammiVincita()
	{
		return getCosto()*10;
	}
	
	private int ambata;
	private int[] ruota;
}