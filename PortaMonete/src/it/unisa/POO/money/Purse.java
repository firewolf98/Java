package it.unisa.POO.money;
import java.util.ArrayList;

public class Purse 
{
	public Purse()
	{
		coins = new ArrayList<Coin>();
	}

	public void add(Coin aCoin)
	{
		coins.add(aCoin);
	}

	public double getTotal()
	{
		double total = 0;
		for(int i = 0; i < coins.size(); i++)
		{
			Coin aCoin = coins.get(i);
			total = total + aCoin.getValue();
		}
		return total;
	}

	public boolean find(Coin aCoin)
	{
		for(Coin c: coins)
		{
			if(c.equals(aCoin))
				return true;
		}
		return false;
	}

	public int count(Coin aCoin)
	{
		int matches=0;
		for(Coin c:coins)
		{
			if(c.equals(aCoin))
				matches++;
		}
		return matches;
	}

	public Coin getMaxinum()
	{
		Coin max=coins.get(0);
		for(Coin c:coins)
		{
			if (c.getValue()>max.getValue())
				max=c;
		}
		return max;
	}

	public Coin getMininum()
	{
		if(coins.size()==0)
			return null;
		Coin min=coins.get(0);
		for(Coin c:coins)
		{
			if(c.getValue()<min.getValue())
				min=c;
		}
		return min;
	}

	public void remove(Coin aCoin)
	{
		for(int i = 0; i < coins.size(); i++)
		{
			if(coins.get(i)==aCoin)
				coins.remove(aCoin);
		}
	}
	
	public boolean hasCoin(Coin aCoin)
	{
		for(int i = 0; i < coins.size(); i++)
		{
			if(coins.get(i)==aCoin)
			{
				return true;
			}
		}
		return false;
	}
	
	public String toString()
	{
		String frase;
		double s=0,q=0,d=0,c=0,n=0;
		for(int i=0;i < coins.size();i++)
		{
			switch(coins.get(i).getName())
			{
				case "Dollar" : s=s+coins.get(i).getValue(); break;
				case "Quarter" : q=q+coins.get(i).getValue(); break;
				case "Dime" : d=d+coins.get(i).getValue(); break;
				case "Nickel" : n=n+coins.get(i).getValue(); break;
				case "Cent" : c=c+coins.get(i).getValue(); break;
			}
		}
		frase="Purse[Dollar="+s+"Quarter="+q+"Dime="+d+"Nickel="+n+"Cent="+c+"]";
		return frase;
	}
	
	private ArrayList<Coin> coins;

}
