package com.product.main;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.product.bean.account;
import com.product.service.connectionProvide;

public class accountservive implements accountinter{

	@Override
	public int AddCustomer(account p) {
		int row=0;
		try {
		   
		
		try (
			
		    Connection connection=connectionProvide.getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement("insert into account values(?,?,?,?,?,?)");){
			preparedStatement.setInt(1,p.getACCOUNT_NO());
			preparedStatement.setString(2,p.getNAME());
			preparedStatement.setInt(3,p.getADHAR_NO());
			preparedStatement.setString(4,p.getBANK_NAME() );
			preparedStatement.setDouble(5,p.getBALANCE());
			preparedStatement.setString(6,p.getADDRESS() );
			row=preparedStatement.executeUpdate();
		} 
		}
		catch (Exception e) {
			if(e instanceof ClassNotFoundException){
			System.out.println("class not found");}
			if(e instanceof SQLException) {
				System.out.println("sqlexption");
				e.printStackTrace();
			}
		}
		return row;
		
	}

	@Override
	public int FetchCustomer() {
		int row=0;
		try {
		   
		
		try (
			
		    Connection connection=connectionProvide.getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement("select * from account");){
	        ResultSet resultSet=preparedStatement.executeQuery();
	        ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
	        while(resultSet.next())
	        {
	        	    for(int i=1;i<=resultSetMetaData.getColumnCount();i++)
	        	    {
	        	    	System.out.printf("%-5s",resultSet.getString(i));
	        	    }
	        	    System.out.print("\n");
	        }
			row++;
		} 
		}
		catch (Exception e) {
			if(e instanceof ClassNotFoundException){
			System.out.println("class not found");}
			if(e instanceof SQLException) {
				System.out.println("sqlexption");
			}
		}
		return row;
	}

	@Override
	public int DeleteCustomer(int p) {
		int row=0;
		try {
		   
		
		try (
			
		    Connection connection=connectionProvide.getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement("delete  account where ACCOUNT_NO=?");){
			preparedStatement.setInt(1,p);
			
			row=preparedStatement.executeUpdate();
		} 
		}
		catch (Exception e) {
			if(e instanceof ClassNotFoundException){
			System.out.println("class not found");}
			if(e instanceof SQLException) {
				System.out.println("sqlexption");
			}
		}
		return row;
		
	}

	@Override
	public int DepositAmount(int id,double balance) {
		int row=0;
		try {
		   
		
		try (
			
		    Connection connection=connectionProvide.getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement("update  account set BALANCE=BALANCE+? where ACCOUNT_NO=?");){
			preparedStatement.setDouble(1, balance);
			preparedStatement.setInt(2, id);
			
			row=preparedStatement.executeUpdate();
		} 
		}
		catch (Exception e) {
			if(e instanceof ClassNotFoundException){
//			System.out.println("class not found");}
//			if(e instanceof SQLException) {
//				System.out.println("sqlexption");
//			}
				e.printStackTrace();
		}
		}
		return row;
		
	}

	@Override
	public int WithdrawAmount(int id,double balance) {
		int row=0;
		try {
		   
		
		try (
			
		    Connection connection=connectionProvide.getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement("update  account set BALANCE=BALANCE-? where ACCOUNT_NO=?");){
			preparedStatement.setDouble(1, balance);
			preparedStatement.setInt(2, id);
			
			row=preparedStatement.executeUpdate();
		} 
		}
		catch (Exception e) {
			if(e instanceof ClassNotFoundException){
			System.out.println("class not found");}
			if(e instanceof SQLException) {
				System.out.println("sqlexption");
//			}
		}
		}
		return row;
	}

	@Override
	public int ViewBalance(int p) {
		int row=0;
		try {
		   
		
		try (
			
		    Connection connection=connectionProvide.getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement("select BALANCE from account where ACCOUNT_NO=?");){
			preparedStatement.setInt(1, p);
	        ResultSet resultSet=preparedStatement.executeQuery();
	        ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
	        while(resultSet.next())
	        {
	        	    for(int i=1;i<=resultSetMetaData.getColumnCount();i++)
	        	    {
	        	    	System.out.print(resultSet.getString(i));
	        	    }
	        	    System.out.print("\n");
	        }
			
		} 
		}
		catch (Exception e) {
			if(e instanceof ClassNotFoundException){
			System.out.println("class not found");}
			if(e instanceof SQLException) {
				e.printStackTrace();
			}
		}
		return row;
	}
}
     
	
