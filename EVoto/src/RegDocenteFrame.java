import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegDocenteFrame extends JFrame implements Serializable
{
	public RegDocenteFrame(Università u,File f) throws FileNotFoundException, IOException
	{
		uni=u;
		fl=f;
		setTitle("Registra Docente");
		createTextField();
		createComboBox();
		createButton();
		createPanel();
		setSize(600,350);
	}
		
	public void createTextField()
	{
		nome=new JTextField(10);
		cogn=new JTextField(10);
		user=new JTextField(10);
		pass=new JTextField(10);
	}
	
	public void createComboBox()
	{
		box=new JComboBox();
		for(int i=0;i<uni.getReti().size();i++)
			box.addItem(uni.getReti().get(i));
		for(int j=0;j<uni.getSistemi().size();j++)
			box.addItem(uni.getSistemi().get(j));
	}
	
	public void createButton()
	{
		registra=new JButton("Registra");
		class RegistraListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				int x=0;
				if(!uni.controllaReg(user.getText()))
				{
					if(box.getSelectedIndex()>5)
						x=1;
					else
						x=0;
					uni.addDocenti(new Docente(nome.getText(),cogn.getText(),user.getText(),pass.getText(),(String)box.getSelectedItem(),x));
					ObjectOutputStream o;
					try {
						o = new ObjectOutputStream(new FileOutputStream(fl));
						o.writeObject(uni);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				setVisible(false);
			}
		}
		ActionListener listener=new RegistraListener();
		registra.addActionListener(listener);
	}
	
	public void createPanel()
	{
		JPanel panel1=new JPanel();
		panel1.add(registra);
		
		JLabel label1=new JLabel("Nome");
		JLabel label2=new JLabel("Cognome");
		JLabel label4=new JLabel("Login");
		JLabel label5=new JLabel("Insegnamento");
		JLabel label6=new JLabel("Password");
		JLabel label7=new JLabel("Registrazione Docente");
		
		JPanel panel2=new JPanel(new GridLayout(5,2));
		panel2.add(label1);
		panel2.add(nome);
		panel2.add(label2);
		panel2.add(cogn);
		panel2.add(label5);
		panel2.add(box);
		panel2.add(label4);
		panel2.add(user);
		panel2.add(label6);
		panel2.add(pass);
		
		JPanel panel3=new JPanel();
		panel3.add(panel2);
		
		JPanel panel4=new JPanel();
		panel4.add(label7);
		add(panel4,BorderLayout.NORTH);
		
		panel=new JPanel(new GridLayout(2,1));
		panel.add(panel3);
		panel.add(panel1);
		
		add(panel,BorderLayout.CENTER);
	}
	
	private JButton registra;
	private JPanel panel;
	private JTextField user,pass,nome,cogn;
	private JComboBox box;
	private Università uni;
	private File fl;
}