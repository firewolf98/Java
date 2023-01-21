package it.unisa.POO.supermarket;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class SupermercatoTest 
{
		public static void main(String[] args) 
		{
			class codiceComparator implements Comparator<Prodotto>
			{
				public int compare(Prodotto o1,Prodotto o2)
				{
					if(o1.getCodice()<o2.getCodice())
						return -1;
					else if(o1.getCodice()>o2.getCodice())
						return 1;
					return 0;
				}
			}
			
			Supermercato s=new Supermercato(new codiceComparator());
			Scanner in=new Scanner(System.in);
			GregorianCalendar g2 = new GregorianCalendar(2018, 11, 18);
			for(int i=0;i<2;i++)
			{
				s.addProdotto(new Alimentare(in.nextInt(),in.next(),in.next(),in.nextDouble(),in.nextInt(),in.nextBoolean(),g2,in.nextDouble()));
				s.addProdotto(new Elettronico(in.nextInt(),in.next(),in.next(),in.nextDouble(),in.nextInt(),in.nextBoolean(),in.nextInt(),in.nextDouble()));
			}
			System.out.println("Il terzo prodotto è un: "+s.daiTipoProdotto(2));
			System.out.println("Il prodotto che costa di meno è: "+s.getMinimo());
			System.out.println("Il prodotto che costa di più è: "+s.getMassimo());
			ArrayList<Prodotto> temp=new ArrayList<Prodotto>();
			temp=s.cerca("divella");
			System.out.println("Prodotti della divella:");
			for(int j=0;j<temp.size();j++)
				System.out.println(temp.get(j).getCodice());
	}
}