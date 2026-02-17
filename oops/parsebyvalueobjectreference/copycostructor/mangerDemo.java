package com.aswini.parsebyvalueobjectreference.copycostructor;

public class mangerDemo {

	public static void main(String[] args) {
		student s1=new student(102, "Aswini");
		manager m1=new manager(s1);
        m1.show(); 
	}

}
