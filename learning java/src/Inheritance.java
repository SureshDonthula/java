//multi level inheritance
//java cannot perform multiple inheritance
class CasioCal
{
	public int add(int i,int j)
	{
		return (i+j);
	}
}
class CasioCalAdv extends  CasioCal
{
	public int sub(int i,int j)
	{
		return (i-j);
	}
}
class CasioCalSuperAdv extends CasioCalAdv
{
	public int mul(int i,int j)
	{
		return (i*j);
	}
}
public class Inheritance {

	public static void main(String[] args) {
	  
		CasioCalSuperAdv obj = new CasioCalSuperAdv();
		int result1 = obj.add(2, 3);
		int result2 = obj.sub(2, 3);
		int result3 = obj.mul(2, 3);
		System.out.println(result1 +" " + result2 +" "+ result3 +" ");
		System.out.println(obj.sub(2, 3));
	}

}
