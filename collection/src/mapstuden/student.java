package mapstuden;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;



public class student {
    public static void main(String[] args) {
		HashMap<String, List<String>> h=new HashMap<>();
		while(true)
		{
			System.out.println("--- Course Registration Menu ---\r\n"
					+ "1. Register student to course\r\n"
					+ "2. View course-wise student list \r\n"
					+ "3. Remove student from course\r\n"
					+ "4. Exit");
			Scanner scanner=new Scanner(System.in);
			int num=scanner.nextInt();
			switch(num)
			{
			case 1->{
				System.out.println("enter course");
				String courseString=scanner.next();
				System.out.println("enter name");
				String name =scanner.next();
				boolean b = h.computeIfAbsent(courseString, k->new ArrayList<>()).add(name);
				if(b==true)
				{
					System.out.println("register sucessfuly ");
				}
			}
			case 2->{
				Set<Entry<String, List<String>>> entrySet = h.entrySet();
				Iterator<Entry<String, List<String>>> iterator = entrySet.iterator();
				while(iterator.hasNext())
				{
					Entry<String, List<String>> next = iterator.next();
					System.out.println(next.getKey()+"    "+next.getValue());
				}
			}
			case 3->{
				System.out.println("enter course");
				String courseString=scanner.next();
				System.out.println("enter name");
				String name =scanner.next();
				List<String> b = h.computeIfPresent(courseString, (k,v)->{v.remove(name); return v;});
				if(b!=null)
				{
					System.out.println("remove sucessfuly ");
				}
			}
			
			case 4->System.exit(0);
			}
		}
	}
}
