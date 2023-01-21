
public class start {

	public static void main(String[] args) {
		Persona mitt=new Persona("Luca","Esposito",21);
		Persona dest=new Persona ("Enrica","Razza",18);
		Messaggio m=new Messaggio("Ti amo!",mitt.getName(),dest.getName());
		System.out.println(m.getText());
		
		System.out.println(m.getDestinatario());
		System.out.println(m.getMittente());
		
		System.out.println(mitt.getAge());
		System.out.println(dest.getSurname());
	}

}
