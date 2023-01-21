package it.unisa.POO.timertest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest 
{
	public static void main(String[] args) 
	{
		final BankAccount account = new BankAccount(1,1000);
		class InterestAdder implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				double interest = account.getBalance() * RATE / 100;
				account.deposit(interest);
				System.out.println("Balance = " + account.getBalance());
			}
		}
		InterestAdder listener = new InterestAdder();
		Timer t = new Timer(1000, listener); 
		t.start();
		JOptionPane.showMessageDialog(null, "Quit?"); 
		System.exit(0);
	}
		private static final double RATE = 5;
}