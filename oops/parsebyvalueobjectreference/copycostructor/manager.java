package com.aswini.parsebyvalueobjectreference.copycostructor;

public class manager {
        int manegerId;
        String manegerName;
        public manager (student s1)
        {
      	  this.manegerId=s1.getId();
      	  this.manegerName=s1.getName();
        }
        public void show()
        {
        	System.out.println(manegerId);
        	System.out.println(manegerName);
        }
        
}
