import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GestioneFrame extends JFrame
{
	public GestioneFrame(File file)
	{
		f=file;
		setTitle("Gestione Prenotazione");
		createTextFields();
		createDel();
		createMod();
		setSize(300,300);
	}
	
	public void createTextFields()
	{
		nome=new JTextField(10);
		cognome=new JTextField(10);
		telefono=new JTextField(10);
		carta=new JTextField(10);
	}
	
	public void createDel()
	{
		delete=new JButton("Cancella Prenotazione");
		class DelListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				Cliente c=new Cliente(nome.getText(),cognome.getText(),telefono.getText(),carta.getText());
				
			}
		}
		ActionListener listener=new DelListener();
		delete.addActionListener(listener);
	}
	
	public void createMod()
	{
		modifica=new JButton("Modifica Prenotazione");
		class ModListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				Cliente c=new Cliente(nome.getText(),cognome.getText(),telefono.getText(),carta.getText());
				
			}
		}
		ActionListener listener=new ModListener();
		modifica.addActionListener(listener);
	}
	
	private JButton delete,modifica;
	private JTextField nome,cognome,carta,telefono;
	private File f;
}
