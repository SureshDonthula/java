
public class Arrays {

	public static void main(String[] args) 
	{
		// 1-D array
	    int arr[] = new int[4];//or directly we can initialize like below
	    arr[0]=1;//or int arr[]={1,2,3,4};
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		System.out.println(arr[0]);
		// 2-D array
		int arr2[][]= {
				          { 1,2,3,4},
				          {5,6,7,8},  //comma don't forget
				          {9,10,11,12}
				
	                	};
		System.out.println();
		for( int i=0;i<3;i++)
		{
			for (int j=0;j<4;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		//jagged array
		int jag[][]= { {1,2,3},{3,4},{5}
					
		             };
		System.out.println();
		for(int i=0;i<jag.length;i++)
		{
			for(int j=0;j<jag[i].length;j++)
			{
				System.out.print(jag[i][j]+" ");
			}
			System.out.println();
		}

	}

}
	
