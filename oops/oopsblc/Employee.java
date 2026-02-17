package oopsblc;

public class Employee {
 int employeeId;
 String employeeName;
 double employeeSalary;
 public void getEmployee(int id,String name,double sal) {
	 employeeId=id;
	 employeeName=name;
	 employeeSalary=sal;
 }
 public void getEmployeeDetail() {
	 System.out.println("Employee id is :"+employeeId);
	 System.out.println("Employee name is: "+employeeName);
	 System.out.println("employee salary is :"+employeeSalary);
 }
}
