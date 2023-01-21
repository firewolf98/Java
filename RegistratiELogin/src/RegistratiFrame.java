import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegistratiFrame extends JFrame
{
	public RegistratiFrame()
	{
		setTitle("Registrati");
		createLabel();
		createButton();
		createPanel();
		setSize(300,350);
	}
	
	public void createLabel()
	{
		username=new JLabel("Username: ");
		password1=new JLabel("Password: ");
		password2=new JLabel("Ripeti Password: ");
		cognome=new JLabel("Cognome: ");
		name=new JLabel("Nome: ");
		indirizzo=new JLabel("Indirizzo: ");
		telefono=new JLabel("Telefono: ");
		
		user=new JTextField(10);
		pass1=new JTextField(10);
		pass2=new JTextField(10);
		cogn=new JTextField(10);
		nome=new JTextField(10);
		ind=new JTextField(10);
		tel=new JTextField(10);
	}
	
	public void createButton()
	{
		button=new JButton("Registrati");
		class RegListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				if(pass1.getText().equals(pass2.getText()))
					setVisible(false);
				else
				{
					JOptionPane out=new JOptionPane();
					out.showMessageDialog(null,"La password non coincide");
					pass1.setText("");	
					pass2.setText("");
				}
			}
		}
		ActionListener listener=new RegListener();
		button.addActionListener(listener);
	}
	
	public void createPanel()
	{
		JPanel panel1=new JPanel(new GridLayout(7,2));
		panel1.add(username);
		panel1.add(user);
		panel1.add(password1);
		panel1.add(pass1);
		panel1.add(password2);
		panel1.add(pass2);
		panel1.add(cognome);
		panel1.add(cogn);
		panel1.add(name);
		panel1.add(nome);
		panel1.add(indirizzo);
		panel1.add(ind);
		panel1.add(telefono);
		panel1.add(tel);
		
		JPanel panel3=new JPanel();
		panel3.add(panel1);
		
		
		JPanel panel4=new JPanel();
		panel4.add(button);
		
		JPanel panel=new JPanel(new GridLayout(2,1));
		panel.add(panel3);
		panel.add(panel4);
		
		add(panel);
	}
	
	private JTextField user,pass1,pass2,cogn,nome,ind,tel;
	private JLabel password1,password2,username,indirizzo,telefono,cognome,name;
	private JButton button;
}