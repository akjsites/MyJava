package com.aswini.parsebyvalueobjectreference.copycostructor;

public class student {
      private int studentId;
      private String studentName;
      public student(int studentId,String studentName)
      {
    	  this.studentId=studentId;
    	  this.studentName=studentName;
      }
      public int getId()
      {
    	  return studentId;
      }
      public String getName()
      {
    	  return studentName;
      }
}
