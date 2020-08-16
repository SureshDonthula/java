/*final keyword can be used for three purposes
 * for 1.class 2. method 3. variable 
 * class- final class cant be inherited
 * method- final method cant be overridden
 * variable- it will be a constant we cant change once we initialize     */

final class Prime{
	public void show()//i am writing this method because we cant write sout() directly in class
	                   // it should be written in method only
	{  
		System.out.println("you cant inherit me, try if you want");
	}
}
class Supreme{
	   final int D;//you can initialize here or by constructor, it wont change 
	   public Supreme() //once you have initialized 
	   {
		   D=10;//we write final variable in caps to recognise, even if you wont write 
		         //in caps it works
	   }
	   
          final	public void show()
	{
		System.out.println("you cant override me in any other class, try");
	}
}
public class FinalKeyword {

	public static void main(String[] args) {
		
		   

	}

}
