import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class PastoAcquistato implements Serializable
{
	public PastoAcquistato(ArrayList<Piatto> piatti,GregorianCalendar data,double costoTot)
	{
		this.piatti=piatti;
		this.data=data;
		this.costoTot=costoTot;
	}
	
	public ArrayList<Piatto> getPiatti()
	{
		return piatti;
	}
	
	public GregorianCalendar getData()
	{
		return data;
	}
	
	public double getCostoTot()
	{
		return costoTot;
	}
	
	private ArrayList<Piatto> piatti;
	private double costoTot;
	private GregorianCalendar data;
}
