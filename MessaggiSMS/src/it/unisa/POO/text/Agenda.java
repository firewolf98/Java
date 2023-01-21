package it.unisa.POO.text;

import java.util.*;

public class Agenda 
{
	public Agenda()
	{
		messages=new ArrayList<Messaggio>();
	}
	
	public void addMessage(Scanner in)
	{
		int cod=in.nextInt();
		String mitt=in.next();
		String text=in.next();
		String date=in.next();
		messages.add(new Messaggio(cod,mitt,text,date));
	}
	
	public void getListByDate()
	{
		Messaggio temp=new Messaggio();
		for(int i=0;i<messages.size();i++)
		{
			
		}
	}
	
	public void getListBySender()
	{
		for(int i=0;i<messages.size();i++)
		{
			
		}
	}
	
private ArrayList<Messaggio> messages;
}