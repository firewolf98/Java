import java.io.Serializable;

public class Cliente implements Serializable
{
	private static final long serialVersionUID = -4423919496090207490L;
	
	public Cliente(String cognome,String nome,String telefono,String numeroCarta)
	{
		surname=cognome;
		name=nome;
		tel=telefono;
		carta=numeroCarta;
	}
	
	public String getCognome()
	{
		return surname;
	}
	
	public String getNome()
	{
		return name;
	}
	
	public String getTelefono()
	{
		return tel;
	}
	
	public String getNumeroCart()
	{
		return carta;
	}
	
	private String name,surname,tel,carta;
}
