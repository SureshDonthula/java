class Java{
	static String source="beginners book";
	static class myNestedClass{
		/*static keyword is used for only nested class not for normal classes
		 * if you remove static from String of class the static class cannot access it
		 * so compiler shows error*/
		 static void display() 
		{
			System.out.println(source);
			
		}
	}
}
public class StaticForClass {

	public static void main(String[] args) {
		
		Java.myNestedClass hari = new Java.myNestedClass();
		hari.display();
		

	}

}