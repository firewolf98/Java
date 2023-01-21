import java.util.Scanner;

public class VirgolaMobileExc 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=0,i=0,j=2;
		System.out.println("Quanti numeri max vuoi inserire?");
		n=in.nextInt();
		double somma=0;
		String val;
		while(i<n)
		{
			try
			{
				if(j>=1)
				{
				System.out.println("Inserisci valore");
				val=in.next();
				somma+=Double.parseDouble(val);
				i++;
				j=2;
				}
				else if(j==0)
					break;
			}
			catch(IllegalArgumentException e)
			{
				System.out.println("Per favore,inserisci un numero :)");
				j--;
			}
		}
		System.out.println("La somma è: "+somma);
		in.close();
	}
}
