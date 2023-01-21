package it.unisa.POO.text;

public class Messaggio 
{
	public Messaggio()
	{
		id=0;
		mitt="";
		text="";
		data="";
	}
	
	public Messaggio(int cod,String mittente,String testo,String date)
	{
		id=cod;
		mitt=mittente;
		text=testo;
		data=date;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getText()
	{
		return text;
	}
	
	public String getDate()
	{
		return data;
	}
	
	public String getSender()
	{
		return mitt;
	}
	
	private int id;
	private String mitt,text,data;
}