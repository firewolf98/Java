

import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private JTextField textField;
	private JTextField textField_1;
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	public LoginFrame(Connection con) {
		setTitle("Accedi");
		setSize(401,500);
		conn=con;
		try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ImgPan pannello = new ImgPan();
		setContentPane(pannello);
		pannello.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(38, 103, 69, 33);
		lblUsername.setForeground(Color.WHITE);
		pannello.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(38, 183, 69, 33);
		pannello.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(220, 110, 96, 19);
		pannello.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(220, 190, 96, 19);
		pannello.add(textField_1);
		
		JButton btnAccedi = new JButton("ACCEDI");
		btnAccedi.setBounds(147, 253, 85, 21);
		pannello.add(btnAccedi);
		
		class AccediListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				try {
					rs=stmt.executeQuery("SELECT Username,Password FROM Utente WHERE Username='" + textField.getText()+"'" + "AND Password='" + textField_1.getText()+"'");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if(!rs.next())
					{
						JOptionPane.showMessageDialog(null,"Utente non registrato o credenziali errate");
					}
					else 
					{
						setVisible(false);
						JFrame frame=new SearchFrame(conn,textField.getText());
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setVisible(true);
					}
				} catch (HeadlessException | SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		ActionListener listener=new AccediListener();
		btnAccedi.addActionListener(listener);
		
		JLabel lblNonHaiUn = new JLabel("Non hai un account? Registrati");
		lblNonHaiUn.setForeground(Color.WHITE);
		lblNonHaiUn.setHorizontalAlignment(SwingConstants.CENTER);
		lblNonHaiUn.setBounds(91, 336, 210, 39);
		pannello.add(lblNonHaiUn);
		
		JButton btnRegistrati = new JButton("REGISTRATI");
		btnRegistrati.setBounds(136, 385, 112, 21);
		pannello.add(btnRegistrati);
		
		class RegistratiListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				setVisible(false);
				JFrame frame=new RegFrame(conn);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		}
		
		ActionListener listener1=new RegistratiListener();
		btnRegistrati.addActionListener(listener1);
		
		JLabel lblBooktime = new JLabel("BOOKTIME");
		lblBooktime.setHorizontalAlignment(SwingConstants.CENTER);
		lblBooktime.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBooktime.setForeground(Color.CYAN);
		lblBooktime.setBounds(113, 23, 154, 57);
		pannello.add(lblBooktime);
		
		JButton btnDisconnetti = new JButton("DISCONNETTI");
		btnDisconnetti.setBounds(113, 432, 154, 21);
		pannello.add(btnDisconnetti);
		
		class DisconnettiListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				setVisible(false);
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		ActionListener listener2=new DisconnettiListener();
		btnDisconnetti.addActionListener(listener2);
	}
}
