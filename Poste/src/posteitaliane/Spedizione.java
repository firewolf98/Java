package posteitaliane;

import java.util.*;

public abstract class Spedizione 
{
	String partenza, destinazione;
	ArrayList<String> percorso;
	
	public Spedizione(String partenza, String destinazione) {
		this.partenza=partenza;
		this.destinazione=destinazione;
		this.percorso=new ArrayList<>();
	}
	
	public abstract void spedisci();
	public abstract double dammiCosto();

	public ArrayList<String> getPercorso(){
		return this.percorso;
	}
	
	public String toString() {
		return "[partenza=" + partenza + ", destinazione=" + destinazione + " Percorso: "+percorso.toString()+ "]";
	}

	public String getPartenza() {
		return partenza;
	}

	public String getDestinazione() {
		return destinazione;
	}
}