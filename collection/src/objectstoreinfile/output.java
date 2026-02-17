package objectstoreinfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class output {
      public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream inputStream=new FileInputStream("A:\\object.txt");
		var s=new ObjectInputStream(inputStream);
		try{while(true)
		{
			System.out.println(s.readObject());;
		}
		}
		catch (Exception e) {
			System.out.println("error");
		}
	}
}
