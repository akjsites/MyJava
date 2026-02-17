package anonomousclassreturn;



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
//		
     System.out.println("Main method started");

	}

}
