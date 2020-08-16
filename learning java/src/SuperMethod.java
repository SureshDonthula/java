class P{
	public P()
	{
		System.out.println("in p");
		
	}
	public P(int i)
	{
		System.out.println("in P int");
	}
}
class Q extends P{
	public Q()
	{
		super();//super method is defined even if you wont define it calls the default constructor
		System.out.println("in Q");
	}
	public Q(int i)
	{
		super(i);
		System.out.println("in Q int");
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		Q o = new Q(5);

	}

}
