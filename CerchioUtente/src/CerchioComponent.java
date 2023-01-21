import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class CerchioComponent extends JComponent
{
	public CerchioComponent(double x)
	{
		this.x=x;
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2=(Graphics2D) g;
		Ellipse2D.Double frontTire= new Ellipse2D.Double(0,0,x,x);
		g2.draw(frontTire);
	}
		
	private double x;
}