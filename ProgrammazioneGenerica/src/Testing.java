import java.util.Scanner;

public class Testing 
{
	public static <E> boolean search(E[] a, E elem)
	{
		for(int i=0;i<a.length;i++)
		{
			if(elem.equals(a[i]))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		String[] a={"1","2","3","4","5","6","7","8","9","0"};
		Scanner in=new Scanner(System.in);
		System.out.println(search(a,in.next()));
	}
}
