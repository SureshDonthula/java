//primitive int float double char
//wrapper classes Integer,Float, Double, Character 
public class WrapperClasses {

	public static void main(String[] args) {
		
		int i=5;
		Integer wi = new Integer(6);//boxing or wrapping
		System.out.println(wi);
		int j= wi.intValue();//un boxing or un wrapping 
		System.out.println(j);
		Integer wi1= 7;//auto boxing or autowrapping
		System.out.println(wi1);
		int k=wi1;//auto unboxing or auto unwrapping
		System.out.println(k);
	}   
	

}
