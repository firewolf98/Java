package it.unisa.POO.ospedale;

public class Testing 
{
	public static void main(String[] args) 
	{
		AziendaOspedaliera a=new AziendaOspedaliera();
		MedicoGenerico m1=new MedicoGenerico(1,"luca","esposito");
		MedicoSpecialista m2=new MedicoSpecialista(2,"mario","rossi","cardiologo");
		MedicoGenerico m3=new MedicoGenerico(3,"luca","bianchi");
		MedicoSpecialista m4=new MedicoSpecialista(4,"fabio","rossi","chirurgo");
		Cliente c1=new Cliente("C01",0);
		Cliente c2=new Cliente("C02",0);
		
		a.aggiungiMedico(m1);
		a.aggiungiMedico(m2);
		a.aggiungiMedico(m3);
		a.aggiungiMedico(m4);
		a.aggiungiPaziente(c1);
		a.aggiungiPaziente(c2);
		
		a.visita(3,"C01");
		c1.getNumInt();
		m3.getNumVisite();
		
		a.visita(4,"C01");
		c1.getNumInt();
		m3.getNumVisite();
	}
}