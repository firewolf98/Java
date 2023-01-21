package posteitaliane;

import java.util.*;

public class SpedizioneInternazionale extends Spedizione
{
	public SpedizioneInternazionale(String partenza, String destinazione) {
		super(partenza, destinazione);
	}
	
	public void spedisci() {
		super.getPercorso().add(super.partenza);
		boolean trovato=false;
		Random r=new Random();
		int x;
		while(!(listaAeroporti[x=r.nextInt(8)].equalsIgnoreCase(super.destinazione))){
			for (String a:super.getPercorso()) {
				if (a.equalsIgnoreCase(listaAeroporti[x]))
					trovato=true;
			}
			if (!trovato)
				super.getPercorso().add(listaAeroporti[x]);
		}
		super.getPercorso().add(super.destinazione);
	}
	
	
	public double dammiCosto() {
		return (super.getPercorso().size()-1)*20;
	}
	
	
	public String toString() {
		return "SpedizioneInternazionale "+super.toString()+ " costo: "+this.dammiCosto();
	}



	public static final String [] listaAeroporti= {"Londra", "Parigi", "Roma", "Berlino", "Madrid", "Lisbona", "Amsterdam", "Mosca"};
}