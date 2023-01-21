package it.unisa.POO.savingsaccount;

public class SavingsAccount 
{
	public SavingsAccount()
	{
		balance=0;	
		interestRate=0;
	}

	public SavingsAccount (double initialBalance,double initialRate)
	{
		balance=initialBalance;
		interestRate=(int)initialRate;
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

	public void addInterest()
	{
		double rate=(balance*interestRate)/400;
		balance=balance+rate;
	}

	private double balance;
	private double interestRate;
}