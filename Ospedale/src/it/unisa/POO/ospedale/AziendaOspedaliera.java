package it.unisa.POO.ospedale;

import java.util.*;

public class AziendaOspedaliera 
{
	public AziendaOspedaliera()
	{
		dottori=new ArrayList<Medico>();
		pazienti=new ArrayList<Cliente>();
	}
	
	public void aggiungiMedico(Medico m)
	{
		dottori.add(m);
	}
	
	public void aggiungiPaziente(Cliente c)
	{
		pazienti.add(c);
	}
	
	public Medico medicoMaxVisite()
	{
		Medico temp=dottori.get(0);
		for(int i=0;i<dottori.size();i++)
			
			if(dottori.get(i).getNumVisite()>temp.getNumVisite())
				temp=dottori.get(i);
		return temp;
	}
	
	public void visita(int codice,String cod)
	{
		MedicoSpecialista temp=null;
		MedicoGenerico temp1=null;
		Cliente temp2=null;
		for(int j=0;j<pazienti.size();j++)
			if(pazienti.get(j).getCodice().equals(cod))
				temp2=pazienti.get(j);
		for (int i=0;i<dottori.size();i++)
			if(codice==dottori.get(i).getCodice())
			{
				if(dottori.get(i) instanceof MedicoSpecialista)
				{
					temp=(MedicoSpecialista)dottori.get(i);
					temp.visita(temp2);
				}
				else
				{
					temp1=(MedicoGenerico)dottori.get(i);
					temp1.visita(temp2);
				}
			}
	}
	
	private ArrayList<Medico> dottori;
	private ArrayList<Cliente> pazienti;
}