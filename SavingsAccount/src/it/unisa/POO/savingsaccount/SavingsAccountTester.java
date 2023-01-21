package it.unisa.POO.savingsaccount;

public class SavingsAccountTester 
{
	public static void main(String[] args) 
	{
		SavingsAccount x=new SavingsAccount(300,5);
		System.out.println(x.getBalance());
		x.deposit(2000);
		System.out.println(x.getBalance());	
		x.withdraw(150);
		System.out.println(x.getBalance());
		x.addInterest();
		System.out.println(x.getBalance());
	}
}