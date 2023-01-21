package it.unisa.POO.square;

import java.util.Scanner;

public class SquareTester 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Inserisi numero righe/colonne");
		int n=in.nextInt();
		Square q=new Square(n);
		q.insertNumber(in);
		q.sommaRighe();
		q.verificaMagia();
	}

}
