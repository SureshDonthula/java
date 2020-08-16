/*when you make a class abstract we cant create objects of that class
 * so it needs to be extended 
 * if it has abstract method it should not have implementation i.e body
 * implementation should be provided in extended class
 * if abstract method exists in class class must be abstract
 * it can have constructors and static methods 
 * it can have final methods 
 * */
abstract class Bike {   //abstract class
	abstract public void run();
}
class Honda extends Bike //concrete class
{
	public void run()
	{
		System.out.println("in good condition");
	}
}
public class AbstractDemo 
{
	
	public static void main(String[] args)
	{
		Bike  obj = new Honda();
         obj.run();
	}
}

