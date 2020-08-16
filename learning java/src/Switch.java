
public class Switch {
     public static void main(String [] args)
     {
//     if one matches it automatically executes all statements below even 
//    	 case not matches thats why we need a break statements
    	 int n=2;
    	 switch(n)
    	 {
    	 case 1:
    		 System.out.println("one");
    	 case 2:
    		 System.out.println("two");//executes
    	 case 3://executes as well cause there is no break statement above
    		 System.out.println("three");
    		 
    	 }
    	 int m=4 ;
    	 switch(m)
    	 {
    	 case 1 :
    	 case 2 :
    	        System.out.println("hi");
    	        break;
    	 case 3:
    	 case 4 :
    		  System.out.println("hello");
    	        break;
    	 }
    	 
     }
     
}
