import java.util.Comparator;

public class ClassiComparator implements Comparator<Messaggio>
{
	public int compare(Messaggio m1,Messaggio m2)
	{
		if(m1.getDate().before(m2.getDate()))
			return -1;
		else if(m1.getDate().after(m2.getDate()))
			return 1;
		return 0;
	}
}
