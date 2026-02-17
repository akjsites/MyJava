package Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import vector.iterator;

public class Library {
        private  ArrayList<Book> books;
        public Library()
        {
        	     books=new ArrayList<>();
        }
        public void addBook(Book book)
        {
        	    if(searchBookByISBN(book.getIsbn())==null)
        	    {
        	    	books.add(book);
        	    
        	    }
        	    else {
        	    	System.out.println("Book with the same ISBN ..... already exists");
				}
        	    
        }
        
        public void displayAllBooks()
        {
        	    for(Book b:books)
        	    {
        	    	b.displayBook();
        	    }
        }
        public void updateBookQuantityByISBN(long isbn)
        {
        	Book book = searchBookByISBN(isbn);
        
        	if(book==null)
    	    {
    	    	System.out.println("Book not exists");
    	    }
    	    else {
    	    	
    	   Scanner scanner=new Scanner(System.in);
    	   System.out.println("enter number you want in to increse: ");
    	   int number=scanner.nextInt();
    	  
   
    	      book.setQuantity(number);
    	    }		
        }
        public void deleteBookByTitle(String title)
        {
        	         if(title==null)
        	         {
        	        	 System.out.println("Book Title cannot be blank");
        	         }
        	         else {
        	       Iterator<Book> bI=books.iterator();
        	    		   while(bI.hasNext())
        	    		   {
        	    			   Book BooK=bI.next();
        	    			   if(BooK.getTitle().equals(title))
        	    			   {
        	    				  bI.remove();
        	    			   }
        	    		   }
        	  
        	       System.out.println("remove sucessfully");
        	         }
        }
        
        
        
        private Book searchBookByISBN(long isbn)
        {
        	    
        	      Iterator<Book> b=books.iterator();
        	      while(b.hasNext())
        	      {
        	    	   Book B=b.next();
        	    	      if(isbn==B.getIsbn())
        	    	      {
        	    	    	    return B;
        	    	    	    
        	    	      }
        	      }
        	     
					return null;
        
        }
}
