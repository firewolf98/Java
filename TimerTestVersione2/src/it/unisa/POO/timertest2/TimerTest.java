package it.unisa.POO.timertest2;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

public class TimerTest 
{
	public static void main(String[] args) 
	{
		InterestAdder listener = new InterestAdder(new BankAccount(1,1000));
		Timer t = new Timer(listener);
		t.start();
		JOptionPane.showMessageDialog(null, "Quit?"); 
		System.exit(0);
	}
}