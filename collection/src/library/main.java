package library;

import java.util.Scanner;
import java.util.Vector;

public class main {

	public static void main(String[] args) {
		Vector<book> books=new Vector<>();
		books.add(new book(111, "java", "jems"));
		books.add(new book(222, "c", "ritch"));
		books.add(new book(333, "html", "pqr"));
		books.add(new book(444, "spring", "goslig"));
		Scanner scanner=new Scanner(System.in);
		while(true) {
		System.out.println("Select from the Menu :\r\n"
				+ "	 1) Display Books Available in the Library :\r\n"
				+ "	 2) Search a Book in the Library :\r\n"
				+ "	 3) Issue a Book from the Library :\r\n"
				+ "	 4) Exit from the application :\r\n"
				+ "Please Enter your Choice :");
		int number=scanner.nextInt();
		switch(number)
		{
		case 1->new Library().displayAvailableBooks(books);
		case 2->new Library().isavaileble(books, scanner);
		case 3->new Library().issueBook(books, scanner);
		case 4->System.exit(0);
		}
		
		
		
		}
	}

}
