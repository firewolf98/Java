package it.unisa.POO.relazioneclassi;

public class Country implements Comparable 
{
	public Country(String nome,int sup)
	{
		name=nome;
		superficie=sup;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getSuperficie()
	{
		return superficie;
	}
	
	public int compareTo(Object o)
	{
		Country c = (Country) o;
		if (c.getSuperficie() > this.superficie)
			return 1;
		if(c.getSuperficie() == this.superficie)
			return 0;
		else
			return -1;
	}
	
	public String toString() {
		return "Il paese con la superficie maggiore è:" + name + ",la superficie è=" + superficie;
	}



	private String name;
	private int superficie;
}