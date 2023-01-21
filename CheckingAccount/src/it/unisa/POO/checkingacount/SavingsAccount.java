package it.unisa.POO.checkingacount;

public class SavingsAccount extends BankAccount
{
	public SavingsAccount (double initialRate)
	{
		interestRate=initialRate;
	}

	public void addInterest()
	{
		double rate=(getBalance()*interestRate)/100;
		deposit(rate);
	}

	private double interestRate;
}