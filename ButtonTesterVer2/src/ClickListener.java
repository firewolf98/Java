import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		System.out.println("I was clicked " + n + " times.");
		n++;
	}
	
	private int n=1;
}