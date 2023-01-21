import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class CountDown // Questo programma collauda la classe Timer
{
	public static void main(String[] args) 
	{
		class CountDown2 implements ActionListener 
		{
			public CountDown2(int initialCount)
			{ 
				count = initialCount;
			}
			
			public void actionPerformed(ActionEvent event)
			{
				if (count >= 0) 
					System.out.println(count);
				count--;
			}
			
			private int count;
		}
		
	CountDown2 listener = new CountDown2(10);
	Timer t = new Timer(1000, listener); 
	t.start();
	JOptionPane.showMessageDialog(null, "Quit?"); 
	System.exit(0);
	}
}