import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class ConvertitoreFrame extends JFrame
{
	public ConvertitoreFrame()
	{
		setTitle("Convertitore");
		createReset();
		createConverti();
		createPanel();
		setSize(300,200);
	}
	
	public void createPanel()
	{
		field=new JTextField(10);
		label=new JLabel("0");
		JPanel border=new JPanel();
		border.setBorder(new EtchedBorder());
		border.add(label);
		
		JPanel panel1=new JPanel();
		JLabel label1=new JLabel("Importo in euro: ");
		panel1.add(label1);
		panel1.add(field);
		
		JPanel panel2=new JPanel();
		panel2.add(reset);
		panel2.add(converti);
		
		JPanel panel3=new JPanel();
		JLabel testo=new JLabel("Importo in dollari");
		panel3.add(testo);
		panel3.add(border);
		
		JPanel panel=new JPanel(new GridLayout(3,1));
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		
		add(panel);
	}
	
	public void createReset()
	{
		reset=new JButton("Reset");
		class ResetListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				field.setText("");
				label.setText("0");
			}
		}
		ActionListener listener=new ResetListener();
		reset.addActionListener(listener);
	}
	
	public void createConverti()
	{
		converti=new JButton("Converti");
		class ConvertListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				double y=Double.parseDouble(field.getText());
				double x=1.13*y;
				label.setText(""+x);
			}
		}
		ActionListener listener=new ConvertListener();
		converti.addActionListener(listener);
	}
	
	private JButton reset,converti;
	private JTextField field;
	private JLabel label;
}
