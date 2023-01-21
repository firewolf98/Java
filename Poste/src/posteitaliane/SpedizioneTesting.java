package posteitaliane;

import java.util.*;

public class SpedizioneTesting 
{
	public static void main(String[] args) 
	{
		String [] listaAeroporti= {"Londra", "Parigi", "Roma", "Berlino", "Madrid", "Lisbona", "Amsterdam", "Mosca"};
		String[] listaC= {"Palermo", "Reggio Calabria", "Salerno", "Napoli", "Roma", "Firenze", "Bologna", "Milano", "Torino", "Aosta"};

		 Random r=new Random();
		 ClienteSpedizione c=new ClienteSpedizione("abc", r.nextInt(500)+501);
		 System.out.println(c);
		 Spedizione x;
		 
		for (int i=0;i<10;i++) {
			 int scelta=r.nextInt(2);
			 if (scelta==0)
				 x=new SpedizioneInternazionale(listaAeroporti[r.nextInt(8)], listaAeroporti[r.nextInt(8)]);
			 else {
				 int p=1, d=0;
				 while(p>d) {
					 p=r.nextInt(10);
					 d=r.nextInt(10);
				 }
				 x=new SpedizioneNazionale(listaC[p], listaC[d]);
			 }
			c.aggiungiPacco(x);
			
	}
		 System.out.println(c);
	}
	}
