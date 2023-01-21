import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Tester 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Scanner in=new Scanner(System.in);
		int id=0,anno=0,mese=0,giorno=0;
		String text="",mitt="";
		AgendaMultimediale am=new AgendaMultimediale();
		File f=new File("file.txt");
		int risp=1;
		while(risp>0)
		{
			System.out.println("Cosa vuoi fare?"+"\n 1-Aggiungi Messaggio"+"\n 0-Esci");
			risp=in.nextInt();
			switch(risp)
			{
			case 1:
				System.out.println("Inserisci l'ID");
				id=in.nextInt();
				System.out.println("Inserisci Mittente");
				mitt=in.next();
				System.out.println("Inserisci giorno,mese,anno");
				giorno=in.nextInt();
				mese=in.nextInt();
				anno=in.nextInt();
				GregorianCalendar g=new GregorianCalendar(anno, mese, giorno);
				System.out.println("Inserisci testo");
				text=in.next();
				Messaggio m=new Messaggio(id,mitt,g,text);
				am.addMessage(m);
			}
		}
		
		if(f.exists())
		{
			ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(f));
			for(int i=0;i<am.getSize();i++)
				o.writeObject(am.getMessaggi().get(i));
		}
		
		
	}
}