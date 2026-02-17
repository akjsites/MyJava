package the_real_world_java_projects;

import java.util.Scanner;

public class HRSystem {

	public static void main(String[] args) {
		System.out.println("Select Employee Type:\r\n"
				+ "1. Full-Time Employee\r\n"
				+ "2. Contractor");
		Scanner sc =new Scanner (System.in);
		employee e1=null;
		int x=sc.nextInt();
		switch(x)
		{
		case 1->{
			System.out.println("Enter Employee ID: ");
			String id=sc.next();
			System.out.println("Enter Name: ");
			String name=sc.next();
			System.out.println("Enter Email: ");
			String email=sc.next();
			System.out.println("Enter Monthly Salary: ");
			double salary=sc.nextDouble();
			e1=new FullTimeEmployee(id, name, email, salary);
			System.out.println(e1);
		}
		case 2->{
			System.out.println("Enter Employee ID: ");
			String id=sc.next();
			System.out.println("Enter Name: ");
			String name=sc.next();
			System.out.println("Enter Email: ");
			String email=sc.next();
			System.out.println("Enter hourlyRate: ");
			double hourlyRate=sc.nextDouble();
			System.out.println("Enter hoursWorked: ");
			double hoursWorked=sc.nextDouble();
			e1=new Contractor(id, name, email, hourlyRate, hoursWorked);
			System.out.println(e1);
		}
		}
		
	}

}
