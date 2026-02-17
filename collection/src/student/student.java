package student;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;



public class student implements Serializable {

	private    int studentId;
	private   String studentName;
	private  transient double studentFees;
	private  LocalDate dateOfAdmission;
	private student(Integer studentId, String studentName, Double studentFees) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	public static student getStudent()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter the std id:");
		int studentId =scanner.nextInt();
		System.out.print("enter the std name:");
	    String studentName=scanner.next();
		System.out.print("enter the std ?:");
		double studentFees=scanner.nextDouble();
		return new student(studentId, studentName, studentFees);
		
	}
	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission.now() + "]";
	}
	
	
	
	
	
	
}
