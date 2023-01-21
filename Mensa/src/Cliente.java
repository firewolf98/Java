import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4806712324227979070L;
	public Cliente(String login,String password,String cognome,String nome,double credito,ArrayList<PastoAcquistato> pasti)
	{
		this.login=login;
		this.password=password;
		this.cognome=cognome;
		this.nome=nome;
		this.credito=credito;
		this.pasti=pasti;
	}
	
	public String getLogin()
	{
		return login;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String getCognome()
	{
		return cognome;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public double getCredito()
	{
		return credito;
	}
	
	public ArrayList<PastoAcquistato> getPastiAcquistati()
	{
		return pasti;
	}
	
	public void setCredito(double amount)
	{
		credito=credito-amount;
	}
	
	public void setPasti(PastoAcquistato p)
	{
		pasti.add(p);
	}
	
	private String login,password,cognome,nome;
	double credito;
	private ArrayList<PastoAcquistato> pasti;
}
