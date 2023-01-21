package it.unisa.POO.cars;

import java.util.*; 
import java.io.File;

public class CarTest 
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("file1.txt");
		Scanner in=new Scanner(f);
		Scanner un=new Scanner(System.in);
		Dealership d=new Dealership();
		d.addCar(in);
		d.addCar(in);
		d.addCar(in);
		d.addCar(in);
		d.addCar(in);
		d.addCar(in);
		d.addCar(in);
		System.out.println("Inserisci marca dell'auto da cercare");
		String s1=un.next();
		System.out.println("Inserisci modello dell'auto da cercare");
		String s2=un.next();
		if(d.searchCar(s1,s2))
			System.out.println("L'auto è presente");
		else
			System.out.println("L'auto non è presente");
		System.out.println("Inserisci marca dell'auto da cercare");
		s1=un.next();
		System.out.println("Inserisci modello dell'auto da cercare");
		s2=un.next();
		System.out.println("Inserisci anno minimo dell'auto");
		int an=un.nextInt();
		if(d.searchCarYear(s1,s2,an))
			System.out.println("L'auto è presente");
		else
			System.out.println("L'auto non è presente");
		System.out.println("Inserisci marca dell'auto da cercare");
		s1=un.next();
		System.out.println("Inserisci modello dell'auto da cercare");
		s2=un.next();
		System.out.println("Inserisci prezzo minimo");
		int p1=un.nextInt();
		System.out.println("Inserisci prezzo massimo");
		int p2=un.nextInt();
		if(d.searchCarPrice(s1,s2,p1,p2))
			System.out.println("L'auto è presente");
		else
			System.out.println("L'auto non è presente");
		un.close();
	}

}
