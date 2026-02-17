package com.aswini.non_static;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeUpdatation person=new EmployeeUpdatation();
		person.setEmployeeData(101, "Kalia Gouda", 76000);
  
   person.getEmployeeData();
   person.getEmployeeGrade();
	}

}
