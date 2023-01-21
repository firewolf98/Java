import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BottonTester 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		JButton button = new JButton("Click me!");
		JButton button1 = new JButton("Click me!");
		JPanel panel=new JPanel(new GridLayout(2,1));
		panel.add(button);
		panel.add(button1);
		frame.add(panel);
		ActionListener listener = new ClickListener();
		button.addActionListener(listener);
		ActionListener listener1=new ClickListener();
		button1.addActionListener(listener1);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private static final int FRAME_WIDTH = 100;
	private static final int FRAME_HEIGHT = 60;
}