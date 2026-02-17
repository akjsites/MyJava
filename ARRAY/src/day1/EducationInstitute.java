package day1;

public record EducationInstitute( Course[] course,Offer[] Offer) {
	
	public void enrollStudentInCourse(int courseId, String studentName)
	{
		
		boolean isflag=false;
		for(int i=0;i<course.length;i++)
		{
			if(course[i].id()==courseId)
			{
				isflag=true;
				System.out.println(Offer[i]);
				System.out.println(studentName+ "enrolled in: "+ course[i].name());
			}
		}
		if(!isflag)
		{
			System.out.println("id not founds");
		}
		
	}
}
