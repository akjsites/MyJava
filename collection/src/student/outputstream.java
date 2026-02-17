package student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class outputstream {
    public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("entre number:");
		FileOutputStream in=new FileOutputStream("A:\\sss.txt");
		ObjectOutputStream oin=new ObjectOutputStream(in);
		int num=scanner.nextInt();
		for(int i=1;i<=num;i++)
		{
			oin.writeObject(student.getStudent());
		}
	}
}

