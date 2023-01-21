import java.util.*;

public class SommaArrayIterator 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<4;i++)
		{
			a.add(in.nextInt());
		}
		
		System.out.println("Somma: "+somma(a));
		inverte(a);
		System.out.println(a);
		System.out.println(duplica(3,3));
	}

	public static int somma(ArrayList<Integer> a)
	{
		Iterator<Integer> i=a.iterator();
		int somma=0;
		while(i.hasNext())
			somma+=i.next();
		return somma;
	}
	
	public static void inverte(ArrayList<Integer> a)
	{
		int temp1=0,temp2=0;
		for(int j=0;j<a.size()/2;j++)
		{
			temp1=a.get(j);
			temp2=a.get(a.size()-j-1);
			a.set(j,temp2 );
			a.set(a.size()-j-1, temp1);
		}
	}
	
	public static ArrayList<Integer> duplica(Integer v,int n)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			a.add(v);
		return a;
			
	}
	
	
}