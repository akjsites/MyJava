package com.aswini.oops;

public class factorialCopy {
    public static void main(String[] args) {
		student s1=new student(102);
		manager m1=manager(s1); 
	}

	private static manager manager(student s1) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
class student{
	int id;

	

	public student(int id) {
		super();
		this.id = id;
	}



	public int getId() {
		return id;
	}
	
}
class manager
{
	int id;

	public manager(student s1) {
		super();
		this.id = s1.id;
	}

	

	@Override
	public String toString() {
		return "manager [id=" + id + "]";
	}
	
}
