
public class Messaggio {
	String text,destinatario,mittente;
	
	public Messaggio(String text,String mittente,String destinatario) {
		this.text=text;
		this.mittente=mittente;
		this.destinatario=destinatario;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getMittente() {
		return mittente;
	}

	public void setMittente(String mittente) {
		this.mittente = mittente;
	}
	
	
}
