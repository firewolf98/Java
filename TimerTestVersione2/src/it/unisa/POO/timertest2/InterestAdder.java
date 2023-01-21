package it.unisa.POO.timertest2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterestAdder implements ActionListener
{
	public InterestAdder(BankAccount b)
	{
		account=b;
	}
	
	public void actionPerformed(ActionEvent event)
	{
		double interest = account.getBalance() * RATE / 100;
		account.deposit(interest);
		System.out.println("Balance = " + account.getBalance());
	}
	
	private BankAccount account;
	private static final double RATE = 5;
}