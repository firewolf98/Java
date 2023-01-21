import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class DocenteFrame extends JFrame
{
	private static final long serialVersionUID = 1779729969569698048L;

	public DocenteFrame(Università u,File f,String nome,String cogn,String login)
	{
		uni=u;
		fl=f;
		name=nome;
		surname=cogn;
		user=login;
		setTitle("Docente");
		createLabel();
		createButton();
		createComboBoxs();
		createPanel();
		setSize(300,250);
	}
	
	public void createLabel()
	{
		ben=new JLabel("Benvenuto Prof. " + name + " " + surname);
		JPanel panel1=new JPanel();
		panel1.add(ben);
		add(panel1,BorderLayout.NORTH);
	}
	
	public void createButton()
	{
		registra=new JButton("Registra");
		class RegistraListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				int x=uni.getDocenti().get(uni.getIndexDoc(user)).getCorso(),y=0;
				if(x<6)
				{
					y=x;
					for(int i=0;i<uni.getStudenti().size();i++)
						if(uni.getStudenti().get(i).getMat()==(int) mat.getSelectedItem())
							uni.getStudenti().get(i).setVoti((String) voto.getSelectedItem(),y);
				}
				else
				{
				y=x-5;
				for(int i=0;i<uni.getStudenti().size();i++)
					if(uni.getStudenti().get(i).getMat()==(int) mat.getSelectedItem())
					{
						uni.getStudenti().get(i).setVoti((String) voto.getSelectedItem(),y);
						uni.getStudenti().get(i).setDate(new GregorianCalendar(), y);
					}
				}
			}
		}
		ActionListener listener=new RegistraListener();
		registra.addActionListener(listener);
	}
	
	public void createComboBoxs()
	{
		mat=new JComboBox();
		for(int i=0;i<uni.getStudenti().size();i++)
			mat.addItem(uni.getStudenti().get(i).getMat());
		voto=new JComboBox();
		voto.addItem("18");
		voto.addItem("19");
		voto.addItem("20");
		voto.addItem("21");
		voto.addItem("22");
		voto.addItem("23");
		voto.addItem("24");
		voto.addItem("25");
		voto.addItem("26");
		voto.addItem("27");
		voto.addItem("28");
		voto.addItem("29");
		voto.addItem("30");
		voto.addItem("31");
	}
	
	public void createPanel()
	{
		JLabel label1=new JLabel("Matricola Studente");
		JLabel label2=new JLabel("Voto");
		
		JPanel panel2=new JPanel();
		panel2.add(registra);
		
		JPanel panel1=new JPanel(new GridLayout(2,2));
		panel1.add(label1);
		panel1.add(mat);
		panel1.add(label2);
		panel1.add(voto);
		
		JPanel panel3=new JPanel();
		panel3.add(panel1);
		panel3.setBorder(new TitledBorder(new EtchedBorder(),"Registrazione Esami"));
		
		JPanel panel=new JPanel(new GridLayout(2,1));
		panel.add(panel3);
		panel.add(panel2);
		add(panel);
	}
	
	private JLabel ben;
	private JButton registra;
	private JComboBox mat,voto;
	private Università uni;
	private File fl;
	String name,surname,user;
}
