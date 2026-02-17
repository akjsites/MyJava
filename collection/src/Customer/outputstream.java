package Customer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class outputstream {
    public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("entre number:");
		FileOutputStream in=new FileOutputStream("A:\\emp.txt");
		ObjectOutputStream oin=new ObjectOutputStream(in);
		int num=scanner.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.print("enter the id:");
			int id=scanner.nextInt();
			System.out.print("enter the name:");
			String name=scanner.next();
			System.out.print("enter the ?:");
			double bill=scanner.nextInt();
			customer customer=new customer(id, name, bill);
			oin.writeObject(customer);
		}
	}
}
