package parameterize_comstructor;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter The First Name :");
	String fName=sc.nextLine();
	System.out.println("Enter The last Name :");
	String sName=sc.nextLine();
	System.out.println("Enter The Employee Id :");
	int id=sc.nextInt();
	System.out.println("Enter The Employee Salary :");
	double sal=sc.nextDouble();
	System.out.println("Enter The number of Project :");
	int pro=sc.nextInt();
	Employee tcs=new Employee(fName, sName, id,  pro);
	tcs.calculateSalary(sal);
	System.out.println(tcs);
	sc.close();
	}

}
