import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFrame;

public class MensaViewer 
{
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException  
	{
		MensaFrame frame=new MensaFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}