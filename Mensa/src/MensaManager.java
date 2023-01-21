import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MensaManager 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner in=new Scanner(System.in);
		Mensa m=new Mensa();
		File f=new File("file.txt");
				
		Piatto p1=new Piatto("Pasta al sugo",449,2.5);
		Piatto p2=new Piatto("Risotto alla pescatora",320,4);
		Piatto p3=new Piatto("Carne alla griglia",260,5.5);
		Piatto p4=new Piatto("Pesce al vapore",348,6.5);
		Piatto p5=new Piatto("Mozzarella",275,5);
		Piatto p6=new Piatto("Insalata",98,2);
				
		m.addPiatto(p1);
		m.addPiatto(p2);
		m.addPiatto(p3);
		m.addPiatto(p4);
		m.addPiatto(p5);
		m.addPiatto(p6);
		
		for(int i=0;i<5;i++)
		{
			String login,password,cognome,nome;
			double credito;
			ArrayList<PastoAcquistato> p=null;
			System.out.println("Inserisci login");
			login=in.next();
			System.out.println("Inserisci password");
			password=in.next();
			System.out.println("Inserisci cognome");
			cognome=in.next();
			System.out.println("Inserisci nome");
			nome=in.next();
			System.out.println("Inserisci credito");
			credito=in.nextDouble();
			Cliente c=new Cliente(login,password,cognome,nome,credito,p);
			m.addCliente(c);
		}
	
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(f));
	
			o.writeObject(m);
		
	}
}