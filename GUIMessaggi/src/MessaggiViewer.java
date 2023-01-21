import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.JFrame;

public class MessaggiViewer 
{
	public static void main(String[] args) 
	{
		ArrayList<Messaggio> am=new ArrayList<Messaggio>();
		am.add(new Messaggio(1,"mario",new GregorianCalendar(23,5,2018),"ciao"));
		am.add(new Messaggio(2,"luigi",new GregorianCalendar(15,2,2018),"come va?"));
		am.add(new Messaggio(3,"paolo",new GregorianCalendar(17,6,2018),"ehy"));
		
		MessaggiFrame frame=new MessaggiFrame(am);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}