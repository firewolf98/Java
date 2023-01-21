package vacanza;

import java.util.ArrayList;
import java.util.Comparator;

public class Viaggio 
{
	public Viaggio(Comparator<Prenotazione> p)
	{
		prenotazioni=new ArrayList<Prenotazione>();
		pren=p;
	}
	
	public void aggiungiPrenotazione(Prenotazione p)
	{
		for(int i=0;i<prenotazioni.size();i++)
		{
			Prenotazione x=prenotazioni.get(i);
			if(pren.compare(p,x)<0)
			{
				prenotazioni.add(i,p);
				return;
			}
		}
		prenotazioni.add(p);
	}
	
	public Prenotazione daiPrenotazione(int i)
	{
		Prenotazione temp=null;
		for(int j=0;j<prenotazioni.size();j++)
			if(j==i)
				temp=prenotazioni.get(i);
		return temp;
	}
	
	public Prenotazione cancellaPrenotazione(int i)
	{
		Prenotazione temp=null;
		for (int j=0;j<prenotazioni.size();j++)
			if(i==j)
			{
				temp=prenotazioni.get(i);
				prenotazioni.remove(prenotazioni.get(i));
			}
		return temp;
	}
	
	public String daiTipoPrenotazione(int i)
	{
		for(int j=0;j<prenotazioni.size();j++)
			if(j==i)
				if(prenotazioni.get(i) instanceof PrenotazioneAlbergo)
					return "E' la prenotazione di un albergo";
		return "E' la prenotazione di un volo aereo";
	}
	
	public Prenotazione getMinCosto()
	{
		Prenotazione temp=prenotazioni.get(0);
		for(int i=0;i<prenotazioni.size();i++)
			if(prenotazioni.get(i).daiPrezzoTotale()<temp.daiPrezzoTotale())
				temp=prenotazioni.get(i);
		return temp;
	}
	
	public Prenotazione cerca(String s,int i)
	{
		Prenotazione temp=null;
		for (int j=0;j<prenotazioni.size();j++)
			if(i==j)
				if(s.equals("PrenotazioneAlbergo"))
					if(prenotazioni.get(i) instanceof PrenotazioneAlbergo)
						temp=prenotazioni.get(i);
		return temp;
	}
	
	private Comparator<Prenotazione> pren;
	private ArrayList<Prenotazione> prenotazioni;
}