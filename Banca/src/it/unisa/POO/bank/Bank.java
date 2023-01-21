package it.unisa.POO.bank;

import java.util.ArrayList;

public class Bank 
{
	public Bank()
	{
		accounts=new ArrayList<BankAccount>();
	}
	
	public void addAccount(BankAccount b)
	{
		accounts.add(b);
	}
	
	public void deposit(int account,double amount)
	{
		for(int i=0;i < accounts.size();i++)
		{
			if(accounts.get(i).getAccountNumber()==account)
				accounts.get(i).deposit(amount);
		}
	}
	
	public void withdraw(int account,double amount)
	{
		for(int i=0;i < accounts.size();i++)
		{
			if(accounts.get(i).getAccountNumber()==account)
				accounts.get(i).withdraw(amount);
		}
	}
	
	public double getBalance(int account)
	{
		double x=0;
		for(int i=0;i < accounts.size();i++)
		{
			if(accounts.get(i).getAccountNumber()==account)
				x=accounts.get(i).getBalance();
		}
		return x;
	}
	
	public void transfer(int fromAccount,int toAccount, double amount)
	{
		for(int i=0;i < accounts.size();i++)
		{
			if(accounts.get(i).getAccountNumber()==fromAccount)
				accounts.get(i).withdraw(amount);
			if(accounts.get(i).getAccountNumber()==toAccount)
				accounts.get(i).deposit(amount);
		}
	}
	
	private ArrayList<BankAccount> accounts;
}
