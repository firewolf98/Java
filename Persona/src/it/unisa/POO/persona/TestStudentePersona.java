package it.unisa.POO.persona;

import java.util.*;

public class TestStudentePersona 
{
	public static void main(String[] args) 
	{
		ArrayList<Persona> list=new ArrayList<Persona>();
		Persona a=new Studente("Luca",1998,"Triennale Informatica");
		list.add(a);
		Persona b=new Insegnante("Tizio",1960,100);
		list.add(b);
		for(Persona persona: list)
		{
			if(persona instanceof Studente)
			{
				System.out.println("Sono uno studente");
				Studente stud=(Studente) persona;
				System.out.println(stud.getSpecializzazione());
			}
			else if(persona instanceof Insegnante)
			{
				System.out.println("Sono un insegnante");
				Insegnante ins=(Insegnante) persona;
				System.out.println(ins.getStipendio());
			}
		}
	}
}