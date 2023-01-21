import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AccountFrame extends JFrame
{
	public AccountFrame()
	{
		account= new BankAccount(INITIAL_BALANCE);
		resultLabel = new JLabel("balance=" + account.getBalance());
		createRateField();
		createButtonDeposit();
		createButtonWithdraw();
		createPanel();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	public void createRateField()
	{
		rateLabel = new JLabel("Amount: ");
		final int FIELD_WIDTH = 10;
		rateField = new JTextField(FIELD_WIDTH);
		rateField.setText("" + DEFAULT_RATE);
	}
	
	public void createButtonDeposit()
	{
		button = new JButton("Deposit");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				account.deposit(Double.parseDouble(rateField.getText()));
				resultLabel.setText("balance=" + account.getBalance());
			}	
		}
		ActionListener listener = new AddInterestListener();
		button.addActionListener(listener);
	}
	
	public void createButtonWithdraw()
	{
		button1 = new JButton("Withdraw");
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				account.withdraw(Double.parseDouble(rateField.getText()));
				resultLabel.setText("balance=" + account.getBalance());
			}	
		}
		ActionListener listener = new AddInterestListener();
		button1.addActionListener(listener);
	}
	
	public void createPanel()
	{
		JPanel panel = new JPanel();
		panel.add(rateLabel);
		panel.add(rateField);
		panel.add(button);
		panel.add(button1);
		add(panel,BorderLayout.NORTH);
		add(resultLabel,BorderLayout.CENTER);
	}
	
	private JLabel rateLabel;
	private JTextField rateField;
	private JButton button,button1;
	private JLabel resultLabel;
	private BankAccount account;
	private static final double DEFAULT_RATE = 10;
	private static final double INITIAL_BALANCE = 1000;
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 200;
}