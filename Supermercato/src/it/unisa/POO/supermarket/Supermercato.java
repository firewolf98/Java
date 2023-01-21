package it.unisa.POO.supermarket;

import java.util.ArrayList;
import java.util.Comparator;

public class Supermercato 
{
	public Supermercato(Comparator<Prodotto> prod)
	{
		products=new ArrayList<Prodotto>();
		prodt=prod;
	}
	
	public void addProdotto(Prodotto p)
	{
		for(int i=0;i<products.size();i++)
			if(prodt.compare((Prodotto) prodt,products.get(i))<0)
			{
				products.add(p);
				return;
			}
		products.add(p);
	}

	public String daiTipoProdotto(int i)
	{
		for(int j=0;j<products.size();j++)
			if(i==j)
				if(products.get(j) instanceof Alimentare)
					return "Alimentare";
		return "Elettronico";
	}
	
	public Prodotto getMassimo()
	{
		Prodotto temp=products.get(0);
		for(int i=0;i<products.size();i++)
			if(products.get(i).getPrezzo()>temp.getPrezzo())
				temp=products.get(i);
		return temp;
	}
	
	public Prodotto getMinimo()
	{
		Prodotto temp=products.get(0);
		for(int i=0;i<products.size();i++)
			if(products.get(i).getPrezzo()<temp.getPrezzo())
				temp=products.get(i);
		return temp;
	}
	
	public ArrayList<Prodotto> cerca(String marca)
	{
		ArrayList<Prodotto> temp=new ArrayList<Prodotto>();
		for(int i=0;i<products.size();i++)
			if(products.get(i).getMarca().equals(marca))
				temp.add(products.get(i));
		return temp;
	}
	
	private ArrayList<Prodotto> products;
	private Comparator<Prodotto> prodt;
}