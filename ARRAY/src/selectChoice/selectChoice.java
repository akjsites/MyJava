package selectChoice;

import java.util.Scanner;

public class selectChoice {

	public static void main(String[] args) {
	   String []name= {"Aswini","Aswini","Kumar","Kumar","Kumar","Jena","Jena"};
	   Scanner scanner=new Scanner(System.in);
	   for(int i=0;i<name.length;i++)
	   {
		  
			   System.out.println(name[i]);
		   
	   }
	   System.out.println("Enter The name");
	   String namechoieString=scanner.next();
	   
	   for(int i=0;i<name.length;i++)
	   {
		   
		   if(name[i].equals(namechoieString))
		   {
			   System.out.println(name[i]);
		   }
	   }
		
	}

}
