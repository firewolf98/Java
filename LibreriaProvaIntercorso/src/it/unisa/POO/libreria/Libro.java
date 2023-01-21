package it.unisa.POO.libreria;

public class Libro 
{
	public Libro(String titolo,String autore,String editore,int numcopie)
	{
		tit=titolo;
		aut=autore;
		edit=editore;
		num=numcopie;
	}
	
	public String getTitolo()
	{
		return tit;
	}
	
	public String getAutore()
	{
		return aut;
	}
	
	public String getEditore()
	{
		return edit;
	}
	
	public int getNumCopie()
	{
		return num;
	}
	
	public void newCopie(int nnc)
	{
		num=num+nnc;
	}
	
	private String tit,aut,edit;
	int num;
}