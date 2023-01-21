package it.unisa.POO.relazionidataset;

import java.util.*;

public class DataSetTest 
{
	public static void main(String[] args) 
	{	
		class StringLength implements Comparator
		{
			public int compare(Object o,Object o1)
			{
				String s=(String)o;
				String s1=(String)o1;
				if(s.length()<s1.length())
					return -1;
				else if(s.length()>s1.length())
					return 1;
				return 0;
			}
		}
		
		class StringOrdine implements Comparator
		{
			public int compare(Object o,Object o1)
			{
				String s=(String)o;
				String s1=(String)o1;
				return s.compareTo(s1);
			}
		}
		
		Comparator c=new StringLength();
		Comparator c1=new StringOrdine();
		DataSet ds = new DataSet(c);
		DataSet ds1= new DataSet(c1);
		Scanner in=new Scanner(System.in);
		String s;
		for(int i=0;i<3;i++)
		{
			s=in.next();
			ds.add(s);
			ds1.add(s);
		}
		System.out.println("Parola più corta = "+ ds.getMinimum());
		System.out.println("Parola più lunga = "+ ds.getMaximum());
		System.out.println("Prima parola = "+ ds1.getMinimum());
		System.out.println("Ultima parola = "+ ds1.getMaximum());
	}
}