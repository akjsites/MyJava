package library;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import vector.iterator;

public class Library {
         public void displayAvailableBooks(Vector<book> book)
         {
        	     book.forEach(b->System.out.println(b));
         }
         
         
         public void issueBook(Vector<book> book, Scanner sc)
         {
        	   sc=new Scanner(System.in);
        	   System.out.println("enter book id");
           int check=Integer.parseInt(sc.next());
           boolean isavail=false;
           Iterator<book> iterator= book.iterator();
           while(iterator.hasNext())
           {
        	        book bokBook=iterator.next();
        	        if(bokBook.id()==check)
        	        {
        	        	     isavail=true;
        	        	     iterator.remove();
        	        }
           }
           if(isavail)
           {
        	         System.out.println("book is remove sucessFully");
           }
           else
           {
  	         System.out.println("book is not remove");

           }
         }
         
         
         
         public void isavaileble(Vector<book> book, Scanner sc)
         {
        	 System.out.println("enter book name");
           String check=sc.next();
           boolean isavail=false;
           Iterator<book> iterator= book.iterator();
           while(iterator.hasNext())
           {
        	        book bokBook=iterator.next();
        	        if(bokBook.name().equals(check))
        	        {
        	        	     isavail=true;
        	        	     System.out.println();
        	        }
           }
           if(isavail)
           {
        	         System.out.println("book is found sucessfully");
           }
           else
           {
  	         System.out.println("book is not found");

           }
         }
         
         
         
}
 