package encapsulation;

public class Salary {
private String employeeNumber;
private String employeeName;
private double employeeSalary;
public Salary(String employeeNumber, String employeeName, double employeeSalary) {
	super();
	this.employeeNumber = employeeNumber;
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
}
public double getEmployeeSalary() {
	
	return employeeSalary;
}
public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary = employeeSalary;
}
@Override
public String toString() {
	return "employee Number=" + employeeNumber + "\n employee Name=" + employeeName + "\n employee Salary="
			+ employeeSalary + "";
}



}
