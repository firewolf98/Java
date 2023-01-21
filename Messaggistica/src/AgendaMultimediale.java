import java.util.ArrayList;

public class AgendaMultimediale 
{
	public AgendaMultimediale()
	{
		messages=new ArrayList<Messaggio>();
	}
	
	public void addMessage(Messaggio m)
	{
		messages.add(m);
	}
	
	public ArrayList<Messaggio> getMessaggi()
	{
		return messages;
	}
	
	public int getSize()
	{
		return messages.size();
	}
		
	private ArrayList<Messaggio> messages;
}