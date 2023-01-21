import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CalcolatriceFrame extends JFrame
{
	public CalcolatriceFrame()
	{
		op1=0;
		op2=0;
		resultLabel=new JLabel("0");
		createResultLabel();
		createButton0();
		createButton1();
		createButton2();
		createButton3();
		createButton4();
		createButton5();
		createButton6();
		createButton7();
		createButton8();
		createButton9();
		createButtonCanc();
		createButtonSum();
		createButtonDiff();
		createButtonMolt();
		createButtonDiv();
		createButtonEquals();
		createPanel();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	public void createResultLabel()
	{
		add(resultLabel,BorderLayout.NORTH);
	}
		
	public void createButton0()
	{
		button0 = new JButton("0");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				if(op1!=0)
				{
					op2=0;	
					resultLabel.setText(op1+op+op2);
				}
				else
				{
					op1=0;
					resultLabel.setText(""+op1);
				}
			}	
		}
		ActionListener listener = new AddInterestListener();
		button0.addActionListener(listener);
	}
	
	public void createButton1()
	{
		button1 = new JButton("1");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				if(op1==0)
				{
					op1=1;
					resultLabel.setText(""+op1);
				}
				else
				{
					op2=1;
					resultLabel.setText(op1+op+op2);				
				}
			}	
		}
		ActionListener listener = new AddInterestListener();
		button1.addActionListener(listener);
	}
	
	public void createButton2()
	{
		button2 = new JButton("2");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				if(op1==0)
				{
					op1=2;
					resultLabel.setText(""+op1);
				}
				else
				{
					op2=2;
					resultLabel.setText(op1+op+op2);
				}
			}	
		}
		ActionListener listener = new AddInterestListener();
		button2.addActionListener(listener);
	}
	
	public void createButton3()
	{
		button3 = new JButton("3");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				if(op1==0)
				{
					op1=3;
					resultLabel.setText(""+op1);
				}
				else
				{
					op2=3;
					resultLabel.setText(op1+op+op2);
				}
			}	
		}
		ActionListener listener = new AddInterestListener();
		button3.addActionListener(listener);
	}
	
	public void createButton4()
	{
		button4 = new JButton("4");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				if(op1==0)
				{
					op1=4;
					resultLabel.setText(""+op1);
				}
				else
				{
					op2=4;
					resultLabel.setText(op1+op+op2);
				}
			}	
		}
		ActionListener listener = new AddInterestListener();
		button4.addActionListener(listener);
	}
	
	public void createButton5()
	{
		button5 = new JButton("5");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				if(op1==0)
				{
					op1=5;
					resultLabel.setText(""+op1);
				}
				else
				{
					op2=5;
					resultLabel.setText(op1+op+op2);
				}
			}	
		}
		ActionListener listener = new AddInterestListener();
		button5.addActionListener(listener);
	}
	
	public void createButton6()
	{
		button6 = new JButton("6");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				if(op1==0)
				{
					op1=6;
					resultLabel.setText(""+op1);
				}
				else
				{
					op2=6;
					resultLabel.setText(op1+op+op2);
				}
			}	
		}
		ActionListener listener = new AddInterestListener();
		button6.addActionListener(listener);
	}
	
	public void createButton7()
	{
		button7 = new JButton("7");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				if(op1==0)
				{
					op1=7;
					resultLabel.setText(""+op1);
				}
				else
				{
					op2=7;
					resultLabel.setText(op1+op+op2);
				}
			}	
		}
		ActionListener listener = new AddInterestListener();
		button7.addActionListener(listener);
	}
	
	public void createButton8()
	{
		button8 = new JButton("8");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				if(op1==0)
				{
					op1=8;
					resultLabel.setText(""+op1);
				}
				else
				{
					op2=8;
					resultLabel.setText(op1+op+op2);
				}
			}	
		}
		ActionListener listener = new AddInterestListener();
		button8.addActionListener(listener);
	}
	
	public void createButton9()
	{
		button9 = new JButton("9");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				if(op1==0)
				{
					op1=9;
					resultLabel.setText(""+op1);
				}
				else
				{
					op2=9;
					resultLabel.setText(op1+op+op2);
				}
			}	
		}
		ActionListener listener = new AddInterestListener();
		button9.addActionListener(listener);
	}
	
	public void createButtonCanc()
	{
		buttoncanc = new JButton("CANC");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				resultLabel.setText("0");
				op1=0;
				op2=0;
				op="";
			}	
		}
		ActionListener listener = new AddInterestListener();
		buttoncanc.addActionListener(listener);
	}
	
	public void createButtonSum()
	{
		buttonsum = new JButton("+");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				op="+";
			}	
		}
		ActionListener listener = new AddInterestListener();
		buttonsum.addActionListener(listener);
	}
	
	public void createButtonDiff()
	{
		buttondiff = new JButton("-");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				op="-";
			}	
		}
		ActionListener listener = new AddInterestListener();
		buttondiff.addActionListener(listener);
	}
	
	public void createButtonMolt()
	{
		buttonmolt = new JButton("*");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				op="*";
			}	
		}
		ActionListener listener = new AddInterestListener();
		buttonmolt.addActionListener(listener);
	}
	
	public void createButtonDiv()
	{
		buttondiv = new JButton(":");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				op=":";
			}	
		}
		ActionListener listener = new AddInterestListener();
		buttondiv.addActionListener(listener);
	}
	
	public void createButtonEquals()
	{
		buttonequals = new JButton("=");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				switch(op)
				{
					case "+": result=op1+op2; break;
					case "-": result=op1-op2; break;
					case "*": result=op1*op2; break;
					case ":": result=op1/op2; break;
				}
				resultLabel.setText(""+result);
			}	
		}
		ActionListener listener = new AddInterestListener();
		buttonequals.addActionListener(listener);
	}
	
	public void createPanel()
	{
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,4));
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(buttoncanc);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(buttonsum);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(buttondiff);
		panel.add(buttonmolt);
		panel.add(button0);
		panel.add(buttondiv);
		panel.add(buttonequals);
		add(panel,BorderLayout.CENTER);
	}
	
	private JLabel resultLabel;
	private JButton button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
	private JButton buttoncanc,buttonpoint;
	private JButton buttonequals,buttonsum,buttondiff,buttonmolt,buttondiv;
	private double op1,op2,result;
	private String op;
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 200;
}