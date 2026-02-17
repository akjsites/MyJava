package filestoreinarraylist;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
record emp(int id,String name) implements Serializable
{

}
public class filestoreinarraylist {

	public static void main(String[] args) throws IOException {
		ArrayList<Object> integers=new ArrayList<>();
		integers.add(new emp(1, "A"));
		integers.add(new emp(2, "B"));
       
		
		FileOutputStream in=new FileOutputStream("A:\\emp.txt");
		ObjectOutputStream object=new ObjectOutputStream(in);
		
		object.writeObject(integers);
		System.out.println("ind");
	}

}
