import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class LoginFrame extends JFrame implements Serializable
{
	private static final long serialVersionUID = 8422645885177998412L;

	public LoginFrame() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		f=new File("universita.txt");
		u=new Università();
		if(f.exists())
		{
			i=new ObjectInputStream(new FileInputStream(f));
			u=(Università) i.readObject();
			i.close();
		}
		
		setTitle("eVoto");
		createAccedi();
		createStudenti();
		createDocenti();
		createCenterPanel();
		createSudPanel();
		setSize(300,300);
	}
	
	public void createAccedi()
	{
		accedi=new JButton("Accedi");
		class AccediListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				if(u.controllaAccesso(login.getText(),password.getText()))
					if(u.isStudent(login.getText()))
					{
						setVisible(false);
						StudenteFrame frame3=new StudenteFrame(login.getText(),u);
						frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame3.setVisible(true);
					}
					else
					{
						setVisible(false);
						int index=u.getIndexDoc(login.getText());
						DocenteFrame frame3=new DocenteFrame(u,f,u.getDocenti().get(index).getName(),u.getDocenti().get(index).getSurname(),login.getText());
						frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame3.setVisible(true);
					}
				else
				{
					JOptionPane p=new JOptionPane();
					p.showMessageDialog(null,"Username/Password errata o utente non esistente");
				}
			}
		}
		ActionListener listener=new AccediListener();
		accedi.addActionListener(listener);
	}
	
	public void createStudenti()
	{
		studente=new JButton("Studente");
		class StudenteListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				setVisible(false);
				RegStudenteFrame frame1=new RegStudenteFrame(u,f);
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setVisible(true);
			}
		}
		ActionListener listener=new StudenteListener();
		studente.addActionListener(listener);
	}
	
	public void createDocenti()
	{
		docente=new JButton("Docente");
		class DocentiListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				setVisible(false);
				RegDocenteFrame frame2 = null;
				try {
					frame2 = new RegDocenteFrame(u,f);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame2.setVisible(true);
			}
		}
		ActionListener listener=new DocentiListener();
		docente.addActionListener(listener);
	}
	
	public void createCenterPanel()
	{
		login=new JTextField(10);
		password=new JTextField(10);
		
		JLabel label1=new JLabel("Login");
		JLabel label2=new JLabel("Password");
		JLabel label3=new JLabel("Benvenuto nel Sistema eVoto");
		
		JPanel panel1=new JPanel(new GridLayout(2,2));
		panel1.add(label1);
		panel1.add(login);
		panel1.add(label2);
		panel1.add(password);
		
		JPanel buttonpanel=new JPanel();
		buttonpanel.add(accedi);
		
		JPanel panel2=new JPanel(new GridLayout(3,1));
		panel2.add(label3);
		panel2.add(panel1);
		panel2.add(buttonpanel);
	
		centerPanel=new JPanel();
		centerPanel.add(panel2);
		
		add(centerPanel,BorderLayout.CENTER);
	}
	
	public void createSudPanel()
	{
		sudPanel=new JPanel();
		sudPanel.add(studente);
		sudPanel.add(docente);
		sudPanel.setBorder(new TitledBorder(new EtchedBorder(),"Registrazione"));
		
		add(sudPanel,BorderLayout.SOUTH);
	}
	
	private JPanel centerPanel,sudPanel;
	private JButton studente,docente,accedi;
	private JTextField login,password;
	private Università u;
	private File f;
	private ObjectInputStream i;
}
