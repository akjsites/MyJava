package com.aswini.parameterize_comstructor;

public class Employee {
private String firstName;
private String lastName;
private int employeeId;
private double tSalary;
private int NoOfProject;
public Employee(String firstName, String lastName, int employeeId, int noOfProject) {
	super();
	if(NoOfProject<0) {
		System.err.println("Number of projects cannot be negative");
		System.exit(0);
	}
	this.firstName = firstName;
	this.lastName = lastName;
	this.employeeId = employeeId;
	
	this.NoOfProject = noOfProject;
}
public void calculateSalary(double salary) {
	if(NoOfProject>=5 && NoOfProject<=10) {
		tSalary=salary+5000;
		System.out.println("salary :"+tSalary);
	}
	else if(NoOfProject>=10 && NoOfProject<=20) {
		tSalary=salary+10000;
		System.out.println("salary :"+tSalary);
	}
	else if( NoOfProject>=20) {
		tSalary=salary+15000;
		System.out.println("salary :"+tSalary);
	}
	else {
		System.out.println("salary :"+tSalary);
	}
}
@Override
public String toString() {
	return "firstName=" + firstName + "\n lastName=" + lastName + "\n employeeId=" + employeeId + "\n salary="
			+ tSalary + "\n NoOfProject=" + NoOfProject + "";
}


}
