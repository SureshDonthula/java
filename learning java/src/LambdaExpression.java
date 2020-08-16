//works only with sam interface
/*Types of interfaces
 * Normal - can have multiple abstract methods
 * single abstract method interface (sam)- functional Interface -(in this only we can use lambda expression) from java 1.7
 * marker interface - No methods i.e blanks e.g  Serializable interface */
interface  Lambda
{
	void show();
}

public class LambdaExpression {

	public static void main(String[] args) {
		//Anonymous class 
		Lambda obj = new Lambda() {
			public void show()
			{
				System.out.println("i am overriding by Anonymous class");
			}
		};//semi colon important
		obj.show();
		
		//Lambda method instead of writing big code 
		Lambda obj1 = () -> System.out.println("i am overriding by Lamda Expression");
		obj1.show();
			}
		
		


}
