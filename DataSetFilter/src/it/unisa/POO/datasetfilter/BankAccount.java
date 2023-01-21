package it.unisa.POO.datasetfilter;

public class BankAccount implements Measurer,Filter
{
	public BankAccount(int anAccountNumber)
	{
		balance=0;
		accountNumber=anAccountNumber;	
	}
	
	public BankAccount (int anAccountNumber,double initialBalance)
	{
		balance=initialBalance;
		accountNumber=anAccountNumber;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public void deposit (double amount)
	{
		double newBalance=balance+amount;
		balance=newBalance;
	}
	
	public void withdraw(double amount)
	{
		double newBalance=balance-amount;
		balance=newBalance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public double measure(BankAccount o)
	{
		return o.balance;
	}

	public boolean accept(BankAccount o)
	{
		if (o.balance<1000)
			return true;
		return false;
	}
	
	private int accountNumber;
	private double balance;
}