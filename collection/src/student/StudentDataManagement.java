package student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class StudentDataManagement {

	public static void main(String[] args) {
		HashMap<String, Integer> std=new HashMap<>();
		while(true)
		{
			System.out.println("1. Add Student\r\n"
					+ "2. Update Marks\r\n"
					+ "3. Delete Student\r\n"
					+ "4. Search Student\r\n"
					+ "5. Display All Students\r\n"
					+ "6. Show Topper\r\n"
					+ "7. Show Lowest Scorer\r\n"
					+ "8. Show Total and Average Marks\r\n"
					+ "9. Exit\r\n"
					+ "Enter your choice: ");
			
			Scanner scanner=new Scanner(System.in);
			int num=scanner.nextInt();
			switch(num)
			{
			case 1->{
				System.out.println("Enter student name: ");
				String name=scanner.next();
				System.out.println("Enter marks: ");
				int number=scanner.nextInt();
				Integer put = std.put(name,number);
				
				if(put==null)
				{
					System.out.println("Student added successfully!");
				}
			}
			case 2->{
				System.out.println("Enter student name: ");
				String name=scanner.next();
				System.out.println("Enter marks: ");
				Integer number=scanner.nextInt();
				if(std.containsKey(name))
				{
					std.put(name, number);
				}
			}
			case 3->{
				System.out.println("Enter student name: ");
				String name=scanner.next();
				std.remove(name);
			}
			case 4->{
				System.out.println("Enter student name: ");
				String name=scanner.next();
				System.out.println(std.get(name));
			}
			case 5->{System.out.println(std);}
			case 6->{
				Set<Entry<String, Integer>> entrySet = std.entrySet();
				Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
				Integer max=0;
				while(iterator.hasNext())
				{
					
					 Entry<String, Integer> next = iterator.next();
					 if(next.getValue()>max)
					 {
						 max=next.getValue();
					 }
				}
				System.out.println(max);
			}
			case 7->{
				Set<Entry<String, Integer>> entrySet = std.entrySet();
				Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
				Integer min=Integer.MAX_VALUE;
				while(iterator.hasNext())
				{
					
					 Entry<String, Integer> next = iterator.next();
					   
					 if(next.getValue()<min)
					 {
						 min=next.getValue();
					 }
				}
				System.out.println(min);
			}
			case 8->System.exit(0);
			}
		}

	}

}
