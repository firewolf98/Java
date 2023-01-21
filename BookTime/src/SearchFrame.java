import java.awt.Color; 
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class SearchFrame extends JFrame 
{
	private static final long serialVersionUID = 1L;

	private Connection conn;
	private JTextField textField;
	private JComboBox<String> comboBox;
	private Statement stmt;
	private ResultSet rs;
	private JTextArea textArea;
	private int n,x,m;
	private String username;
	GregorianCalendar data;
	
	public SearchFrame(Connection con,String user) 
	{
		setTitle("BookTime");
		setSize(401,500);
		conn=con;
		username=user;
		try {
			stmt=conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ImgPan pannello = new ImgPan();
		setContentPane(pannello);
		pannello.setLayout(null);
				
		JLabel lblIsbn = new JLabel("ISBN:");
		lblIsbn.setForeground(Color.WHITE);
		lblIsbn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 20));
		lblIsbn.setHorizontalAlignment(SwingConstants.CENTER);
		lblIsbn.setBounds(10, 31, 61, 31);
		pannello.add(lblIsbn);
		
		textField = new JTextField();
		textField.setBounds(88, 31, 157, 31);
		pannello.add(textField);
		textField.setColumns(10);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(37, 392, 148, 31);
		pannello.add(comboBox);

		JPanel panel = new JPanel();
		panel.setBounds(10, 80, 355, 285);
		
		textArea=new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(0, 1, 355, 285);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(0,1, 355, 285);
		panel.add(scrollPane);
		
		
		
		pannello.add(panel);
		panel.setLayout(null);
		
		n=-1;
						
		JButton btnCerca = new JButton("CERCA");
		btnCerca.setBounds(270, 31, 95, 31);
		pannello.add(btnCerca);
		
		class CercaListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				textArea.setText("");
				comboBox.removeAllItems();
				try 
				{
					rs=stmt.executeQuery("SELECT * from LibroCartaceo where CodISBN='"+textField.getText()+"'");
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				try 
				{
					textArea.append("LIBRO CARTACEO\n\n");
					while(rs.next())
					{
						if(rs.getInt(7)>0)
							comboBox.addItem(rs.getString(1));
						textArea.append("Codice: "+rs.getString(1)+" - "+rs.getString(3)+"\n");
						textArea.append("Lingua: "+rs.getString(4)+"\n");
						textArea.append("Costo: "+rs.getString(6)+"€\n");
						textArea.append("Copie disponibili: "+rs.getString(7)+"\n");
						textArea.append("Venduto da: "+rs.getString(8)+"\n\n");
						textArea.append("- - - - - - - - - - - - -\n\n");
						n++;
					}
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				m=n;
				try 
				{
					rs=stmt.executeQuery("SELECT * from Ebook where CodISBN='"+textField.getText()+"'");
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				try 
				{
					textArea.append("EBOOK\n\n");
					while(rs.next())
					{
						comboBox.addItem(rs.getString(1));
						textArea.append("Codice: "+rs.getString(1)+" - "+rs.getString(3)+"\n");
						textArea.append("Lingua: "+rs.getString(4)+"\n");
						textArea.append("Costo: "+rs.getString(6)+"€\n");
						textArea.append("Formato: "+rs.getString(7)+"\n");
						textArea.append("Venduto da: "+rs.getString(8)+"\n\n");
						textArea.append("- - - - - - - - - - - - -\n\n");
						m++;
					}
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
		
		ActionListener listener=new CercaListener();
		btnCerca.addActionListener(listener);
		
		
		
		JButton btnAcquista = new JButton("ACQUISTA");
		btnAcquista.setBounds(245, 392, 110, 31);
		pannello.add(btnAcquista);
		
		JButton btnEsci = new JButton("ESCI");
		btnEsci.setBounds(160, 433, 85, 21);
		pannello.add(btnEsci);
		
		class EsciListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				setVisible(false);
				JFrame frame=new LoginFrame(conn);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		}
		
		ActionListener listener2=new EsciListener();
		btnEsci.addActionListener(listener2);
		
		data=new GregorianCalendar();
		int anno=data.get(GregorianCalendar.YEAR);
		int mese=data.get(GregorianCalendar.MONTH)+1;
		int day=data.get(GregorianCalendar.DAY_OF_MONTH);
		
		class AcquistaListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				if(comboBox.getSelectedIndex()<=n)
				{
					try 
					{
						rs=stmt.executeQuery("select max(CodAcq) from Acquistac");
						if(rs.next())
							x=(int)rs.getInt(1)+1;
						rs=stmt.executeQuery("select NCopie from LibroCartaceo where CodArt="+comboBox.getSelectedItem());
					} 
					catch (SQLException e) 
					{
						e.printStackTrace();
					}
					try 
					{
						stmt.executeUpdate("INSERT INTO AcquistaC(CodAcq,UserUt,CodArt,Data) VALUES("+x+",'"+username+"','"+comboBox.getSelectedItem()+"','"+anno+"-"+mese+"-"+day+"')");
						stmt.executeUpdate("Update LibroCartaceo set NCopie=NCopie-1 where CodArt='"+comboBox.getSelectedItem()+"'");
					} 
					catch (SQLException e) 
					{
						e.printStackTrace();
					}
				}
				else if(comboBox.getSelectedIndex()>=m)
				{
					try 
					{
						rs=stmt.executeQuery("select max(CodAcq) from Acquistae");
						if(rs.next())
							x=(int)rs.getInt(1)+1;
					} 
					catch (SQLException e) 
					{
						e.printStackTrace();
					}
					try 
					{
						stmt.executeUpdate("INSERT INTO AcquistaE(CodAcq,UserUt,CodArt,Data) VALUES("+x+",'"+username+"','"+comboBox.getSelectedItem()+"','"+anno+"-"+mese+"-"+day+"')");
					} 
					catch (SQLException e) 
					{
						e.printStackTrace();
					}
				}
				setVisible(false);
				JFrame frame=new SearchFrame(conn,username);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		}
		
		ActionListener listener1=new AcquistaListener();
		btnAcquista.addActionListener(listener1);
	}
}