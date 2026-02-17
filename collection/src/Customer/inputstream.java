package Customer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class inputstream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
	     FileInputStream out= new FileInputStream("A:\\emp.txt");
	     ObjectInputStream oout=new ObjectInputStream(out);
	     try {
	     while(true)
	     {
	    	     System.out.println(oout.readObject()); 
	     }
	     }
	     catch (Exception e) {
			System.out.println("data is not found");
		}
	     
	     
	     
	}
}
