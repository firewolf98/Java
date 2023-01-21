package vacanza;

import java.util.GregorianCalendar;

public interface Prenotazione 
{
	String daiDettagliServizioPrenotato();
	double daiPrezzoTotale();
	int daiNumeroPartecipanti();
	boolean daiValidita();
	GregorianCalendar daiDate();
	void setDettagliServizioPrenotato(String dettagli);
	void setPrezzoBase(double prezzo);
	void setNumeroPartecipanti(int numero);
}