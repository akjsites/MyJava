package Book;

import java.util.Scanner;

import booking.CabCustomerServiceTester;

public class amain {

	public static void main(String[] args) {
		Library library=new Library();
		while(true)
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("1. Add Book\r\n"
					+ "2. Display Books\r\n"
					+ "3. Update Quantity\r\n"
					+ "4. Delete Book\r\n"
					+ "5. Exit\r\n"
					+ "Choose an option: ");
			int num=scanner.nextInt();
			switch(num)
			{
			case 1->{
				
				System.out.println("Enter Title:");
				String Title=scanner.next();
				System.out.println("Enter Author:");
				String Author=scanner.next();
				System.out.println("Enter ISBN:");
				Long ISBN=Long.parseLong(scanner.next());
				System.out.println("Enter Price:");
				double Price=Double.parseDouble(scanner.next());
				System.out.println("Enter Quantity:");
				int Quantity=Integer.parseInt(scanner.next());
				library.addBook(new Book(Title, Author, ISBN, Price, Quantity)); 
				
			} 
			case 2->{library.displayAllBooks();}
			case 3->{
				System.out.println("Enter ISBN:");
				Long ISBN=Long.parseLong(scanner.next());
				library.updateBookQuantityByISBN(ISBN);
			}
			case 4->{
				System.out.println("Enter Title:");
				String Title=scanner.next();
				library.deleteBookByTitle(Title);
			}
			case 5->{System.exit(0);}
			}
		}

	}

}
