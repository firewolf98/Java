import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;


public class RegFrame extends JFrame 
{
	private static final long serialVersionUID = 1L;

	private Connection conn;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private Statement stmt;
	private ResultSet rs;
	
	public RegFrame(Connection con) 
	{
		setTitle("Registrati");
		setSize(401,500);
		conn=con;
		try {
			stmt=conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ImgPan pannello = new ImgPan();
		setContentPane(pannello);
		pannello.setLayout(null);
		
		JLabel lblBooktime = new JLabel("BOOKTIME");
		lblBooktime.setHorizontalAlignment(SwingConstants.CENTER);
		lblBooktime.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBooktime.setForeground(Color.CYAN);
		lblBooktime.setBounds(113, 23, 154, 57);
		pannello.add(lblBooktime);
		
		JButton btnRegistrati = new JButton("REGISTRATI");
		btnRegistrati.setBounds(135, 408, 112, 21);
		pannello.add(btnRegistrati);
		
		class RegListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				try {
					rs=stmt.executeQuery("SELECT Username FROM Utente WHERE Username='" + textField.getText()+"'");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if(!rs.next())
					{
						stmt.executeUpdate("INSERT INTO Utente(Username,Password,Cognome,Nome,DataN,Indirizzo,Telefono)"+ "VALUES('"+textField.getText()+"','"+textField_1.getText()+"','"+textField_2.getText()+"','"+textField_3.getText()+"','"+textField_4.getText()+"','"+textField_5.getText()+"','"+textField_6.getText()+"')");
						setVisible(false);
						JFrame frame=new LoginFrame(conn);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setVisible(true);
					}
					else 
					{
						JOptionPane.showMessageDialog(null,"Utente già registrato");
					}
				} catch (HeadlessException | SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		ActionListener listener=new RegListener();
		btnRegistrati.addActionListener(listener);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(30, 92, 68, 21);
		pannello.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(30, 131, 55, 21);
		pannello.add(lblPassword);
		
		JLabel label = new JLabel("Cognome");
		label.setForeground(Color.WHITE);
		label.setBounds(30, 174, 55, 21);
		pannello.add(label);
		
		JLabel label_1 = new JLabel("Nome");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(30, 217, 55, 21);
		pannello.add(label_1);
		
		JLabel label_2 = new JLabel("Data di Nascita (AAAA-MM-GG");
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(30, 264, 98, 21);
		pannello.add(label_2);
		
		JLabel label_3 = new JLabel("Indirizzo");
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(30, 308, 55, 21);
		pannello.add(label_3);
		
		JLabel label_4 = new JLabel("Telefono");
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(30, 354, 55, 21);
		pannello.add(label_4);
		
		textField = new JTextField();
		textField.setBounds(259, 93, 96, 19);
		pannello.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(259, 132, 96, 19);
		pannello.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(259, 175, 96, 19);
		pannello.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(259, 218, 96, 19);
		pannello.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(259, 265, 96, 19);
		pannello.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(259, 309, 96, 19);
		pannello.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(259, 355, 96, 19);
		pannello.add(textField_6);
	}
}