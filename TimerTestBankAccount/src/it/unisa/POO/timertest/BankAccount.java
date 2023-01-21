package it.unisa.POO.timertest;

public class BankAccount 
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

	private int accountNumber;
	private double balance;
}