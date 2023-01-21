package posteitaliane;

public class SpedizioneNazionale extends Spedizione
{
public static final String[] listaC= {"Palermo", "Reggio Calabria", "Salerno", "Napoli", "Roma", "Firenze", "Bologna", "Milano", "Torino", "Aosta"};
	
	public SpedizioneNazionale(String partenza, String destinazione) {
		super(partenza, destinazione);
	}
	
	public void spedisci() {
		int i;
		boolean trovato=false;
		for (i=0;i<listaC.length&&!trovato;i++) {
			if (listaC[i].equalsIgnoreCase(super.partenza))
				trovato=true;
		}
		super.getPercorso().add(super.partenza);
		while(i<listaC.length) {
			super.getPercorso().add(listaC[i]);
			if (listaC[i].equalsIgnoreCase(super.destinazione))
				return;
			i++;
		}
	}
	
	public double dammiCosto() {
		return (super.getPercorso().size()-1)*3;
	}
	
	public String toString() {
		return "SpedizioneNazionale "+super.toString()+ " costo: "+this.dammiCosto();
	}
}