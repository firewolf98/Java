
public class Product 
{
	public Product(String aDescription, double aPrice)
	{
		description = aDescription;
		price = aPrice;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	private String description;
	private double price;
}