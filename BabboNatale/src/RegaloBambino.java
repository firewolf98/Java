import java.util.GregorianCalendar;

public class RegaloBambino extends Regalo
{
	public RegaloBambino(GregorianCalendar dataconsegna,int pesopacco,String regione,String nomebambino,int età,String messaggio)
	{
		super(dataconsegna,pesopacco,regione);
		nome=nomebambino;
		eta=età;
		text=messaggio;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public int getEta()
	{
		return eta;
	}
	
	public String getMessaggio()
	{
		return text;
	}
	
	public String toString()
	{
		return "HoHoHo" + text;
	}
	
	public int calcolaCosto()
	{
		return super.calcolaCosto();
	}
	
	private String nome,text;
	private int eta;
}
