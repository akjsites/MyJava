package com.aswini.copy_constuctor;

public class Manager {
	int managerId;
	String managerName;
	double managerSalary;
	public Manager(Employee emp1) {
		super();
		this.managerId = emp1.getEmployeeId();
		this.managerName =emp1.getEmplyeeName();
		this.managerSalary =emp1.getEmployeeSalary();
		
	}
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", managerSalary=" + managerSalary
				+ "]";
	}
	
	
}
