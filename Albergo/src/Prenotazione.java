import java.io.Serializable;
import java.util.GregorianCalendar;

public class Prenotazione implements Serializable
{
	private static final long serialVersionUID = 1841558858935071527L;

	public Prenotazione(GregorianCalendar checkin,GregorianCalendar checkout,Cliente cliente,Stanza stanza)
	{
		in=checkin;
		out=checkout;
		c=cliente;
		s=stanza;
	}
	
	public GregorianCalendar getCheckIn()
	{
		return in;
	}
	
	public GregorianCalendar getCheckOut()
	{
		return out;
	}
	
	public Cliente getCliente()
	{
		return c;
	}
	
	public Stanza getStanza()
	{
		return s;
	}
	
	private GregorianCalendar in,out;
	private Cliente c;
	private Stanza s;
}
