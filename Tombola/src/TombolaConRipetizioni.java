import java.util.HashSet;
import java.util.Random;

public class TombolaConRipetizioni 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> numeriEstratti=new HashSet<Integer>();
		Random generator=new Random();
		int cont=0;
		while(numeriEstratti.size()!=90)
		{
			cont++;
			int numero=1+generator.nextInt(90);
			numeriEstratti.add(numero);
			System.out.println(cont+": "+numero+" ("+numeriEstratti.size()+")");
		}
	}
}