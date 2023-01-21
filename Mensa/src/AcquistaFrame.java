import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AcquistaFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6803027933207622482L;
	public AcquistaFrame(Mensa mensa,String username) throws FileNotFoundException, IOException
	{
		this.mensa=mensa;
		user=username;
		indice=mensa.getIndice(user);
		costoTot=0;
		kcalTot=0;
		piattiComprati=new ArrayList<Piatto>();
		g=new GregorianCalendar();
		File f=new File("file.txt");
		output=new ObjectOutputStream(new FileOutputStream(f));
		setTitle("Acquista Pasto");
		acquisti=new JTextArea(15,20);
		createButtonAggiungi();
		createButtonAcquista();
		createNorthPanel();
		createCentralPanel();
		createSouthPanel();
		setSize(500,500);
	}
	
	public void createButtonAggiungi()
	{
		aggiungi=new JButton("Aggiungi al pasto");
		class AggiungiListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				int index=box.getSelectedIndex();
				acquisti.append(mensa.getPiatti().get(index).getName() + ", Kcal ");
				acquisti.append(mensa.getPiatti().get(index).getKcal() + "\n");
				costoTot+=mensa.getPiatti().get(index).getCosto();
				costoLabel.setText("Costo totale €" + costoTot);
				kcalTot+=mensa.getPiatti().get(index).getKcal();
				kalLabel.setText("Kcal totale " + kcalTot);
				piattiComprati.add(mensa.getPiatti().get(indice));
			}	
		}
		ActionListener listener = new AggiungiListener();
		aggiungi.addActionListener(listener);
	}
	
	public void createButtonAcquista()
	{
		acquista=new JButton("Acquista");
		acquistaPanel=new JPanel();
		acquistaPanel.add(acquista);
		class AcquistaListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event) 
			{
				if(costoTot<=mensa.getClienti().get(indice).getCredito())
				{
					mensa.getClienti().get(indice).setCredito(costoTot);
					//mensa.getClienti().get(indice).setPasti(new PastoAcquistato(piattiComprati,g,costoTot));
					acquisti.setText("");
					kcalTot=0;
					costoTot=0;
					piattiComprati=null;
				}
				else
				{
					setVisible(false);
					JOptionPane o=new JOptionPane();
					o.showMessageDialog(null,"Credito Insufficiente");
					throw new BilancioNegativo();
				}
				creditoLabel.setText("Il suo credito residuo è " + mensa.getClienti().get(indice).getCredito() + "€");
				costoLabel.setText("Costo totale €" + costoTot);
				kalLabel.setText("Kcal totale " + kcalTot);
				try {
					output.writeObject(mensa);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}
		ActionListener listener = new AcquistaListener();
		acquista.addActionListener(listener);
	}
	
	public void createNorthPanel()
	{
		JLabel label=new JLabel("Buongiorno Sig. " + user);
		creditoLabel=new JLabel("Il suo credito residuo è " + mensa.getClienti().get(indice).getCredito() + "€");
		
		northPanel=new JPanel(new GridLayout(2,1));
		northPanel.add(label);
		northPanel.add(creditoLabel);
		add(northPanel,BorderLayout.NORTH);
	}
	
	public void createCentralPanel()
	{
		label=new JLabel("Piatti del giorno");
		centerPanel=new JPanel();
		box=new JComboBox();
		for(int i=0;i<mensa.getPiatti().size();i++)
			box.addItem(mensa.getPiatti().get(i).getName() + " " + mensa.getPiatti().get(i).getCosto() + "€");
		
		centerPanel.add(label);
		centerPanel.add(box);
		centerPanel.add(aggiungi);
		add(centerPanel,BorderLayout.CENTER);
	}
	
	public void createSouthPanel()
	{
		JLabel labels=new JLabel("Pasto del " + g.get(GregorianCalendar.DAY_OF_MONTH) + "/" + (g.get(GregorianCalendar.MONTH)+1) + "/" + g.get(GregorianCalendar.YEAR));
		costoLabel=new JLabel("Costo totale €" + costoTot);
		kalLabel=new JLabel("Kcal totale " + kcalTot);
		
		JPanel panel1=new JPanel();
		panel1.add(labels);
		panel1.add(acquisti);
		
		JPanel panel2=new JPanel(new GridLayout(3,1));
		panel2.add(costoLabel);
		panel2.add(kalLabel);
		panel2.add(acquistaPanel);
		
		southPanel=new JPanel(new GridLayout(1,1));
		southPanel.add(panel1);
		southPanel.add(panel2);
		add(southPanel,BorderLayout.SOUTH);
	}
	
	private JPanel northPanel,centerPanel,southPanel,acquistaPanel;
	private JButton acquista,aggiungi;
	private Mensa mensa;
	private String user;
	private JLabel label,costoLabel,kalLabel,creditoLabel;
	private double costoTot;
	private int kcalTot,indice;
	private JTextArea acquisti;
	private JComboBox box;
	private ObjectOutputStream output;
	private ArrayList<Piatto> piattiComprati;
	private GregorianCalendar g;
}
