package day1;

import java.util.Scanner;

public class studentmain {
	public static void main(String[] args) {
		Course []courses= new Course[3];
    	courses[0]=new Course(1, "ravi sir", 35000);
    	courses[1]=new Course(2, "allen sir", 30000);
    	courses[2]=new Course(3, "kishore sir", 32000);
    
    	Offer []ox=new Offer[3];
    	ox[0]=new Offer("Special discount: Get 30% off on all courses!\r\n"
    			+ "Limited time offer: Enroll in any two courses and get one course free!");
    	ox[1]=new Offer("Special discount: Get 20% off on all courses!\r\n"
    			+ "Limited time offer: Enroll in any two courses and get one course free!");
    	ox[2]=new Offer("Special discount: Get 40% off on all courses!\r\n"
    			+ "Limited time offer: Enroll in any two courses and get one course free!"); 
    	
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your name");
		String nameString=scanner.nextLine();
		studentdetail x= new studentdetail(nameString, new EducationInstitute(courses, ox));
		System.out.println("Enter your id");
		int id=scanner.nextInt();
		switch(id)
		{
		case 1->{
			
			x.viewCoursesAndFees();
			x.enrollid(id);
		}
case 2->{
			
			x.viewCoursesAndFees();
			x.enrollid(id);
		}
case 3->{
	
	x.viewCoursesAndFees();
	x.enrollid(id);
}
		}
	}
	
	
}
