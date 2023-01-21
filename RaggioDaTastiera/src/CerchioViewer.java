import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CerchioViewer 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		final int FRAME_WIDTH = 300;
		final int FRAME_HEIGHT = 400;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Cerchio");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String s=JOptionPane.showInputDialog(null,"Inserisci raggio");
		double d=Double.parseDouble(s);
		CerchioComponent component = new CerchioComponent(d);
		frame.add(component);
		frame.setVisible(true);
	}
}