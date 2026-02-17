package Classnotfound;

public class ChildClass extends ParentClass{
	public void loadingClass(String name) 
    {
  	  if(name=="null")
  	  {
  		  
			System.out.println("empty");
		 
  	  }
  	  else {
  	  super.loadingClass(name);
    }
    }
	

}
