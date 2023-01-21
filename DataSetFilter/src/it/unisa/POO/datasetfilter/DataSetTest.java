package it.unisa.POO.datasetfilter;

public class DataSetTest {

	public static void main(String[] args) 
	{
		Filter f=new BankAccount(156,1000);
		Measurer m=new BankAccount(123);
		DataSet ds = new DataSet(m,f);
		ds.add(new BankAccount(1,0));
		ds.add(new BankAccount(2,10000));
		ds.add(new BankAccount(3,2000));
		System.out.println("Saldo medio = "+ ds.getAverage());
		BankAccount max =(BankAccount) ds.getMaximum();
		System.out.println("Saldo piu` alto = "+ max);
	}
}