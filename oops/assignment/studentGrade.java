package com.aswini.assignment;

public class studentGrade {
     private student stud;
     private char grade;
     private double perce;
	 public studentGrade(student stud, char grade , double perse) {
		super();
		this.stud = stud;
		this.grade = grade;
		this.perce=perse;
	 }
	 public student getStud() {
		 return stud;
	 }
	 public void setStud(student stud) {
		 this.stud = stud;
	 }
	 public char getGrade() {
		 return grade;
	 }
	 public void setGrade(char grade) {
		 this.grade = grade;
	 }
	 @Override
	 public String toString() {
		return "" + stud + "\n"+"grade=" + grade +"\n"+ "percenatege"+perce;
	 }
     
}
