package it.unisa.POO.cars;

import java.util.*;

public class Dealership 
{
	public Dealership()
	{
		cars=new ArrayList<Car>();
	}
	
	public void addCar(Scanner in)
	{
		String m=in.next();
		String d=in.next();
		int a=in.nextInt();
		int c=in.nextInt();
		cars.add(new Car(m,d,a,c));
	}
	
	public boolean searchCar(String name,String mode)
	{
		for (int i=0;i<cars.size();i++)
			if(cars.get(i).getName().equals(name) && cars.get(i).getMode().equals(mode))
				return true;
		return false;
	}
	
	public boolean searchCarYear(String name,String mode,int year)
	{
		for (int i=0;i<cars.size();i++)
			if(cars.get(i).getName().equals(name) && cars.get(i).getMode().equals(mode) && cars.get(i).getYear()>year)
				return true;
		return false;
	}
	
	public boolean searchCarPrice(String name,String mode,int prezmin,int prezmax)
	{
		for (int i=0;i<cars.size();i++)
			if(cars.get(i).getName().equals(name) && cars.get(i).getMode().equals(mode) && cars.get(i).getPrezzo()>=prezmin && cars.get(i).getPrezzo()<=prezmax)
				return true;
		return false;
	}
	
	private ArrayList<Car> cars;
}