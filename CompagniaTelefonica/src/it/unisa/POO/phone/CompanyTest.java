package it.unisa.POO.phone;

import java.util.*;
import java.io.File;

public class CompanyTest 
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("file1.txt");
		Scanner in=new Scanner(f);
		Company c=new Company();
		c.addUtente(in);
		c.addUtente(in);
		c.addUtente(in);
		int u1=c.getPagatoPieno(123, 2)+c.getPagatoRidotto(123, 1);
		int u2=c.getPagatoPieno(124, 2)+c.getPagatoRidotto(124, 1);
		int u3=c.getPagatoPieno(125, 2)+c.getPagatoRidotto(125, 1);
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
	}

}
