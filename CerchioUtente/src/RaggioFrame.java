import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RaggioFrame extends JFrame
{
	public RaggioFrame()
	{
		createRadiusField();
		createButton();
		createPanel();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	public void createRadiusField()
	{
		radiusLabel = new JLabel("Radius: ");
		final int FIELD_WIDTH = 10;
		radiusField = new JTextField(FIELD_WIDTH);
		radiusField.setText("");
	}
	
	public void createPanel()
	{
		JPanel panel = new JPanel();
		panel.add(radiusLabel);
		panel.add(radiusField);
		panel.add(button);
		add(panel);
	}
	
	public void createButton()
	{
		button = new JButton("Invio");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				String s=radiusField.getText();
				d=Double.parseDouble(s);
				CerchioFrame frame=new CerchioFrame(d);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}	
		}
	}
	
	private Double d;
	private JButton button;
	private JLabel radiusLabel;
	private JTextField radiusField;
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 200;
}