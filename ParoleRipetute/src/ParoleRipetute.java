import java.util.HashSet;
import java.util.Scanner;

public class ParoleRipetute 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		HashSet<String> set=new HashSet<String>();
		
		for(int i=0;i<10;i++)
		{
			String s=input.nextLine();
			if(!set.add(s))
				System.out.println("Parola ripetuta: "+s);
		}
		input.close();
	}
}