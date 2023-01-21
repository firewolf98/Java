import java.io.Serializable;
import java.util.ArrayList;

public class Università implements Serializable
{
	private static final long serialVersionUID = -7238548313897113966L;

	public Università()
	{
		studenti=new ArrayList<Studente>();
		docenti=new ArrayList<Docente>();
		reti=new ArrayList<String>();
		sistemi=new ArrayList<String>();
		addPiani();
	}
	
	public void addPiani()
	{
		reti.add("Architettura degli elaboratori");
		reti.add("Programmazione 1");
		reti.add("Programmazione 2");
		reti.add("Programmazione web");
		reti.add("Reti di calcolatori");
		reti.add("Sistemi Operativi");
		
		sistemi.add("Introduzione agli algoritmi e alle strutture dati");
		sistemi.add("Programmazione 1");
		sistemi.add("Base di dati");
		sistemi.add("Programmazione 2");
		sistemi.add("Ingegneria del software");
		sistemi.add("Programmazione distribuita");
	}
	
	public void addStudenti(Studente s)
	{
		studenti.add(s);
	}
	
	public void addDocenti(Docente d)
	{
		docenti.add(d);
	}
	
	public boolean controllaAccesso(String login,String pass)
	{
		for(int i=0;i<studenti.size();i++)
			if(studenti.get(i).getUser().equals(login)&&studenti.get(i).getPass().equals(pass))
				return true;		
		for(int j=0;j<docenti.size();j++)
			if(docenti.get(j).getUser().equals(login)&&docenti.get(j).getPass().equals(pass))
				return true;
		return false;
	}
	
	public boolean controllaReg(String login)
	{
		for(int i=0;i<studenti.size();i++)
			if(studenti.get(i).getUser().equals(login))
				return true;		
		for(int j=0;j<docenti.size();j++)
			if(docenti.get(j).getUser().equals(login))
				return true;
		return false;
	}
	
	public boolean isStudent(String login)
	{
		for(int i=0;i<studenti.size();i++)
			if(studenti.get(i).getUser().equals(login))
				return true;	
		return false;
	}
	
	public int getIndexDoc(String user)
	{
		int j=0;
		for(int i=0;i<docenti.size();i++)
			if(docenti.get(i).getUser().equals(user))
				j=i;
		return j;
	}
	
	public int getIndexStud(String user)
	{
		int j=0;
		for(int i=0;i<studenti.size();i++)
			if(studenti.get(i).getUser().equals(user))
				j=i;
		return j;
	}
	
	public ArrayList<Studente> getStudenti()
	{
		return studenti;
	}
	
	public ArrayList<Docente> getDocenti()
	{
		return docenti;
	}
	
	public ArrayList<String> getReti()
	{
		return reti;
	}
	
	public ArrayList<String> getSistemi()
	{
		return sistemi;
	}
	
	private ArrayList<Studente> studenti;
	private ArrayList<Docente> docenti;
	private ArrayList<String> reti,sistemi;
}
