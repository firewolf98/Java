package it.unisa.POO.phone;

import java.util.ArrayList;
import java.util.Scanner;

public class Company 
{
	public Company()
	{
		utenti=new ArrayList<Utente>();
	}
	
	public void addUtente(Scanner in)
	{
		int cod=in.nextInt();
		String m=in.next();
		String d=in.next();
		int a=in.nextInt();
		int c=in.nextInt();
		utenti.add(new Utente(cod,m,d,a,c));
	}
	
	public int getPagatoPieno(int codice,int prezzo)
	{
		for(int i=0;i<utenti.size();i++)
			if(utenti.get(i).getCodice()==codice)
				return prezzo*utenti.get(i).getMinutiPieni();
		return 0;
	}
	
	public int getPagatoRidotto(int codice,int prezzo)
	{
		int x=0,p=0;
		for(int i=0;i<utenti.size();i++)
			if(utenti.get(i).getCodice()==codice)
			{
				x= prezzo*utenti.get(i).getMinutiRidotti();
				p=x*30/100;
				return x-p;
			}
		return 0;
	}
	
	private ArrayList<Utente> utenti;
}