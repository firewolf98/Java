import java.util.GregorianCalendar;

public class Regalo 
{
	public Regalo(GregorianCalendar dataconsegna,int pesopacco,String regione)
	{
		data=dataconsegna;
		peso=pesopacco;
		reg=regione;
	}
	
	public GregorianCalendar getData()
	{
		return data;
	}
	
	public int getPeso()
	{
		return peso;
	}
	
	public String getRegione()
	{
		return reg;
	}
	
	public int calcolaCosto()
	{
		if(reg.equals("Nord"))
			return 10;
		if(reg.equals("Centro"))
			return 15;
		else
			return 20;
	}
	
	public void setData(GregorianCalendar d)
	{
		data=d;
	}
	
	private GregorianCalendar data;
	private int peso;
	private String reg;
}
