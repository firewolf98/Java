import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegStudenteFrame extends JFrame
{
	public RegStudenteFrame(Università u,File f)
	{
		uni=u;
		fl=f;
		setTitle("Registra Studente");
		createTextField();
		createButton();
		createPanel();
		setSize(300,400);
	}
	
	public void createTextField()
	{
		nome=new JTextField(10);
		cogn=new JTextField(10);
		user=new JTextField(10);
		matricola=new JTextField(10);
		pass=new JTextField(10);
		
		box=new JComboBox();
		box.addItem("Reti");
		box.addItem("Sistemi");
	}
	
	public void createButton()
	{
		registra=new JButton("Registra");
		class RegistraListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				if(!uni.controllaReg(user.getText()))
				{
					uni.addStudenti(new Studente(nome.getText(),cogn.getText(),Integer.parseInt(matricola.getText()),user.getText(),pass.getText(),(String)box.getSelectedItem()));
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
		JLabel label3=new JLabel("Matricola");
		JLabel label4=new JLabel("Login");
		JLabel label5=new JLabel("Piano di studi");
		JLabel label6=new JLabel("Password");
		JLabel label7=new JLabel("Registrazione Studente");
		
		JPanel panel2=new JPanel(new GridLayout(6,2));
		panel2.add(label1);
		panel2.add(nome);
		panel2.add(label2);
		panel2.add(cogn);
		panel2.add(label3);
		panel2.add(matricola);
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
	private JTextField user,pass,nome,cogn,matricola;
	private JComboBox box;
	private Università uni;
	private File fl;
}
