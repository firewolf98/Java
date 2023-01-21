import java.awt.Color; 
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class ConnectFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private Connection conn;

	public ConnectFrame() {
		setTitle("Connetti");
		setSize(401,500);
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
		textField.setText("root");
		pannello.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(220, 190, 96, 19);
		textField_1.setText("bart1998");
		pannello.add(textField_1);
		
		JButton btnConn = new JButton("CONNETTI");
		btnConn.setBounds(131, 253, 128, 21);
		pannello.add(btnConn);
		
		class ConnettiListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
					connectionDatabase();
					if(conn!=null)
					{
						setVisible(false);
						JFrame frame=new LoginFrame(conn);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setVisible(true);
					}
			}
		}
		
		ActionListener listener=new ConnettiListener();
		btnConn.addActionListener(listener);
		
		JLabel lblBooktime = new JLabel("BOOKTIME");
		lblBooktime.setHorizontalAlignment(SwingConstants.CENTER);
		lblBooktime.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBooktime.setForeground(Color.CYAN);
		lblBooktime.setBounds(113, 23, 154, 57);
		pannello.add(lblBooktime);
	}

	public void connectionDatabase()
	{
		try 
		{
			final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
			Class.forName(JDBC_DRIVER);
			final String DB_URL="jdbc:mysql://localhost:3306/booktime?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			conn=DriverManager.getConnection(DB_URL,textField.getText(),textField_1.getText());
		} 
		
		catch (SQLException e) 
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Accesso negato,credenziali errate","Attenzione", JOptionPane.ERROR_MESSAGE);
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
