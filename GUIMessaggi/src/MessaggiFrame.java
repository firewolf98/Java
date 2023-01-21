import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MessaggiFrame extends JFrame
{
	public MessaggiFrame(ArrayList<Messaggio> am)
	{
		ag=am;
		createUserField();
		createPassField();
		createButton();
		createPanel();
		createInvia();
		createDelete();
		createVisualizza();
		setSize(200,200);
	}
	
	public void createUserField()
	{
		userLabel = new JLabel("Username: ");
		final int FIELD_WIDTH = 10;
		userField = new JTextField(FIELD_WIDTH);
	}
	
	public void createPassField()
	{
		passLabel = new JLabel("Password: ");
		final int FIELD_WIDTH = 10;
		passField = new JTextField(FIELD_WIDTH);
	}
	
	public void createButton()
	{
		button=new JButton("Login");
		class PressLogin implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				user=userField.getText();
				pass=passField.getText();
				remove(panel);
				setVisible(false);
				createPanel2();
				add(panel2,BorderLayout.CENTER);
				setVisible(true);
				
			}	
		}
		ActionListener listener=new PressLogin();
		button.addActionListener(listener);
	}
	
	public void createPanel()
	{
		panel=new JPanel();
		panel.add(userLabel);
		panel.add(userField);
		panel.add(passLabel);
		panel.add(passField);
		panel.add(button);
		add(panel,BorderLayout.CENTER);
	}
	
	public void createInvia()
	{
		invia=new JButton("Invia Messaggio");
		class SendMessage implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				Scanner in=new Scanner(System.in);
				cont++;
				GregorianCalendar g=new GregorianCalendar(23,6,2018);
				Messaggio m=new Messaggio(cont,user,g,in.next());
				ag.add(m);
			}
		}
		ActionListener listener=new SendMessage();
		invia.addActionListener(listener);
	}
	
	public void createDelete()
	{
		delete=new JButton("Cancella Messaggio");
		class cancMessage implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				Scanner in=new Scanner(System.in);
				int x=in.nextInt();
				for(int i=0;i<ag.size();i++)
				{
					if(x==ag.get(i).getId())
					{
						ag.remove(ag.get(i));
						cont--;
					}
				}
			}
		}
		ActionListener listener=new cancMessage();
		delete.addActionListener(listener);
	}
		
	public void createVisualizza()
	{
		visualizza=new JButton("Visualizza Messaggi");
		class visualMessage implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				JPanel panel3=new JPanel();
				for(int i=0;i<ag.size();i++)
				{
					setVisible(false);
					System.out.println(ag.get(i).getId()+ag.get(i).getSender()+ag.get(i).getText());
					JLabel in=new JLabel("| " + ag.get(i).getId() + " " + ag.get(i).getSender() + " " + ag.get(i).getText());
					panel3.add(in);
				}
				remove(panel2);
				setVisible(false);
				add(panel3);
				setVisible(true);
			}
		}
		ActionListener listener=new visualMessage();
		visualizza.addActionListener(listener);
	}
	
	public void createPanel2()
	{
		JLabel accesso=new JLabel("Benvenuto " + user);
		panel2=new JPanel();
		panel2.add(accesso);
		panel2.add(invia);
		panel2.add(delete);
		panel2.add(visualizza);
	}
	
	
	public String getUser()
	{
		return user;
	}
	
	public String getPassword()
	{
		return pass;
	}
		
	private ArrayList<Messaggio> ag;	
	private JLabel userLabel,passLabel;
	private JTextField userField,passField;
	private JButton button;
	private JPanel panel,panel2;
	private String user,pass;
	private JButton invia,delete,visualizza;
	private int cont=3;
}