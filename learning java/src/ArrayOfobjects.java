class ObjectsArray{
	int l=10;
	String m;
	public int method()
	{
		return (l++);
	}
}
public class ArrayOfobjects {

	public static void main(String[] args) {
		
		ObjectsArray s[] = new ObjectsArray[4];//objects are not yet created 
//		 we can't write above statements directly in for loop because we have 
//		to give size for the array when we declared
		
		for(int i=0;i<s.length;i++)
		{
			s[i] = new ObjectsArray();//created objects 
			System.out.println(s[i].method());//using objects
		}
		
	}

}
