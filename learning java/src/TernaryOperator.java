
public class TernaryOperator {

	
public static void main(String[] args) {
//		condition? if true: else;
	
	int i=1;
	int j= i>0? 1:2;
	System.out.println(j);
//	max of three numbers
	int p=1,q=2,r=3;
	int max= (p>q)?(p>r?p:r):(q>r?q:r);
	System.out.println(max);
	
	

	}

}
