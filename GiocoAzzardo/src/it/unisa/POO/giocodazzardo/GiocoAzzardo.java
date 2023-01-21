package it.unisa.POO.giocodazzardo;

import java.util.*;

public abstract class GiocoAzzardo 
{
	public GiocoAzzardo(double costo)
	{
		r=new Random();
		this.costo=costo;
	}
	
	public Random generatore()
	{
		return r;
	}
	
	public double getCosto()
	{
		return costo;
	}
	
	public abstract boolean gioca();
	public abstract double dammiVincita();
	
	private Random r;
	private double costo;
}