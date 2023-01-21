import java.util.*;

public class Invoice
{
	public Invoice(Address anAddress)
	{
		items = new ArrayList<LineItem>();
		billingAddress = anAddress;
	}
	
	public void add(Product aProduct, int quantity)
	{
		LineItem anItem = new LineItem(aProduct, quantity);
		items.add(anItem);
	}
	
	public String format()
	{
		String r = " I N V O I C E\n\n" + billingAddress.format() + String.format("\n\n%-30s%8s%5s%8s\n","Description", "Price", "Qty", "Total");
		for (LineItem i : items)
		{
			r = r + i.format() + "\n";
		}
		r = r + String.format("\nAMOUNT DUE: $%8.2f",getAmountDue());
		return r;
	}
	
	public double getAmountDue()
	{
			double amountDue = 0;
			for (LineItem i : items)
			{
				amountDue = amountDue + i.getTotalPrice();
			}
			return amountDue;
	}
	
	private Address billingAddress;
	private ArrayList<LineItem> items;
}