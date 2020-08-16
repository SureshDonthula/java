class l
{
	public void show()
	{
		System.out.println("in l");
	}
}
class m extends l
{   @Override//use this key word for compilation error
	public void show()
	{
		System.out.println("in m");
	}
}
public class OverRiding {

	public static void main(String[] args) {
		
		m o = new m();
		o.show();

	}

}
