import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MensaFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8879026660421683771L;
	public MensaFrame() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		File f=new File("file.txt");
		ObjectInputStream input=new ObjectInputStream(new FileInputStream(f));
		mensa= (Mensa) input.readObject();
		createInLabel();
		createButton();
		createPanel();
		setSize(400,150);
	}
	
	public void createInLabel()
	{
		setTitle("Accesso al servizio mensa");
		inLabel=new JLabel("Benvenuto alla Mensa");
		JPanel panel4=new JPanel();
		panel4.add(inLabel);
		add(panel4,BorderLayout.NORTH);
	}
	
	public void createButton()
	{
		button=new JButton("Accedi");
		panel2=new JPanel();
		panel2.add(button);
		class AccediListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				String log=userField.getText();
				String pas=passField.getText();
				if(mensa.controllo(log,pas))
				{
					setVisible(false);
					AcquistaFrame frame;
						try {
							frame = new AcquistaFrame(mensa,log);
							frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							frame.setVisible(true);
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}		
				}
				else
				{
					setVisible(false);
					JOptionPane op=new JOptionPane();
					op.showMessageDialog(null,"Username o Password errato");
				}
			}	
		}
		ActionListener listener = new AccediListener();
		button.addActionListener(listener);
	}
	
	public void createPanel()
	{
		userLabel=new JLabel("Login");
		final int FIELD_WIDTH = 10;
		userField=new JTextField(FIELD_WIDTH);
		passLabel=new JLabel("Password");
		passField=new JTextField(FIELD_WIDTH);		
		
		panel=new JPanel();
		panel.setLayout(new GridLayout(2,2));
		panel.add(userLabel);
		panel.add(userField);
		panel.add(passLabel);
		panel.add(passField);
	
		panel1=new JPanel();
		panel1.add(panel);
		panel1.add(panel2);
		add(panel1,BorderLayout.CENTER);
	}
	
	private JLabel inLabel,userLabel,passLabel;
	private JPanel panel,panel2,panel1;
	private JTextField userField,passField;
	private JButton button;
	private Mensa mensa;
}
