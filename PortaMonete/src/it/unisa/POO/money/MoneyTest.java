package it.unisa.POO.money;

public class MoneyTest 
{
	public static void main(String[] args) 
	{
		Purse p=new Purse();
		Coin c=new Coin(30,"Dime");
		Coin m=new Coin(50,"Quarter");
		Coin n=new Coin(70,"Nickel");
		p.add(c);
		p.add(m);
		System.out.print(p.getTotal());
		if(p.hasCoin(n))
			System.out.println("SI");
		else
			System.out.println("NO");
		p.remove(m);
		if(p.hasCoin(m))
			System.out.println("SI");
		else
			System.out.println("NO");
		System.out.print(p.toString());
	}
}