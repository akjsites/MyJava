package com.aswini.assignment;

public class claculatesStudentGrade {

	public static studentGrade claculateGrade(student st)
	{
		int mark=st.getStudentMark();
		double percentage=mark/6;
		if(percentage>=90)
		{
			return new studentGrade(st, 'A',percentage);
		}
		else if(percentage>=75 && percentage<90)
		{
			return new studentGrade(st, 'B',percentage);
		}
		else if(percentage>=60 && percentage<75)
		{
			return new studentGrade(st, 'C',percentage);
		}
		else
		{
			return new studentGrade(st, 'D',percentage);
		}

	}

}
