package Classnotfound;

public class ParentClass {
      public void loadingClass(String className) 
      {
    	  try {
    	  Class.forName(className);
    	  System.out.println(className+" Class loaded Sucessfully");
      }
    	  catch (Exception e) {
			System.out.println("error");
		}
      }
     
}
