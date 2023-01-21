

public class BankAccount 
{
	public BankAccount()
	{
		balance=0;	
	}
	
	public BankAccount (double initialBalance) throws BilancioNegativo
	{
		if(initialBalance<0)
			throw new BilancioNegativo();
		else
			balance=initialBalance;
	}
	
	public void deposit (double amount)
	{
		if(amount==0)
			throw new DepositoNegativo();
		balance=balance+amount;
	}
	
	public void withdraw(double amount)
	{
		if(amount<0||amount>balance)
			throw new AmmontoNegativo();
		balance=balance-amount;
	}
	
	public double getBalance()
	{
		return balance;
	}

	public void transfer(double amount,BankAccount other)
	{
		withdraw(amount);
		other.deposit(amount);
	}
	
	private double balance;
}