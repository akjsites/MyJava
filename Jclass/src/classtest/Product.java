package classtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Product {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##aswini","2004");
        PreparedStatement preparedStatement=con.prepareStatement("insert into product values(?,?,?,?)");
        PreparedStatement preparedupdate=con.prepareStatement("update product set name=?,price=?,quantity=? where id=?");
        PreparedStatement prepareddelete=con.prepareStatement("delete product where id=?");
        PreparedStatement preparedresult=con.prepareStatement("select * from product order by id asc");
        Scanner scanner=new Scanner(System.in);
        while(true) {
        	System.out.println("1. Insert Product\r\n"
        			+ "2. Update Product Price\r\n"
        			+ "3. Delete Product\r\n"
        			+ "4. View All Products\r\n"
        			+ "5. Exit\r\n"
        			+ "");
        	System.out.println("Enetr Your Choice :");
        	int number=scanner.nextInt();
        	switch(number) {
        	case 1->{
        		System.out.println("Enter Your id:");
            int id=scanner.nextInt();
            System.out.println("Enter Your name:");
            String name=scanner.next();
            System.out.println("Enter Your price:");
            double price=scanner.nextDouble();
            System.out.println("Enter Your quantity:");
            int quantity=scanner.nextInt();
            preparedStatement.setInt(1, id);    
            preparedStatement.setString(2, name);    
            preparedStatement.setDouble(3, price);    
            preparedStatement.setInt(4, quantity);    
            preparedStatement.executeUpdate();
            System.out.println("INSERT sucessfully");
        	}
        	case 2->{
        				System.out.println("Enter Your name:");
                		String name=scanner.next();
                		System.out.println("Enter Your price:");
                		double price=scanner.nextDouble();
                		System.out.println("Enter Your quantity:");
                		int quantity=scanner.nextInt();
                		System.out.println("Enter Your id:");
                		int id=scanner.nextInt();
                		preparedupdate.setString(1, name);
                		preparedupdate.setDouble(2, price);
                		preparedupdate.setInt(3, quantity);
                		preparedupdate.setInt(4, id);    
                		preparedupdate.executeUpdate();
                		System.out.println("Update sucessfully");
        	}
        	case 3->{
			
        		System.out.println("Enter Your id:");
        		int id=scanner.nextInt();
        		
        		prepareddelete.setInt(1, id);    
        		prepareddelete.executeUpdate();
        		System.out.println("delete sucessfully");
	}
        	case 4->{
    			ResultSet r=preparedresult.executeQuery();
    			ResultSetMetaData rsData=r.getMetaData();
    			while(r.next())
    			{
    				for(int i=1;i<=rsData.getColumnCount();i++)
    				{
    					System.out.printf("%-20s",r.getString(i));
    					
    				}
    				System.out.print("\n");
    			}
        	
	}
        	
        	case 5->{ System.out.println("sucess ");   System.exit(0);}
        	}
        
        }
	}

}
