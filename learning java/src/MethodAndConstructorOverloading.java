class Casio{

	public void add(int l,int m, int n)
	{
		System.out.println(l+m+n);
	}
	public void add(int l,int m)
	{
		System.out.println(l+m);
	}
	public void add(double l,double m, double n)
	{
		System.out.println(l+m+n);
	}
	
	public void add(double l,int m, float n)
	{
		System.out.println(l+m+n);
	}
}
public class MethodAndConstructorOverloading {

	public static void main(String[] args) {
		
		Casio obj=new Casio();
		obj.add(12, 24);
		obj.add(12, 24,36);
		obj.add(12.0d, 24.0d,36.0d);
		obj.add(12.0d, 24,12.4f);
		
		

	}

}
