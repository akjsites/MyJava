package data_hiding;

public class Employee {
private long employeeNumber;
private String employeeName;
private double employeeSalary;

public Employee(long employeeNumber,String employeeName,double employeeSalary) {
	this.employeeNumber=employeeNumber;
	this.employeeName=employeeName;
	this.employeeSalary=employeeSalary;
	
	getEmployeeDetails();
	calculateSalaryIncrement();
}
public void calculateSalaryIncrement() {
	double updateSalary;
	if(employeeSalary<50000) {
		updateSalary=employeeSalary+(employeeSalary*0.10);
	}
	else if(employeeSalary>=50000 && employeeSalary<=80000) {
		updateSalary=employeeSalary+(employeeSalary*0.07);
	}
	else {
		updateSalary=employeeSalary+(employeeSalary*0.05);
	}
	System.out.println("Employee update salary is :"+updateSalary);
}
public void getEmployeeDetails() {
	System.out.println("Employee number is :"+employeeNumber);
	System.out.println("employee name is :"+employeeName);
	System.out.println("Privious Salary :"+employeeSalary);
	
}
}
