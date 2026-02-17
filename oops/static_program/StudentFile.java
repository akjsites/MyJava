package com.aswini.static_program;

public class StudentFile {
int studentroll;
String studentName;
String studentAdresss;
static String  intituteName="NARESH IT";
static String Course="JAVA";
public void getStudentData(int roll,String name,String addr) {
	studentroll=roll;
	studentName=name;
	studentAdresss=addr;
}
public void getStudentData() {
	System.out.println("Student rollN0 is :"+studentroll);
	System.out.println("Student name is :"+studentName);
	System.out.println("Student address is :"+studentAdresss);
	System.out.println("Institute name is :"+intituteName);
	System.out.println("course name is :"+Course);
}

}
