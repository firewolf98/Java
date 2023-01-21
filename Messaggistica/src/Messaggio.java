import java.util.GregorianCalendar;

public class Messaggio 
{
	@Override
	public String toString() {
		return "Messaggio [id=" + getId() + ", date=" + getDate() + ", mitt=" + getSender() + ", text=" + getText() + "]";
	}

	public Messaggio(int identificativo,String mittente,GregorianCalendar data,String testo)
	{
		id=identificativo;
		mitt=mittente;
		date=data;
		text=testo;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getSender()
	{
		return mitt;
	}
	
	public GregorianCalendar getDate()
	{
		return date;
	}
	
	public String getText()
	{
		return text;
	}
	
	private int id;
	GregorianCalendar date;
	String mitt,text;
}