import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderFrame extends JFrame
{
	public SliderFrame()
	{
		colorPanel=new JPanel();
		add(colorPanel, BorderLayout.CENTER);
		createRedButton();
		createGreenButton();
		createBlueButton();
		createControlPanel();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	public void createRedButton()
	{
		redButton=new JButton("Rosso");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				colorid=0;
				setSamplecolor();
			}	
		}
		ActionListener listener = new AddInterestListener();
		redButton.addActionListener(listener);
	}
	
	public void createGreenButton()
	{
		greenButton=new JButton("Verde");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				colorid=1;
				setSamplecolor();
			}	
		}
		ActionListener listener = new AddInterestListener();
		greenButton.addActionListener(listener);
	}
	
	public void createBlueButton()
	{
		blueButton=new JButton("Blu");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				colorid=2;
				setSamplecolor();
			}	
		}
		ActionListener listener = new AddInterestListener();
		blueButton.addActionListener(listener);
	}
	
	public void createControlPanel()
	{
		JPanel controlPanel = new JPanel();
		controlPanel.add(redButton);
		controlPanel.add(greenButton);
		controlPanel.add(blueButton);
		add(controlPanel, BorderLayout.SOUTH);
	}
	
	public void setSamplecolor()
	{
		if(colorid==0)
		{
			colorPanel.setBackground(Color.RED);
			colorPanel.repaint();
		}
		else if(colorid==1)
		{
			colorPanel.setBackground(Color.GREEN);
			colorPanel.repaint();
		}
		else
		{
			colorPanel.setBackground(Color.BLUE);
			colorPanel.repaint();
		}
	}
	
	private int colorid;
	private JPanel colorPanel;
	private JButton redButton;
	private JButton greenButton;
	private JButton blueButton;
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;
}