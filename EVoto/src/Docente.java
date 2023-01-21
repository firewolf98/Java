import java.io.Serializable;

public class Docente implements Serializable
{
	private static final long serialVersionUID = -81826030420895232L;

	public Docente(String nome,String cognome,String login,String password,String insegnamento,int x)
	{
		name=nome;
		surname=cognome;
		user=login;
		pass=password;
		insegn=insegnamento;
		y=x;
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
	
	public String getInsegn()
	{
		return insegn;
	}
	
	public int getCorso()
	{
		return y;
	}
	
	private String name,surname,user,pass,insegn;
	private int y;
}
