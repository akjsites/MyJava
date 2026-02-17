package non_static;

public class Student {
	int studentId ;
		String studentName ;
		int studentMarks; 
	 	char studentGrade;
	public void setStudentData(String name,int id,int mark ) {
		studentName=name;
		studentId=id;
		studentMarks=mark;
	}
	public void calculateGrade() {
		 if(studentMarks>90) {
			 studentGrade='A'; 
		 }
		 else if(studentMarks>80&&studentMarks<90) {
			 studentGrade='B'; 
		 }
		 else if(studentMarks>70&&studentMarks<80) {
			 studentGrade='C'; 
		 }
		 else if(studentMarks>60&&studentMarks<70) {
			 studentGrade='D'; 
		 }
		 else {
			 studentGrade='E'; 
		 }
		
	}
@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ ", studentGrade=" + studentGrade + "]";	
	}


	
}
