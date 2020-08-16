/*same for interfaces and normal class
 * Advantage is it can't use much memory( saves memory)
 * we can't re use anonymous class*/
class Hello
{
	public void show()
	{
		System.out.println("Hello suresh");
	}
}
class Hi extends Hello
{
	public void show()
	{
		System.out.println("i am overiding hello method show by extending class ");
	}
}
public class AnonymousClass {

	public static void main(String[] args) {
		/*if the only purpose of class is to override the method of superclass.
		 * instead of extending and overriding we can do that with anonymous class*/
		Hello  obj = new Hello() {

			public void show()
			{
				System.out.println("i am overiding hello method show with anonymos class");
			}
		};
		obj.show();
		/* normal method of overriding
		 * */
		Hello obj1 = new Hi();
		obj1.show();
	}

}
