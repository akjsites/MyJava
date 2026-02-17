package day1;

public record studentdetail(String name,EducationInstitute ed) {
    public void 	viewCoursesAndFees()
    {
       Course []corCourses=ed.course();
       for(Course v:corCourses)
       {
    	   System.out.println(v);
       }
    }
  
    public void 	enrollid(int id)
    {
    	      
    	       ed.enrollStudentInCourse(id, name);
    }

}
