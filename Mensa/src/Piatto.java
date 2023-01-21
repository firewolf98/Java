import java.io.Serializable;

public class Piatto implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5775049250137958292L;
	public Piatto(String nome,int chilocal,double prezzo)
	{
		name=nome;
		kcal=chilocal;
		costo=prezzo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getKcal()
	{
		return kcal;
	}
	
	public double getCosto()
	{
		return costo;
	}
	
	private String name;
	private int kcal;
	private double costo;
}
