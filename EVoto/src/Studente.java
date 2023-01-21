import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Studente implements Serializable
{
	private static final long serialVersionUID = -3487930882770074163L;
	public Studente(String nome,String cognome,int matricola,String login,String password,String piano)
	{
		name=nome;
		surname=cognome;
		user=login;
		pass=password;
		studi=piano;
		mat=matricola;
		voti=new String[6];
		date=new ArrayList<GregorianCalendar>();
		docenti=new ArrayList<String>();
		setVoti("0",0);
		setVoti("0",1);
		setVoti("0",2);
		setVoti("0",3);
		setVoti("0",4);
		setVoti("0",5);
	}
	
	public String getName() 
	{
		return name;
	}
	
	public String getSurname() 
	{
		return surname;
	}
	
	public String getUser() 
	{
		return user;
	}
	
	public String getPass() 
	{
		return pass;
	}
	
	public String getStudi() 
	{
		return studi;
	}
	
	public int getMat() 
	{
		return mat;
	}
	
	public String[] getVoti()
	{
		return voti;
	}
	
	public void setVoti(String v,int i)
	{
		voti[i]=v;
	}
	
	public double getMedia()
	{
		double media=0;
		double somma=0;
		for(int i=0;i<6;i++)
				somma=somma+Double.parseDouble(voti[i]);
		media=somma/6;
		return media;
	}
	
	public ArrayList<GregorianCalendar> getDate()
	{
		return date;
	}
	
	public void setDate(GregorianCalendar g,int i)
	{
		date.add(i,g);
	}
	
	public void setDocenti(String d)
	{
		docenti.add(d);
	}
	
	public ArrayList<String> getDocenti()
	{
		return docenti;
	}
	
	private String name,surname,user,pass,studi;
	private int mat;
	private String[] voti;
	private ArrayList<GregorianCalendar> date;
	private ArrayList<String> docenti;
}
