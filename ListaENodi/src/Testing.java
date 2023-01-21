public class Testing
{
	public static void main(String[] args) 
	{
		Lista  l=new Lista();
		l.add("vhj",1);
		l.add("HG",0);
		System.out.println(l.getNode(1).getElem());
		System.out.println(l.getNode(0).getElem());
	}
}