package it.unisa.POO.libreria;

import java.io.File;
import java.io.PrintStream;
import java.util.*;

public class Libreria 
{
	public Libreria()
	{
		books=new ArrayList<Libro>();
	}

	public void addBook(Scanner in)
	{
		String t=in.nextLine();
		String a=in.nextLine();
		String e=in.nextLine();
		String n=in.nextLine();
		int n2=Integer.parseInt(n);
		books.add(new Libro(t,a,e,n2));
	}
	
	public ArrayList<Libro> searchBookByAutore(String autore)
	{
		ArrayList<Libro> bookaut=new ArrayList<Libro>();
		for(int i=0;i<books.size();i++)
			if(books.get(i).getAutore().equals(autore))
				bookaut.add(books.get(i));
		return bookaut;
	}
	
	public ArrayList<Libro> searchStringBook(String s)
	{
		ArrayList<Libro> bookaut=new ArrayList<Libro>();
		for(int i=0;i<books.size();i++)
			if(books.get(i).getAutore().contains(s))
				bookaut.add(books.get(i));
		return bookaut;
	}
	
	public Libro searchCopieMax()
	{
		Libro l=new Libro("","","",0);
		int max=0;
		for(int i=0;i<books.size();i++)
			if(books.get(i).getNumCopie()>max)
				l=books.get(i);
		return l;
	}
	
	public ArrayList<Libro> searchCopieSoglia(int soglia)
	{
		ArrayList<Libro> bookaut=new ArrayList<Libro>();
		for(int i=0;i<books.size();i++)
			if(books.get(i).getNumCopie()<=soglia)
				bookaut.add(books.get(i));
		return bookaut;
	}
	
	public void edit(int nnc,String titolo,File f) throws Exception
	{
		PrintStream p=new PrintStream(f);
		String t;
		for(int i=0;i<books.size();i++)
		{
			if(books.get(i).getAutore().equals(titolo))
			{	
				books.get(i).newCopie(nnc);
				System.out.println(books.get(i).getNumCopie());
			}
		}
		for(int i=0;i<books.size();i++)
		{
			p.println(books.get(i).getTitolo());
			p.println(books.get(i).getAutore());
			p.println(books.get(i).getEditore());
			p.println(books.get(i).getNumCopie());
		}
}
	
	private ArrayList<Libro> books;
}