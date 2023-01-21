import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Starter
{
	public static void main(String[] args) throws FileNotFoundException, IOException, PesoMaxSuperatoException 
	{
		SlittaDiBabboNatale s=new SlittaDiBabboNatale(50);
		Random r=new Random();
		Scanner in=new Scanner(System.in);
		File f=new File("Bambini.txt");
		ArrayList<String> bambini=new ArrayList<String>();
		for(int i=0;i<r.nextInt(6);i++)
		{
			int x=r.nextInt(3);
			String c="";
			if(x==0)
				c="Nord";
			else if(x==1)
				c="Centro";
			else
				c="Sud";
			String nome=in.next();
			s.aggiungiRegalo(new RegaloBambino(null,r.nextInt(21),c,nome,r.nextInt(10),in.next()));
			bambini.add(nome);
		}
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(f));
		o.writeObject(bambini);
		System.out.println("Adulti:");
		for(int i=0;i<r.nextInt(6);i++)
		{
			int x=r.nextInt(3);
			String c="";
			if(x==0)
				c="Nord";
			else if(x==1)
				c="Centro";
			else
				c="Sud";
			s.aggiungiRegalo(new RegaloAdulto(null,r.nextInt(31),c,in.next()));
		}
		System.out.println(s.calcolaCosto());
		System.out.println(s.spedisci());
		System.out.println("Inserisci il nome di un bambino:");
		String result=in.next();
		int v=0;
		for(int j=0;j<bambini.size();j++)
			if(bambini.get(j).equals(result))
				v=1;
		if(v==1)
			System.out.println("Il bambino è nella lista");
		else
			System.out.println("Il bambino non è nella lista");
	}
}