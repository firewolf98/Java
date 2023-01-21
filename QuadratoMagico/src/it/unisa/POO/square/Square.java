package it.unisa.POO.square;

import java.util.Scanner;

public class Square 
{
	public Square(int n)
	{
	Array=new int[n][n];
	elem=n;
	Somma=new int[2*n+2];
	}
	
	public void insertNumber(Scanner in)
	{
		int x=0;
		for(int i=0;i<elem;i++)
			for(int j=0;j<elem;j++)
			{
				System.out.println("Inserisci numero:");
				x=in.nextInt();
				if(verifica(x))
					Array[i][j]=x;
				else
				{
					System.out.println("Numero non valido");
					j--;
				}
			}
		
	}
	
	public boolean verifica(int x)
	{
		for(int i=0;i<elem;i++)
			for(int j=0;j<elem;j++)
				if(Array[i][j]==x)
					return false;
				
		return true;
	}
	
	public void sommaRighe()
	{
		int temp=0,sumr=0;
		for(int i=0;i<elem;i++)
		{
			for(int j=0;j<elem;j++)
			{
				sumr=sumr+Array[i][j];
				if(i==j)
					temp=temp+Array[i][j];
			}
			Somma[i]=sumr;
			sumr=0;
		}
		Somma[elem]=temp;
		//temp=0;
		for(int j=0;j<elem;j++)
		{
			for(int i=0;i<elem;i++)
			{
				sumr=sumr+Array[i][j];
				
			}
			Somma[j+elem+1]=sumr;
			sumr=0;
		}
		
		Somma[elem+elem+1]=temp;
		
	}
	
	public void verificaMagia()
	{
		int cont=0;
		for(int i=0;i<(elem+elem+1);i++)
			if(Somma[i]==Somma[i+1])
				cont++;
		if(cont==(2*elem+1))
			System.out.println("Il quadrato è magico");
		else
			System.out.println("Il quadrato non è magico");
	}
	
	private int[] Somma;
	private int elem;
	private int[][] Array;
}