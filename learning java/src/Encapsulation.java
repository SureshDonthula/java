class Student{
	 private int rollno;
	 private String sname;
	 
	 public void setRollno(int r)//make sure that variable starting letter should be capital
	 {                           //while using get and set methods
		 rollno = r;
	 }
	 public int getRollno()
	 {
		 return rollno;
	 }
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	 
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student s1 = new Student();
          s1.setRollno(5);
         s1.setSname("suresh");
          System.out.println(s1.getRollno());
          System.out.println(s1.getSname());
          
	}

}
