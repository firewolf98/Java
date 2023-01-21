
public class BilancioNegativo extends RuntimeException
{
	public BilancioNegativo(String s)
	{
		super(s);
	}
	
	public BilancioNegativo()
	{
		super("Credito non sufficiente");
	}
}
