
public class NestedLoops {
    public static void main(String [] args)
    {
    	for(int j=0;j<4;j++)
    	{
			for (int i = 0; i <= 4; i++) {
				System.out.print("* ");
			}
			System.out.println();
    	}
    	System.out.println();
    	for(int j=1;j<=6;j++)
    	{
			for (int i = 1; i <=j; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
    	}
    	System.out.println();
    	for(int j=1;j<=3;j++)
    	{
    		char a=65;
			for (int i = 1; i <=j; i++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
    	}
    	System.out.println();
			for(int i=1;i<=4;i++)
			{
				for(int j1=1;j1<=4;j1++)
				{  
					if(i==1||i==4)
					System.out.print("$ ");
				}
				if(i==2||i==3)
					System.out.print("$     $");
				System.out.println();
			}
    	
    }
}
