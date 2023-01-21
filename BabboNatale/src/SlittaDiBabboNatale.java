import java.util.ArrayList;
import java.util.GregorianCalendar;

public class SlittaDiBabboNatale 
{
	public SlittaDiBabboNatale(int pesomassimo)
	{
		pesomax=pesomassimo;
		pesoreg=0;
		regali=new ArrayList<Regalo>();
	}
	
	public void aggiungiRegalo(Regalo r) throws PesoMaxSuperatoException
	{
		pesoreg=pesoreg+r.getPeso();
		if(pesoreg>pesomax) 
		{
			pesoreg=pesoreg-r.getPeso();
			throw new PesoMaxSuperatoException();
		}
		else
			regali.add(r);
	}
	
	public int calcolaCosto()
	{
		int sum=0;
		for(int i=0;i<regali.size();i++)
			sum=sum+regali.get(i).calcolaCosto();
		return sum;
	}
	
	public String spedisci()
	{
		String s="";
		GregorianCalendar data=new GregorianCalendar();
		GregorianCalendar data2=new GregorianCalendar(data.get(GregorianCalendar.YEAR),data.get(GregorianCalendar.MONTH),data.get(GregorianCalendar.DAY_OF_MONTH)+1);
		GregorianCalendar data3=new GregorianCalendar(data.get(GregorianCalendar.YEAR),data.get(GregorianCalendar.MONTH),data.get(GregorianCalendar.DAY_OF_MONTH)+2);
		for(int i=0;i<regali.size();i++)
			if(regali.get(i).getRegione().equals("Nord"))
			{
				regali.get(i).setData(data);
				s=s+regali.get(i).toString();
			}
		for(int i=0;i<regali.size();i++)
			if(regali.get(i).getRegione().equals("Centro"))
			{
				regali.get(i).setData(data2);
				s=s+regali.get(i).toString();
			}
		for(int i=0;i<regali.size();i++)
			if(regali.get(i).getRegione().equals("Sud"))
			{
				regali.get(i).setData(data3);
				s=s+regali.get(i).toString();
			}
		return s;
	}
	
	private ArrayList<Regalo> regali;
	private int pesomax,pesoreg;
}