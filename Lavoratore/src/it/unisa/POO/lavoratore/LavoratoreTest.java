package it.unisa.POO.lavoratore;

import java.util.*;

public class LavoratoreTest 
{
	public static void main(String[] args) 
	{
		ArrayList<Lavoratore> lav=new ArrayList<Lavoratore>();
		Lavoratore a,b;
		Scanner in=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			a=new LavoratoreFisso(in.next(),in.nextInt());
			lav.add(a);
			b=new LavoratoreAdOre(in.next(),in.nextInt());
			lav.add(b);
		}
		for(Lavoratore lavor: lav)
		{
			if(lavor instanceof LavoratoreFisso)
			{
				System.out.println("Lavoratore fisso");
				LavoratoreFisso lf=(LavoratoreFisso) lavor;
				System.out.println("Nome: "+lf.getName()+"Paga: "+lf.getPaga());
			}
			else if(lavor instanceof LavoratoreAdOre)
			{
				System.out.println("Lavoratore ad ore");
				LavoratoreAdOre lf=(LavoratoreAdOre) lavor;
				System.out.println("Nome: "+lf.getName()+"Paga: "+lf.getPaga());
			}
		}
	}
}