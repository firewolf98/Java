package it.unisa.POO.rectanglemeasurer;

import java.awt.Rectangle;

public class RectangleMeasurer implements Measurer
{
	public double measure(Object anObject)
	{
		Rectangle aRectangle = (Rectangle) anObject;
		double area = aRectangle.getWidth()*aRectangle.getHeight();
		return area;
	}
}