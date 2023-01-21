package it.unisa.POO.ospedale;

import java.util.*;

public class MedicoSpecialista extends Medico
{
	public MedicoSpecialista(int codice,String nome,String cognome,String specializzazione)
	{
		super(codice,nome,cognome);
		special=specializzazione;
		numVisite=0;
		clienti=new ArrayList<Cliente>();
	}
	
	public void visita(Cliente c)
	{
		clienti.add(c);
		numVisite++;
		super.setNumVisite();
	}
	
	public void opera(Cliente c)
	{
		for(int i=0;i<clienti.size();i++)
			if(clienti.get(i).getCodice().equals(c.getCodice()))
			{
				clienti.remove(c);
				c.setNumInterventi();
			}
	}
	
	public int getNumVisite()
	{
		return numVisite;
	}
	
	public String getSpecializzazione()
	{
		return special;
	}
	
	private ArrayList<Cliente> clienti;
	private int numVisite;
	private String special;
}