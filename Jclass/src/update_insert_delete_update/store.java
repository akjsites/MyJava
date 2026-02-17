package update_insert_delete_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class store implements service{
	String clString="oracle.jdbc.driver.OracleDriver";
    String urlString="jdbc:oracle:thin:@localhost:1521:orcl";
    String userString="c##aswini";
    String passString="2004";
    @Override
	public int insert(employee e) {
		int x=0;
		Connection connection;
		try {
			Class.forName(clString);
			connection = DriverManager.getConnection(urlString,userString,passString);
			PreparedStatement preparedStatement=connection.prepareStatement("insert into empx values(?,?,?)");
			preparedStatement.setInt(1, e.getId());
			preparedStatement.setString(2, e.getName());
			preparedStatement.setDouble(3, e.getBal());
			
			x= preparedStatement.executeUpdate();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return x;
		
		
	}

	@Override
	public int delete(employee e) {
		
		int x=0;
		Connection connection;
		try {
			Class.forName(clString);
			connection = DriverManager.getConnection(urlString,userString,passString);
			PreparedStatement preparedStatement=connection.prepareStatement("delete empx where id=?");
			preparedStatement.setInt(1, e.getId());
			
			
			x= preparedStatement.executeUpdate();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return x;
		
		
	}

	@Override
	public int Update(employee e) {
		int x=0;
		Connection connection;
		try {
			Class.forName(clString);
			connection = DriverManager.getConnection(urlString,userString,passString);
			PreparedStatement preparedStatement=connection.prepareStatement("update empx set name=?,sal=? where id=?");
			preparedStatement.setString(1, e.getName());
			preparedStatement.setDouble(2, e.getBal());
			preparedStatement.setInt(3, e.getId());
			
			x= preparedStatement.executeUpdate();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return x;
	}

	@Override
	public int select(employee e) {
		int count=0;
		
		Connection connection;
		try {
			Class.forName(clString);
			connection = DriverManager.getConnection(urlString,userString,passString);
			PreparedStatement preparedStatement=connection.prepareStatement("select * from empx");
		    ResultSet resultSet=preparedStatement.executeQuery();
		    ResultSetMetaData r=resultSet.getMetaData();
		    if(resultSet.next())
		    {
		    	   for(int i=1;i<=r.getColumnCount();i++)
		    	   {
		    		   System.out.printf("%-20s",r.getColumnName(i));
		    		   
		    	   }
		    	   System.out.print("\n");
		    }
		   do
		    {
		    	   for(int i=1;i<=r.getColumnCount();i++)
		    	   {
		    		   System.out.printf("%-20s",resultSet.getString(i));
		    		   count++;
		    	   }
		    	   System.out.print("\n");
		    }
		    while(resultSet.next());
			
			
		} catch (Exception e1) {
			System.out.println("no row selected");
			
		}
		
		return count;
		
	}
}
