import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class ImgPan extends JPanel
{
	private static final long serialVersionUID = 1L;

	public ImgPan()
	{
		Toolkit tk = Toolkit.getDefaultToolkit();
		img1 = tk.getImage("book.jpg");
		MediaTracker mt = new MediaTracker(this);
		mt.addImage(img1, 1);
		try 
		{ 
			mt.waitForAll(); 
		}
		catch (InterruptedException e)
		{
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(img1, 0, 0, null);
	}
	
	Image img1;
}