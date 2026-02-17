package static_program;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
	StudentFile student=new  StudentFile();
	Scanner kk=new Scanner(System.in);
	System.out.print("Enter the student roll no :");
	int r=Integer.parseInt(kk.nextLine());
	System.out.print("Enter the student Name :");
	String s=kk.nextLine();
	System.out.print("Enter the student Address :");
	String a=kk.nextLine();
	student.getStudentData(r, s, a);
	student.getStudentData();
	kk.close();
	}

}
