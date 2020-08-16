class x
{
	public void show()
	{
		System.out.println("in x");
	}
}
class y extends x
{
	public void show()
	{
		System.out.println("in y");
	}
	public void something()
	{
		System.out.println("i am something");
	}
}
class z extends x
{
	public void show()
	{
		System.out.println("in z");
	}
}
public class RunTimePolymorphism {

	public static void main(String[] args) {
		
		x obj = new y();//upcasting
		obj.show();
		obj =new z();//we should not write x obj = new z(); as the reference already created
		obj.show();

	}

}
