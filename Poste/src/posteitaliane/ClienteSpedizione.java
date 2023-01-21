package posteitaliane;

import java.util.*;

public class ClienteSpedizione 
{
	private String cf;
	private double saldo;
	private ArrayList<Spedizione> pacchi;
	
	public ClienteSpedizione(String cf, double saldo) {
		this.cf = cf;
		this.saldo = saldo;
		pacchi=new ArrayList<>();
	}
	
	public void aggiungiPacco(Spedizione x) {
		pacchi.add(x);
	}
	
	public void spedisci() {
		Spedizione x=pacchi.get(0);
		x.spedisci();
		if (saldo>0) {
			saldo-=x.dammiCosto();
		}
	}
	
	public ArrayList<Spedizione> getPacchi(){
		return pacchi;
	}

	public String toString() {
		return "ClienteSpedizione [cf=" + cf + ", saldo=" + saldo + "numero pacchi: "+pacchi.size()+"]";
	}
}