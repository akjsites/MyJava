package objectstoreinfile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class objectstoreinfile {

	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		FileOutputStream f=new FileOutputStream("A:\\object.txt");
		var d=new ObjectOutputStream(f);
		System.out.println("enter number you want object store");
		int num=scanner.nextInt();
		for(int i=1;i<=num;i++)
		{
			d.writeObject(employee.inputfile());
		}
		System.out.println("submited sucess fully");
		
	}

}
