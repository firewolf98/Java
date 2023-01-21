import java.util.*;

public class Lista<E> implements Iterable<E>
{
	private Node<E>[] n;
	
	public Lista()
	{
		n=null;
	}
	
	public void add(E m,int pos)
	{
		for(int i=0;i<pos;i++)
		{
			if(n[0]==null)
			{
				n[0]=new Node<E>(m);
				return;
			}
			if(n[i].getElem().equals(m))
				return;
		}
	}
	
	public Node<E> getNode(int i)
	{
		return n[i];
	}
		
	public Iterator<E> iterator()
	{
		return null;
	}
}