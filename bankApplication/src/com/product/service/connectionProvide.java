package com.product.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionProvide {
	private static String clsaString="oracle.jdbc.driver.OracleDriver";
	private static String urlString="jdbc:oracle:thin:@localhost:1521:orcl";
	private static String userNameString="c##aswini";
	private static String passwordString="2004";
	private static Connection connection;
	private connectionProvide(){
		
	}
	public static Connection getConnection()
	{
		if(connection==null)
		{
			try {
				Class.forName(clsaString);
				Connection connection=DriverManager.getConnection(urlString,userNameString,passwordString);
				return connection;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return connection;
	}
	}
