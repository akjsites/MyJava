package Classnotfound;

public class test {

	public static void main(String[] args) throws ClassNotFoundException {
		ChildClass class1=new ChildClass();
		class1.loadingClass(args[0]);

	}

}
