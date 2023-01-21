import java.io.Serializable;
import java.util.ArrayList;

public class Albergo implements Serializable
{
	public Albergo()
	{
		clienti=new ArrayList<Cliente>();
		stanze=new ArrayList<Stanza>();
		prenotazioni=new ArrayList<Prenotazione>();
	}
	
	public void addPrenotazione(Prenotazione p)
	{
		prenotazioni.add(p);
	}
	
	public void addCliente(Cliente c)
	{
		clienti.add(c);
	}
	
	public void addStanza(Stanza s)
	{
		stanze.add(s);
	}
	
	public ArrayList<Cliente> getClienti()
	{
		return clienti;
	}
	
	public ArrayList<Stanza> getStanze()
	{
		return stanze;
	}
	
	public ArrayList<Prenotazione> getPrenotazioni()
	{
		return prenotazioni;
	}
	
	private ArrayList<Cliente> clienti;
	private ArrayList<Stanza> stanze;
	private ArrayList<Prenotazione> prenotazioni;
}
