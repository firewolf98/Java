import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileManager {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Albergo a=new Albergo();
		Stanza s=new Stanza(1,1,"Singola","Pranzo",1);
		Stanza s1=new Stanza(2,1,"Doppia","Cena",2);
		Stanza s2=new Stanza(3,1,"Matrimoniale","Pranzo",3);
		Stanza s3=new Stanza(4,2,"Singola","Colazione",4);
		a.addStanza(s);
		a.addStanza(s1);
		a.addStanza(s2);
		a.addStanza(s3);
		File f=new File("albergo.txt");
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(f));
		o.writeObject(a);
	}

}
