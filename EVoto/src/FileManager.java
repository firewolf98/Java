import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileManager 
{
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f=new File("universita.txt");
		Universit� u=new Universit�();
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(f));
		o.writeObject(u);
	}
}