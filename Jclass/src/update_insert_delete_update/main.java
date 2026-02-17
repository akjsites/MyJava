package update_insert_delete_update;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		employee employee=new employee(0, null, 0);
		while(true)
		{
			
			System.out.println("1.insert 2.delete 3.update 4.select 5 exit");
			System.out.println("Enter Your Choice ");
			int number=scanner.nextInt();
			switch(number)
			{
			case 1->{
				System.out.println("Enter Your id ");
				     int id=scanner.nextInt();
				     System.out.println("Enter Your name ");
			         String nameString=scanner.next();
			         System.out.println("Enter Your bal ");
			         double bal=scanner.nextDouble();
			         employee=new employee(id, nameString, bal);
			         System.out.println("row inserte"+employee.insert(employee));
			}
			case 2->{
				System.out.println("Enter Your id ");
				     int id=scanner.nextInt();
			
				     employee.setId(id);
			         System.out.println("row deleteed"+employee.delete(employee));
			}
			case 3->{
				System.out.println("Enter Your id ");
			     int id=scanner.nextInt();
			     System.out.println("Enter Your name ");
		         String nameString=scanner.next();
		         System.out.println("Enter Your bal ");
		         double bal=scanner.nextDouble();
			
				     
				     employee.setName(nameString);
				     employee.setBal(bal);
				     employee.setId(id);
			         System.out.println("row selected "+employee.Update(employee));
			}
			case 4->{
				
			         System.out.println("row selected "+employee.select(employee));
			}
			case 5->{
				System.out.println("thank You ");
				System.exit(0);
		}
			
			}
		}
	}

}
