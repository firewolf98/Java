import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RichiestaFrame extends JFrame
{
	public RichiestaFrame(File file) throws FileNotFoundException, ClassNotFoundException, IOException
	{
		f=file;
		setTitle("Richiesta Prenotazione");
		createFlusso();
		createFields();
		createTextArea();
		createComboBox();
		createDisp();
		createDett();
		createPren();
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
	
	public void createFields()
	{
		ing=new JTextField(3);
		ing.setText("GG");
		inm=new JTextField(3);
		inm.setText("MM");
		ina=new JTextField(3);
		ina.setText("AAAA");
		outg=new JTextField(3);
		outg.setText("GG");
		outm=new JTextField(3);
		outm.setText("MM");
		outa=new JTextField(3);
		outa.setText("AAAA");
	}
	
	public void createComboBox()
	{
		box=new JComboBox();
		box.addItem("Singola");
		box.addItem("Doppia");
		box.addItem("Matrimoniale");
	}
	
	public void createDisp()
	{
		disp=new JButton("Verifica Disponibilità");
		class DispListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				s=null;
				for(int i=0;i<a.getStanze().size();i++)
				{
					for(int j=0;j<a.getPrenotazioni().size();j++)
						if(a.getStanze().get(i).getTipologia().equals(box.getSelectedItem()) & a.getStanze().get(i)!=a.getPrenotazioni().get(j).getStanza())
						{
							s=a.getStanze().get(i);
							break;
						}
				}
				if(s==null)
				{
					JOptionPane p=new JOptionPane();
					p.showMessageDialog(null,"Non ci sono stanze disponibili");
				}
			}
		}
		ActionListener listener=new DispListener();
		disp.addActionListener(listener);
	}
	
	public void createDett()
	{
		dettagli=new JButton("Dettagli");
		class DettListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				dett.append("" + s.getNumero());
				dett.append("" + s.getPiano());
				dett.append(s.getTipologia());
				dett.append(s.getServizi());
				dett.append("" + s.getTelefono());
			}
		}
		ActionListener listener=new DettListener();
		dettagli.addActionListener(listener);
	}
	
	public void createPren()
	{
		prenota=new JButton("Prenota");
		class PrenListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				GregorianCalendar in=new GregorianCalendar(Integer.parseInt(ina.getText()),Integer.parseInt(inm.getText()),Integer.parseInt(ing.getText()));
				GregorianCalendar out=new GregorianCalendar(Integer.parseInt(outa.getText()),Integer.parseInt(outm.getText()),Integer.parseInt(outg.getText()));
				setVisible(false);
				PrenotazioneFrame frame;
				try {
					frame = new PrenotazioneFrame(in,out,s,f);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				} catch (ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		ActionListener listener=new PrenListener();
		prenota.addActionListener(listener);
	}
	
	public void createTextArea()
	{
		dett=new JTextArea();
		dett.setSize(30,30);
	}
	
	public void createPanel()
	{
		JLabel label1=new JLabel("Check-in");
		JLabel label2=new JLabel("Check-out");
		
		JPanel panel1=new JPanel();
		panel1.add(label1);
		panel1.add(ing);
		panel1.add(inm);
		panel1.add(ina);
		
		JPanel panel2=new JPanel();
		panel1.add(label2);
		panel1.add(outg);
		panel1.add(outm);
		panel1.add(outa);
		
		JPanel panel11=new JPanel();
		panel11.add(box);
		JPanel panel7=new JPanel();
		panel7.add(disp);
		JPanel panel3=new JPanel(new GridLayout(4,1));
		panel3.add(panel1);
		panel3.add(panel2);
		panel3.add(panel7);
		panel3.add(panel11);
		JPanel panel9=new JPanel();
		panel9.add(panel3);
		
		JPanel panel5=new JPanel();
		panel5.add(dettagli);
		JPanel panel4=new JPanel(new GridLayout(2,1));
		panel4.add(panel5);
		panel4.add(dett);
		JPanel panel6=new JPanel();
		panel6.add(prenota);
		JPanel panel8=new JPanel();
		panel8.add(panel5);
		panel8.add(panel6);
		
		JPanel panel10=new JPanel(new GridLayout(2,1));
		panel10.add(panel9);
		panel10.add(panel8);
		
		JPanel panel=new JPanel();
		panel.add(panel10);
		add(panel);
	}
	
	private JTextField ing,inm,ina,outg,outm,outa;
	private JComboBox box;
	private JButton prenota,dettagli,disp;
	private JTextArea dett;
	private Stanza s;
	private File f;
	private Albergo a;
}
