import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InvestmentViewer 
{
	public static void main(String[] args) 
	{
		JFrame frame=new JFrame();
		JLabel rateLabel = new JLabel("Interest Rate: ");
		final int FIELD_WIDTH = 10;
		final JTextField rateField= new JTextField(FIELD_WIDTH);
		rateField.setText("" + DEFAULT_RATE);
		JButton button = new JButton("Add Interest");
		final BankAccount account= new BankAccount(INITIAL_BALANCE);
		final JLabel resultLabel = new JLabel("balance=" + account.getBalance());
		JPanel panel = new JPanel();
		panel.add(rateLabel);
		panel.add(rateField);
		panel.add(button);
		panel.add(resultLabel);
		frame.add(panel);
		
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				double rate=Double.parseDouble(rateField.getText());
				double interest = account.getBalance()* rate / 100;
				account.deposit(interest);
				resultLabel.setText("balance=" + account.getBalance());
			}
		}
		
		ActionListener listener = new AddInterestListener();
		button.addActionListener(listener);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private static final double DEFAULT_RATE = 10;
	private static final double INITIAL_BALANCE = 1000;
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 100;
}