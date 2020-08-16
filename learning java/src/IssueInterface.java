/*class A extends B,C if b,c have same methods ambiguity so multiple inheritance not achieved
 * //y with interfaces also
 * class A extends B implements c -> multiple inheritance  */
interface Naresh
{    
	default void  show()
	{
		System.out.println("Naresh");
	}
}
interface Harish
{   
	default void show()
	{
		System.out.println("harish");
	}
}
class Impl implements Naresh,Harish
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Naresh.super.show();
	}
	
}
public class IssueInterface  { 
     
	public static void main(String[] args) {
		 Impl obj = new Impl();
         obj.show();
         
            
	}
         
	
        
}
