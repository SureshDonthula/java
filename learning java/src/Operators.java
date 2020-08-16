
public class Operators { 
	public static void main(String []args)
	{
//	arithmetic operators-> +,-,/,%,++,--  ->total 7
//	relational operators ==,!=,+=,-=,>,<	

		int i = 3/2;
		System.out.println(i);
		double d= 3/2;
		System.out.println(d);
		double d2 = (double)3/2;
		System.out.println(d2);
		
//		++c first increments then assigns
		int c =5;
		int t=++c;
		System.out.println("pre increment");
		System.out.println(t);
		System.out.println(c);
		
//	    c++ first assigns then increments
		int m=5;
		int t2=m++;
		System.out.println("post increment");
		System.out.println(t2);
		System.out.println(m);
		
	}

}
