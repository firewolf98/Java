import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CerchioFrame extends JFrame
{
	public CerchioFrame(Double d)
	{
		cerchio=new CerchioComponent(d);
		createRadiusField();
		createPanel();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	public void createRadiusField()
	{
		
	}
	
	public void createPanel()
	{
		JPanel panel = new JPanel();
		
		add(panel);
	}
	
	CerchioComponent cerchio;
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 500;
}
