package it.unisa.POO.dataset;

import java.util.Scanner;

public class DataSetTest {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		DataSet ds = new DataSet();
		boolean done = false;
		while (!done)
		{
			String x = input.nextLine();
			if (x.equalsIgnoreCase("fine"))
					done = true;
			else
					ds.add(Double.parseDouble(x));
		}
		System.out.println("la media e`:"+ ds.getAverage());
		input.close();
	}
}