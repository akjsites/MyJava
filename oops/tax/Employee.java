package com.aswini.tax;

public class Employee {
	private int EmployeeId;
	private String EmployeeName;
	private double EmployeebasicSalary;
	private double EmployeeHRAper;
	private double EmployeeDAper;
	
	public Employee(int employeeId, String employeeName, double employeebasicSalary, double employeeHRAper,
			double employeeDAper) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeebasicSalary = employeebasicSalary;
		EmployeeHRAper = employeeHRAper;
		EmployeeDAper = employeeDAper;
	}

	public double calculateGrossSalary()
	{
		return EmployeebasicSalary +EmployeeHRAper +EmployeeDAper;

	}
}
