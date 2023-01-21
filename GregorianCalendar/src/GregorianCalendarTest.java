import java.util.GregorianCalendar;

public class GregorianCalendarTest 
{
	public static void main(String[] args) 
	{
		GregorianCalendar dataAttuale = new GregorianCalendar();
		GregorianCalendar data1 = new GregorianCalendar(2008, 11, 18);
		int anno = dataAttuale.get(GregorianCalendar.YEAR);
		int mese = dataAttuale.get(GregorianCalendar.MONTH) + 1;
		int giorno = dataAttuale.get(GregorianCalendar.DAY_OF_MONTH);
		int ore = dataAttuale.get(GregorianCalendar.HOUR);
		int minuti = dataAttuale.get(GregorianCalendar.MINUTE);
		int secondi = dataAttuale.get(GregorianCalendar.SECOND);
		System.out.println(anno);
		System.out.println(mese);
		System.out.println(giorno);
		System.out.println(ore);
		System.out.println(minuti);
		System.out.println(secondi);
		GregorianCalendar data2 = new GregorianCalendar(2007,11, 10);
		if (data1.before(data2))
			System.out.println("data 1 precede data 2"); 
		else if (data1.after(data2)) 
			System.out.println("data 2 precede data 1"); 
		else 
			System.out.println("Le date sono uguali"); 
		long milliseconds1 = data1.getTimeInMillis();
		long milliseconds2 = data2.getTimeInMillis();
		long diff = milliseconds2 - milliseconds1;
		long diffSeconds = diff / 1000; 
		long diffMinutes = diff / (60 * 1000); 
		long diffHours = diff / (60 * 60 * 1000); 
		long diffDays = diff / (24 * 60 * 60 * 1000); 
		System.out.println(milliseconds1);
		System.out.println(milliseconds2);
		System.out.println(diff);
		System.out.println(diffSeconds);
		System.out.println(diffMinutes);
		System.out.println(diffHours);
		System.out.println(diffDays);
	}
}