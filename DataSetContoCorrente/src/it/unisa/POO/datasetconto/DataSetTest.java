package it.unisa.POO.datasetconto;

public class DataSetTest {

	public static void main(String[] args) 
	{
		DataSet bankData = new DataSet();
		bankData.add(new BankAccount(1,0));
		bankData.add(new BankAccount(2,10000));
		bankData.add(new BankAccount(3,2000));
		System.out.println("Saldo medio = "+ bankData.getAverage());
		System.out.println("Saldo più alto = "+ bankData.getMaximum().getBalance());
	}
}