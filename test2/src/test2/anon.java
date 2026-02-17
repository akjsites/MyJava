package test2;

interface A1 {
	void display();
}
class b1{
	 public static A1 getA1() {
		 return new A1() {
			 public void display() {
				 System.out.println("Hello from anonymous class");
			 }
		 };
	 }
}
public class anon {

	public static void main(String[] args) {
		
     A1 bA1=b1.getA1();
     bA1.display();

	}

}

