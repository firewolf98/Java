import java.io.Serializable;
import java.util.ArrayList;

public class Mensa implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5945312831719671302L;
	public Mensa()
	{
		piatti=new ArrayList<Piatto>();
		clienti=new ArrayList<Cliente>();
	}
	
	public void addCliente(Cliente c)
	{
		clienti.add(c);
	}
	
	public void addPiatto(Piatto p)
	{
		piatti.add(p);
	}
	
	public ArrayList<Piatto> getPiatti()
	{
		return piatti;
	}
	
	public ArrayList<Cliente> getClienti()
	{
		return clienti;
	}
	
	public boolean controllo(String log,String pass)
	{
		for(int i=0;i<clienti.size();i++)
			if(clienti.get(i).getLogin().equals(log)&&clienti.get(i).getPassword().equals(pass))
				return true;
		return false;
	}
	
	public int getIndice(String user)
	{
		int index=0;
		for(int i=0;i<clienti.size();i++)
			if(clienti.get(i).getLogin().equals(user))
				index=i;
		return index;
	}
	
	private ArrayList<Piatto> piatti;
	private ArrayList<Cliente> clienti;
}