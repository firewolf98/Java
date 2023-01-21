
public class Node<E>
{
	private E value;
	private Node<E> next;
	
	public Node(E value)
	{
		this.value=value;
		this.next=null;
	}
	
	public E getElem()
	{
		return value;
	}

	public Node<E> getNext()
	{
		return next;
	}
}