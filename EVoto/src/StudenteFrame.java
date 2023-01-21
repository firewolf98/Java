import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class StudenteFrame extends JFrame
{
	private static final long serialVersionUID = 2138440646173119957L;

	public StudenteFrame(String login,Università u)
	{
		user=login;
		uni=u;
		setTitle("Studente");
		createLabel();
		createButton();
		createPanel();
		setSize(900,400);
	}
	
	public void createLabel()
	{
		String name=uni.getStudenti().get(uni.getIndexStud(user)).getName();
		ben=new JLabel("Benvenuto " + name);
		media=new JLabel("La tua media voto è " + uni.getStudenti().get(uni.getIndexStud(user)).getMedia());
		JPanel panel1=new JPanel(new GridLayout(2,1));
		panel1.add(ben);
		panel1.add(media);
		add(panel1,BorderLayout.NORTH);
	}
	
	public void createButton()
	{
		chiudi=new JButton("Chiudi");
		class ChiudiListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				setVisible(false);
			}
		}
		ActionListener listener=new ChiudiListener();
		chiudi.addActionListener(listener);
	}
		
	public void createPanel()
	{
		JLabel label1=new JLabel("Insegnamento");
		JLabel label2=new JLabel("Voto");
		JLabel label3=new JLabel("Data");
		JLabel label4=new JLabel("Docente");
		
		JPanel panel2=new JPanel();
		panel2.add(chiudi);
		
		JLabel label5=new JLabel();
		JLabel label6=new JLabel();
		JLabel label7=new JLabel();
		JLabel label8=new JLabel();
		JLabel label9=new JLabel();
		JLabel label10=new JLabel();
		
		
		if(uni.getStudenti().get(uni.getIndexStud(user)).getStudi().equals("Reti"))
		{
			label5.setText(uni.getReti().get(0));
			label6.setText(uni.getReti().get(1));
			label7.setText(uni.getReti().get(2));
			label8.setText(uni.getReti().get(3));
			label9.setText(uni.getReti().get(4));
			label10.setText(uni.getReti().get(5));
		}
		else
		{
			label5.setText(uni.getSistemi().get(0));
			label6.setText(uni.getSistemi().get(1));
			label7.setText(uni.getSistemi().get(2));
			label8.setText(uni.getSistemi().get(3));
			label9.setText(uni.getSistemi().get(4));
			label10.setText(uni.getSistemi().get(5));
		}
		
		JLabel label11=new JLabel(uni.getStudenti().get(uni.getIndexStud(user)).getVoti()[0]);
		JLabel label12=new JLabel(uni.getStudenti().get(uni.getIndexStud(user)).getVoti()[1]);
		JLabel label13=new JLabel(uni.getStudenti().get(uni.getIndexStud(user)).getVoti()[2]);
		JLabel label14=new JLabel(uni.getStudenti().get(uni.getIndexStud(user)).getVoti()[3]);
		JLabel label15=new JLabel(uni.getStudenti().get(uni.getIndexStud(user)).getVoti()[4]);
		JLabel label16=new JLabel(uni.getStudenti().get(uni.getIndexStud(user)).getVoti()[5]);
						
		JLabel label17=new JLabel("-" );//+ uni.getStudenti().get(uni.getIndexStud(user)).getDate().get(0));
		JLabel label18=new JLabel("-" );//+ uni.getStudenti().get(uni.getIndexStud(user)).getDate().get(1));
		JLabel label19=new JLabel("-" );//+ uni.getStudenti().get(uni.getIndexStud(user)).getDate().get(2));
		JLabel label20=new JLabel("-" );//+ uni.getStudenti().get(uni.getIndexStud(user)).getDate().get(3));
		JLabel label21=new JLabel("-" );//+ uni.getStudenti().get(uni.getIndexStud(user)).getDate().get(4));
		JLabel label22=new JLabel("-" );//+ uni.getStudenti().get(uni.getIndexStud(user)).getDate().get(5));
		
		JLabel label23=new JLabel();//uni.getStudenti().get(uni.getIndexStud(user)).getDocenti().get(0));
		JLabel label24=new JLabel();//uni.getStudenti().get(uni.getIndexStud(user)).getDocenti().get(1));
		JLabel label25=new JLabel();//uni.getStudenti().get(uni.getIndexStud(user)).getDocenti().get(2));
		JLabel label26=new JLabel();//uni.getStudenti().get(uni.getIndexStud(user)).getDocenti().get(3));
		JLabel label27=new JLabel();//uni.getStudenti().get(uni.getIndexStud(user)).getDocenti().get(4));
		JLabel label28=new JLabel();//uni.getStudenti().get(uni.getIndexStud(user)).getDocenti().get(5));
		
		JPanel panel1=new JPanel(new GridLayout(7,4));
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(label3);
		panel1.add(label4);
		panel1.add(label5);
		panel1.add(label11);
		panel1.add(label17);
		panel1.add(label23);
		panel1.add(label6);
		panel1.add(label12);
		panel1.add(label18);
		panel1.add(label24);
		panel1.add(label7);
		panel1.add(label13);
		panel1.add(label19);
		panel1.add(label25);
		panel1.add(label8);
		panel1.add(label14);
		panel1.add(label20);
		panel1.add(label26);
		panel1.add(label9);
		panel1.add(label15);
		panel1.add(label21);
		panel1.add(label27);
		panel1.add(label10);
		panel1.add(label16);
		panel1.add(label22);
		panel1.add(label28);
		
		JPanel panel3=new JPanel();
		panel3.add(panel1);
		panel3.setBorder(new TitledBorder(new EtchedBorder(),"Esami"));
		
		JPanel panel=new JPanel(new GridLayout(2,1));
		panel.add(panel3);
		panel.add(panel2);
		add(panel);
	}
	
	private JLabel ben,media;
	private JButton chiudi;
	private String user;
	private Università uni;
}
