 class Calculator{
	public int add(int ...n)
	{
		int sum=0;
		for(int i : n)
		{
			sum+=i;
		}
		return sum;
	}
}
public class VarArgs {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		System.out.println(obj.add(1,2,3,4,5));
		System.out.println(obj.add(1,2,3,4));
		System.out.println(obj.add(1,2,3));
		System.out.println(obj.add(1,2));
		System.out.println(obj.add(1));
		System.out.println(obj.add());

	}

}
