package it.unisa.POO.datasetcomparable;

public class DataSetTest 
{
	public static void main(String[] args) 
	{	
		DataSet ds = new DataSet();
		ds.add(new String("polimorfismo"));
		ds.add(new String("ciao"));
		ds.add(new String("intermilano"));
		Object min=ds.getMinimum();
		System.out.println("Ultima parola = "+ min);
		Object max = ds.getMaximum();
		System.out.println("Prima parola = "+ max);
	}
}