class Suresh{
	static void Hello()
	{
		System.out.println("i am from class Hello");
	}
}
public class StaticMethods {
        static void myMethod()
        {
        	System.out.println("i am static method from main method class ");
        }
	public static void main(String[] args) {
		
              myMethod();
              Suresh o =new Suresh();
              Suresh.Hello();
	}

}
