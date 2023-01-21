package it.unisa.POO.quiz;

public class Quiz implements Measurable
{
	public Quiz(int punt,String puntlet)
	{
		punteggio=punt;
		punteggiolettere=puntlet;
	}
	
	public double getMeasure()
	{
		return punteggio;
	}
	
	public double getPunteggio()
	{
		return punteggio;
	}
	
	public String getPunteggioLettere()
	{
		return punteggiolettere;
	}
	
	private double punteggio;
	private String punteggiolettere;
}