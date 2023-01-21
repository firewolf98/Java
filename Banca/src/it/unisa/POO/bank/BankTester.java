package it.unisa.POO.bank;

public class BankTester {

	public static void main(String[] args) 
	{
		Bank b=new Bank();
		BankAccount uno=new BankAccount(123,500);
		BankAccount due=new BankAccount(124, 1000);
		BankAccount tre=new BankAccount(125, 300);
		b.addAccount(uno);
		b.addAccount(due);
		b.addAccount(tre);
		System.out.print(b.getBalance(123));
		System.out.print(b.getBalance(124));
		System.out.print(b.getBalance(125));
		b.deposit(123, 500);
		b.deposit(124, 500);
		b.deposit(125, 500);
		System.out.print(b.getBalance(123));
		System.out.print(b.getBalance(124));
		System.out.print(b.getBalance(125));
		b.withdraw(123,500);
		b.withdraw(124,500);
		b.withdraw(125,500);
		System.out.print(b.getBalance(123));
		System.out.print(b.getBalance(124));
		System.out.print(b.getBalance(125));
		b.transfer(124, 125, 400);
		System.out.print(b.getBalance(123));
		System.out.print(b.getBalance(124));
		System.out.print(b.getBalance(125));
	}

}
