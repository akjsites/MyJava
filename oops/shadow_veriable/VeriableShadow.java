package shadow_veriable;

public class VeriableShadow {
	int student=101;
	String name="Kalia";
	static String classW="BCA";
	
public void  accept(String classW) {
//	int student=102;
//	String name="Balia";
	System.out.println("Student Id :"+this.student);
	System.out.println("Student Name :"+this.name);
	System.out.println("Student Class is :"+this.classW);
}
}
