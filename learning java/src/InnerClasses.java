class Outer
{
	int s;
	String i;
	public void show()
	{
		System.out.println("method of outer class");
		
	}
	class Inner
	{
		public void display()
		{
		System.out.println("i am from inner class");
		}
	}
	static class Sinner{
		public void show()
		{
		System.out.println("i am from static inner class");
		}
	}
}
public class InnerClasses {

	public static void main(String[] args) {
	
		/*to create object of normal inner class 
		 * outer.inner= objofouter.new inner(); 
		 * for static inner class 
		 * outer.inner=new outer.inner();
		 * */
		Outer objo = new Outer();
		//calling normal inner class
		Outer.Inner obji =objo.new Inner();
		obji.display();
		
		//calling static inner class
		Outer.Sinner obj= new Outer.Sinner();
		obj.show();

	}

}
