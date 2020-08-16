class ThisDemo {
	int a;//instance variable
	int b;
	public void addvariables(int a,int b)
	{
		a=a;//both a's are local variables 
		b=b;
		System.out.println(a);
		System.out.println(b);
	}
	public double addvariables(double a,int b)
	{
		this.a=(int)a;//one instance and one local
		this.b=b;
		return(this.a+this.b);
	}
	
}
public class ThisKeyword {

	public static void main(String[] args) {
    ThisDemo o =new ThisDemo();
	o.addvariables(2, 3);
	  System.out.println(o.a);//instance variable not initialized 
    o.addvariables(3.2d, 4);
      System.out.println(o.addvariables(3.2d, 4));
	}

}
