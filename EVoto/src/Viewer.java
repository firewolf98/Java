import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;

public class Viewer 
{
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException 
	{
		LoginFrame frame=new LoginFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}