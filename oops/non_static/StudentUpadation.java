package non_static;

import java.util.Scanner;

public class StudentUpadation {

	public static void main(String[] args) {
		Student stu=new Student();
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int roll=sc.nextInt();
		int mark=sc.nextInt();
		stu.setStudentData(name,roll,mark);
		stu.calculateGrade();
		System.out.println(stu);
	}

}
