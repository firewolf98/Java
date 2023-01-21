import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PrenotazioneFrame extends JFrame
{
	public PrenotazioneFrame(GregorianCalendar cin,GregorianCalendar cout,Stanza st,File fl) throws FileNotFoundException, ClassNotFoundException, IOException
	{
		in=cin;
		out=cout;
		s=st;
		f=fl;
		createFlusso();
		setTitle("Prenota");
		createTextFields();
		createPrenota();
		createPanel();
		setSize(300,300);
	}
	
	public void createFlusso() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		if(f.exists())
		{
			ObjectInputStream o=new ObjectInputStream(new FileInputStream(f));
			a=(Albergo)o.readObject();
			o.close();
		}
	}
	
	public void createTextFields()
	{
		nome=new JTextField(10);
		cognome=new JTextField(10);
		telefono=new JTextField(10);
		carta=new JTextField(10);
	}
	
	public void createPrenota()
	{
		prenota=new JButton("Prenota");
		class PrenListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				Cliente c=new Cliente(nome.getText(),cognome.getText(),telefono.getText(),carta.getText());
				Prenotazione p=new Prenotazione(in,out,c,s);
				a.addPrenotazione(p);
				if(f.exists())
				{
					ObjectOutputStream o;
					try {
						o = new ObjectOutputStream(new FileOutputStream(f));
						o.writeObject(a);
						o.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		ActionListener listener=new PrenListener();
		prenota.addActionListener(listener);
	}
	
	public void createPanel()
	{
		JLabel label1=new JLabel("Nome");
		JLabel label2=new JLabel("Cognome");
		JLabel label3=new JLabel("Telefono");
		JLabel label4=new JLabel("Carta di credito");
		
		JPanel panel1=new JPanel(new GridLayout(4,2));
		panel1.add(label1);
		panel1.add(nome);
		panel1.add(label2);
		panel1.add(cognome);
		panel1.add(label3);
		panel1.add(telefono);
		panel1.add(label4);
		panel1.add(carta);
		
		JPanel panel2=new JPanel();
		panel2.add(prenota);
		
		JPanel panel3=new JPanel(new GridLayout(2,1));
		panel3.add(panel1);
		panel3.add(panel2);
		
		JPanel panel=new JPanel();
		panel.add(panel3);
		
		add(panel);
	}
	
	private JButton prenota;
	private JTextField nome,cognome,carta,telefono;
	private GregorianCalendar in,out;
	private Stanza s;
	private File f;
	private Albergo a;
}
