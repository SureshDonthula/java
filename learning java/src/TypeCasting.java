
public class TypeCasting {
	public static void main(String[] args)
	{
		//implicit conversion
		double d=5;//narrowing automatically done by compiler no need to type cast
		System.out.println(d);//double will be printed ->5.0
		//type casting manually
		int i =(int)5.555;
		System.out.println(i);//-> 5 integer wii be printed
	}

}
