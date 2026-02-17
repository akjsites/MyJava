package filestoreinarraylist;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class inputstream {
          public static void main(String[] args) throws IOException {
        	  FileInputStream in=new FileInputStream("A:\\emp.txt");
              ObjectInputStream object=new ObjectInputStream(in);
             try {
              while(true)
              {
            	      System.out.println(object.readObject());
              }
             }
             catch (Exception e) {
				System.out.println("not finds");
			}
              
		}
}
