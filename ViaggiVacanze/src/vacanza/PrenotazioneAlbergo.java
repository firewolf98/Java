package vacanza;

import java.util.GregorianCalendar;

public class PrenotazioneAlbergo implements Prenotazione
{
	public PrenotazioneAlbergo(int c,GregorianCalendar g,int np,double pr)
	{
		cod=c;
		date=g;
		numPart=np;
		price=pr;
		dettagli="";
	}
	
	public double daiPrezzoTotale()
	{
		return price*numPart+(price*numPart)*19/100;
	}
	
	public boolean daiValidita()
	{
		GregorianCalendar dataAttuale = new GregorianCalendar();
		if(date.before(dataAttuale))
			return true;
		return false;
	}
	
	public int daiNumeroPartecipanti()
	{
		return numPart;
	}
	
	public String daiDettagliServizioPrenotato()
	{
		return dettagli;
	}
	
	public void setDettagliServizioPrenotato(String detta)
	{
		dettagli=detta;
	}
	
	public void setPrezzoBase(double prezzo)
	{
		price=prezzo;
	}
	
	public void setNumeroPartecipanti(int numero)
	{
		numPart=numero;
	}
	
	public int getCodice()
	{
		return cod;
	}
	
	public GregorianCalendar daiDate()
	{
		return date;
	}
	
	private int cod,numPart;
	private GregorianCalendar date;
	private double price;
	private String dettagli;
}