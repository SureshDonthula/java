class employee{
	
	String ename;
    int eid;
	int salary;
	static String ceo="suresh";
	
	static
       {
	      ceo="Suresh";// instead of static block we directly itialize as
	                    // static String ceo="suresh"; 
	   }
	}
public class StaticVariables {
	
	static int i=9;

	public static void main(String[] args) {
		employee obj = new employee();
		employee obj1= new employee(); 
		//details of naresh in the companyj
		obj.ename="naresh";
		obj.eid=1;
		obj.salary=10000;
		obj.ceo="suresh";//we can call static variable through object(instance)
		                 //of class as well with class name 
		employee.ceo="krishna";//calling with classname is preferred by compiler
		
		/*static variable is fixed for every class stati variable initiated when
		 * class loaded*/
		
		System.out.println(obj1.ceo);
		//we didnt initiated for obj1 but its showing krishna cause its same for every 
		//instance 
		
		//normal int of class of main method(i.e StaticVariables) cant accessed directly
		//it should be static
		System.out.println(i);
        
        
	}

}
