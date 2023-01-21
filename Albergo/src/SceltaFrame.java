import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SceltaFrame extends JFrame
{
	public SceltaFrame()
	{
		setTitle("Albergo da Luca");
		createFile();
		createRichiesta();
		createGestione();
		createPanel();
		setSize(300,300);
	}
	
	public void createFile()
	{
		file=new JTextField(10);
	}
	
	public void createRichiesta()
	{
		richiesta=new JButton("Richiesta Prenotazione");
		class RicListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				File f=new File(file.getText());
				setVisible(false);
				RichiestaFrame frame;
				try {
					frame = new RichiestaFrame(f);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				} catch (ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		ActionListener listener=new RicListener();
		richiesta.addActionListener(listener);
	}
	
	public void createGestione()
	{
		gestione=new JButton("Gestione Prenotazione");
		class GesListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				File f=new File(file.getText());
				setVisible(false);
				GestioneFrame frame=new GestioneFrame(f);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);		
			}
		}
		ActionListener listener=new GesListener();
		gestione.addActionListener(listener);
	}
	
	public void createPanel()
	{
		JLabel label1=new JLabel("Nome file: ");
		JPanel panel1=new JPanel();
		panel1.add(label1);
		panel1.add(file);
		
		JPanel panel2=new JPanel();
		panel2.add(richiesta);
		panel2.add(gestione);
		
		JPanel panel3=new JPanel(new GridLayout(2,1));
		panel3.add(panel1);
		panel3.add(panel2);
		
		JPanel panel=new JPanel();
		panel.add(panel3);
		add(panel);
	}
	
	private JButton richiesta,gestione;
	private JTextField file;
}
