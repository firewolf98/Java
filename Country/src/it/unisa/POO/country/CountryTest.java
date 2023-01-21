package it.unisa.POO.country;

public class CountryTest 
{
	public static void main(String[] args) 
	{
		DataSet ds=new DataSet();
		ds.add(new Country("Giappone",325));
		ds.add(new Country("Italia",700));
		ds.add(new Country("Spagna",600));
		Country max= (Country) ds.getMaximum();
		System.out.println(max);
	}
}