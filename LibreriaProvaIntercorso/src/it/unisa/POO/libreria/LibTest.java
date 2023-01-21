package it.unisa.POO.libreria;

import java.io.*;
import java.util.*;

public class LibTest 
{
	public static void main(String[] args) throws Exception 
	{
			int i;
			ArrayList<Libro> al=new ArrayList<Libro>();
			File f=new File("file.txt");
			Scanner in=new Scanner(f);
			Libreria l=new Libreria();
			for(i=0;i<5;i++)
				l.addBook(in);
			
			al=l.searchBookByAutore("Camilleri Andrea");
			for(i=0;i<al.size();i++)
			{
				System.out.println("Titolo: "+al.get(i).getTitolo());
				System.out.println("Autore: "+al.get(i).getAutore());
				System.out.println("Editore: "+al.get(i).getEditore());
				System.out.println("Num Copie: "+al.get(i).getNumCopie());
			}
			
			al=l.searchStringBook("sogni");
			for(i=0;i<al.size();i++)
			{
				System.out.println("Titolo: "+al.get(i).getTitolo());
				System.out.println("Autore: "+al.get(i).getAutore());
				System.out.println("Editore: "+al.get(i).getEditore());
				System.out.println("Num Copie: "+al.get(i).getNumCopie());
			}
			
			al=l.searchStringBook("Sogni");
			for(i=0;i<al.size();i++)
			{
				System.out.println("Titolo: "+al.get(i).getTitolo());
				System.out.println("Autore: "+al.get(i).getAutore());
				System.out.println("Editore: "+al.get(i).getEditore());
				System.out.println("Num Copie: "+al.get(i).getNumCopie());
			}
			
			Libro lib=l.searchCopieMax();
			System.out.println("Titolo: "+lib.getTitolo());
			System.out.println("Autore: "+lib.getAutore());
			System.out.println("Editore: "+lib.getEditore());
			System.out.println("Num Copie: "+lib.getNumCopie());
			
			al=l.searchCopieSoglia(15);
			for(i=0;i<al.size();i++)
			{
				System.out.println("Titolo: "+al.get(i).getTitolo());
				System.out.println("Autore: "+al.get(i).getAutore());
				System.out.println("Editore: "+al.get(i).getEditore());
				System.out.println("Num Copie: "+al.get(i).getNumCopie());
			}
			l.edit(30,"Fai bei sogni",f);
	}
}