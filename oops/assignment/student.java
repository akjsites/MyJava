package com.aswini.assignment;

public class student {
    private String studentName;
    private int studentMark;
	public student(String studentName, int studentMark) {
		super();
		this.studentName = studentName;
		this.studentMark = studentMark;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentMark() {
		return studentMark;
	}
	public void setStudentMark(int studentMark) {
		this.studentMark = studentMark;
	}
	@Override
	public String toString() {
		return "studentName=" + studentName +"\n"+ "studentMark=" + studentMark + "";
	}
    
}
