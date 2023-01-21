
public class Tester 
{
	public static void main(String[] args) throws BilancioNegativo
	{
		BankAccount b=new BankAccount(10);
		b.deposit(1000);
		b.withdraw(500);
		b.withdraw(600);
	}
}
