class A
{
	int i=10;
	float j=20.5f;//we can initialize here directly if we want
	String suresh;
	
	public A()
	{
		i=15;
		j=25.6f;
	}
	public A(int l,float m)
	{
		i=l;
		j=m;
	}

}
public class Constructors {

	public static void main(String[] args) {
		
		
		A obj =new A();
		
		A obj1=new A(100,125.25f);
		System.out.println(obj1.j);
		System.out.println(obj.j);
		System.out.println(obj.suresh);
		

	}

}
