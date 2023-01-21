package vacanza;

import java.util.Comparator;
import java.util.GregorianCalendar;

public class ViaggioTest 
{
	public static void main(String[] args) 
	{
		class dataComparator implements Comparator<Prenotazione>
		{
			public int compare(Prenotazione p1,Prenotazione p2)
			{
				if(p1 instanceof PrenotazioneAlbergo && p2 instanceof PrenotazioneAlbergo)
					return (p1.daiDate().compareTo(p2.daiDate()));
				else if(p1 instanceof PrenotazioneVoloAereo && p2 instanceof PrenotazioneVoloAereo)
					return (p1.daiDate().compareTo(p2.daiDate()));
				else if (p1 instanceof PrenotazioneAlbergo && p2 instanceof PrenotazioneVoloAereo)
					return (p1.daiDate().compareTo(p2.daiDate()));
				else 
					return (p1.daiDate().compareTo(p2.daiDate()));
			}
			
			/*public int compare(Prenotazione p1,Prenotazione p2)
			{
				if(p1.daiDate().before(p2.daiDate()))
					return -1;
				else if(p1.daiDate().after(p2.daiDate()))
					return 1;
				return 0;
			}*/
		}
		GregorianCalendar g1=new GregorianCalendar(2018,11,18);
		GregorianCalendar g2=new GregorianCalendar(2018,10,20);
		GregorianCalendar g3=new GregorianCalendar(2018,9,15);
		GregorianCalendar g4=new GregorianCalendar(2018,3,8);
		Viaggio v=new Viaggio(new dataComparator());
		Prenotazione b=new PrenotazioneAlbergo(1,g1,5,35);
		Prenotazione b1=new PrenotazioneVoloAereo(2,g2,20,50);
		Prenotazione b2=new PrenotazioneAlbergo(3,g3,7,65);
		Prenotazione b3=new PrenotazioneVoloAereo(4,g4,2,25);
		v.aggiungiPrenotazione(b);
		v.aggiungiPrenotazione(b1);
		v.aggiungiPrenotazione(b2);
		v.aggiungiPrenotazione(b3);
		Prenotazione temp=v.getMinCosto();
		System.out.println(temp.daiPrezzoTotale());
		System.out.println(v.daiTipoPrenotazione(0));
		System.out.println(v.daiTipoPrenotazione(1));
		System.out.println(v.daiTipoPrenotazione(2));
		System.out.println(v.daiTipoPrenotazione(3));
		
	}
}