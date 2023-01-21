import java.io.Serializable;

public class Stanza implements Serializable
{
	private static final long serialVersionUID = 7887426589079762883L;
	
	public Stanza(int numero,int piano,String tipologia,String servizi,int telefono)
	{
		num=numero;
		p=piano;
		tipo=tipologia;
		serv=servizi;
		tel=telefono;
	}
	
	public int getNumero()
	
	{
		return num;
	}
	
	public int getPiano()
	{
		return p;
	}
	
	public String getTipologia()
	{
		return tipo;
	}
	
	public String getServizi()
	{
		return serv;
	}
	
	public int getTelefono()
	{
		return tel;
	}
	
	public int num,p,tel;
	private String tipo,serv;
}
