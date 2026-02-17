package com.aswini.tax;

public class Manager {
	private int ManagerId;
	private String ManagerName;
	private double ManagerbasicSalary;
	private double ManagerHRAper;
	private double ManagerDAper;
	private double ManagerprojectAllowance;
	
	public Manager(int managerId, String managerName, double managerbasicSalary, double managerHRAper,
			double managerDAper, double managerprojectAllowance) {
		super();
		ManagerId = managerId;
		ManagerName = managerName;
		ManagerbasicSalary = managerbasicSalary;
		ManagerHRAper = managerHRAper;
		ManagerDAper = managerDAper;
		ManagerprojectAllowance = managerprojectAllowance;
	}

	public double calculateGrossSalary()
	{
		return ManagerbasicSalary +ManagerHRAper +ManagerDAper+ ManagerprojectAllowance;

	}
}
