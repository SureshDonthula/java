package exceptionhandlling;
/*if an exception occurs in the program the compiler stops execution 
 * and throws exception, to compile and execute good code we have
 * to put the code(we are expecting error from) in a try block and 
 * catch exception using catch block */
public class Exceptionhand {

	public static void main(String[] args) {
		try {
              int i=9;
              int j=0;
              int k = i/j;/*if exception occurs here below statements
               not executed directly it throws exception to catch block
                if you want some statements to be executed you can write in 
                finally block*/ 
              System.out.println("hello");
		    }
		catch(Exception e)
		{  
			/*exception is a class, try block throws the object */
			System.out.println("Error ");
		}
		finally {
/*if want some statements to be executed even we have exception
 *  we can write in the finally block*/
			System.out.println("i will be executed even you get an exception");
		}
	}

}
