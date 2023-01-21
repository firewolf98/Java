import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DisneyFrame extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	public DisneyFrame()
	{
		setTitle("Mondo Disney");
		createPaperino();
		createPaperone();
		createQui();
		createTopolino();
		createMinnie();
		createPluto();
		createPaperina();
		createPanel();
		setSize(600,600);
	}
	
	public void createPaperino()
	{
		paperino=new JButton("Paperino");
		class PaperinoListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				label.setText("Paperino");
				image.setIcon(new ImageIcon());
			}
		}
		ActionListener listener=new PaperinoListener();
		paperino.addActionListener(listener);
	}
	
	public void createPaperone()
	{
		paperone=new JButton("Paperone");
		class PaperoneListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				label.setText("Paperone");
				image.setIcon(new ImageIcon());
			}
		}
		ActionListener listener=new PaperoneListener();
		paperone.addActionListener(listener);
	}
	
	public void createQui()
	{
		qui=new JButton("Qui,Quo,Qua");
		class QuiListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				label.setText("Qui,Quo,Qua");
				image.setIcon(new ImageIcon());
			}
		}
		ActionListener listener=new QuiListener();
		qui.addActionListener(listener);
	}
	
	public void createTopolino()
	{
		topolino=new JButton("Topolino");
		class TopolinoListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				label.setText("Topolino");
				image.setIcon(new ImageIcon());
			}
		}
		ActionListener listener=new TopolinoListener();
		topolino.addActionListener(listener);
	}
	
	public void createMinnie()
	{
		minnie=new JButton("Minnie");
		class MinnieListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				label.setText("Minnie");
				image.setIcon(new ImageIcon("minnie.png"));
			}
		}
		ActionListener listener=new MinnieListener();
		minnie.addActionListener(listener);
	}
	
	public void createPluto()
	{
		pluto=new JButton("Pluto");
		class PlutoListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				label.setText("Pluto");
				image.setIcon(new ImageIcon("pluto.png"));
			}
		}
		ActionListener listener=new PlutoListener();
		pluto.addActionListener(listener);
	}
	
	public void createPaperina()
	{
		paperina=new JButton("Paperina");
		class PaperinaListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				label.setText("Paperina");
				image.setIcon(new ImageIcon("paperina.png"));
			}
		}
		ActionListener listener=new PaperinaListener();
		paperina.addActionListener(listener);
	}
	
	public void createPanel()
	{
		panel=new JPanel(new GridLayout(1,2));
		
		JPanel panel1=new JPanel(new GridLayout(9,1));
		label=new JLabel();
		panel1.add(paperino);
		panel1.add(paperone);
		panel1.add(qui);
		panel1.add(topolino);
		panel1.add(minnie);
		panel1.add(pluto);
		panel1.add(paperina);
		panel1.add(label);
		
		image=new JLabel();
		
		panel.add(panel1);
		panel.add(image);
		
		add(panel);
	}
	
	private JButton paperino,paperina,topolino,minnie,paperone,pluto,qui;
	private JPanel panel;
	private JLabel label,image;
}
