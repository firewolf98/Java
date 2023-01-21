package it.unisa.POO.ospedale;

import java.util.*;

public class MedicoGenerico extends Medico
{
	public MedicoGenerico(int codice,String nome,String cognome)
	{
		super(codice,nome,cognome);
		numVisite=0;
		clienti=new ArrayList<Cliente>();
		cure=new ArrayList<String>();
	}
	
	public void setCure()
	{
		cure.add("Antibiotico");
		cure.add("Tachipirina");
		cure.add("Supposta");
		cure.add("Aspirina");
	}
	
	public void visita(Cliente c)
	{
		clienti.add(c);
		//Random r=new Random();
		numVisite++;
		super.setNumVisite();
		c.setCure(cure.get(1));
	}
	
	public int getNumVisite()
	{
		return numVisite;
	}
	
	private ArrayList<String> cure;
	private int numVisite;
	private ArrayList<Cliente> clienti;
}