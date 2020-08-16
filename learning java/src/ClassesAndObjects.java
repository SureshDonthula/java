class Krishna{
		String name1="suresh";//we can directly initialize here if we want
		String name2;
		String supreme;
		
		public void addStrings()
		{
			supreme =name1+name2;
		}
  }
public class ClassesAndObjects {
	
	

	public static void main(String[] args) {
		
       Krishna obj; //reference
       obj = new Krishna();
       //instead of this we can write in single line i.e 
       // Krishna obj = new Krishna();
       System.out.println(obj.name1);
       obj.name1="Radha";
       obj.name2="Krishna";
       obj.addStrings();
       System.out.println(obj.supreme);
       
       
	}

}
