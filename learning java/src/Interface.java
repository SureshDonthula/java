interface Writer{ // important there is no keyword class here in interface
	 int age = 10;// we havr to assign while declaring itself by default its final
	void dosomething();
	 
	/*by default interface class and methods are public and abstract
	  *we can't define normal methods in interface(but from java 1.7 we can define normal methods 
	      using *default* keyword this methods also supports method overriding using another class 
	* we can't create objects of interface we can create only reference
	* to achieve multiple inheritance we are using interfaces
	* we can implement multiple interfaces to a class but we can't extend multiple classes 
	* we can have static methods also in java from 1.8
	* if we declare variables in interface by default they are final and we have to initialize 
	   while declaring itself*/
default	 void  method()
	  {
		  System.out.println("i am default in interface you can override me ");
	  }
     static void suresh(){
	      System.out.println("you are static suresh");
	      System.out.println(age);
	      // you can call this method dirctly by class name 
      }
}
class Pen implements Writer
{
	public void dosomething()
	{
		System.out.println("hi i am pen");
	}
}
class Pencil implements Writer
{
	/*class pencil extends abc implements Writer 
	 * we can extend and implement a class*/
	public void dosomething()
	{
		System.out.println("hi i am pencil");
	}
	   
	public void  method()
	  {
		  System.out.println("over rided, i am default in interface you can override me ");
	  }
}
class Kit
{
	public void kite(Writer p)
	{
		p.dosomething();
	}
}
public class Interface {

	public static void main(String[] args) {
		
          Kit k  = new Kit();
          Writer pc =new Pencil();
          Writer p = new Pen();
          k.kite(pc);
          k.kite(p);
          p.method();
          pc.method();
          Writer.suresh();
	}

}
