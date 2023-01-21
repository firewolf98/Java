package it.unisa.POO.savingsaccountereditarietà;

public class BankAccount 
{
	public BankAccount()
	{
		balance=0;
		accountNumber=0;	
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

	private int accountNumber;
	private double balance;
}