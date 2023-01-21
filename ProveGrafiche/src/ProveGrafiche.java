import javax.swing.*;

public class ProveGrafiche 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		final int FRAME_WIDTH = 500;
		final int FRAME_HEIGHT = 500;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Prove");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StringComponent component=new StringComponent();
		frame.add(component);
		frame.setVisible(true);
	}
}