import java.util.GregorianCalendar;

public class RegaloAdulto extends Regalo
{
	public RegaloAdulto(GregorianCalendar dataconsegna,int pesopacco,String regione,String mittente)
	{
		super(dataconsegna,pesopacco,regione);
		mitt=mittente;
	}
	
	public String getMittente()
	{
		return mitt;
	}
	
	public String toString() 
	{
		return "Mittente= " + mitt;
	}

	public int calcolaCosto()
	{
		return super.calcolaCosto();
	}
	
	private String mitt;
}
