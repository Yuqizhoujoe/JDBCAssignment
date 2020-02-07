package com.company.example;

import com.company.example.Item;

import java.sql.*;
import java.util.ArrayList;

public class Database {
/**
 * Types of drives use in Applicaiton
 *https://www.codejava.net/java-se/jdbc/jdbc-driver-library-download
 * 
 * Connector/J JDBC 
 * (http://www.ccs.neu.edu/home/kathleen/classes/cs3200/JDBCtutorial.pdf)
 * Data Types 
 *  http://www.peachpit.com/articles/article.aspx?p=30885&seqNum=7
 *  
 *      String query = "select * from menu where item=?";				
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1,finditem);	
		ResultSet resultset = ps.executeQuery();
 *
 *
 *Procedural Storage
 *https://www.mysqltutorial.org/calling-mysql-stored-procedures-from-jdbc/
 */
	
	Connection connection ;
	//Connect to Database
	public void connectDatabase() throws  Exception {
		// load the driver
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		// Establish the connection and disabling ssl
		connection = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-OC44VCH\\SQLEXPRESS; " +
				"databaseName=capecodd; integratedSecurity=true");
        System.out.println("Successfully Connected");
	}
	

	//Select all item in the menu list 
	public void selectAll() throws SQLException {
		
		ArrayList<Item> items = new ArrayList<Item>();
	    // creating statement object (allows us to do operation on the database)
		Statement statement= connection.createStatement();
		// Prepare query statement 
		String query= "select * from menu";
		// executing query
		ResultSet resultset = statement.executeQuery(query);
		//		statement.executeUpdate(query);
		while(resultset.next()) {
			
			items.add( new Item(resultset.getString("item_name"),
					resultset.getDouble("price"),
					resultset.getString("description")));		
		}
		
		
		for(Item item : items) {
			System.out.println(item);
		}
	}
	
		
	// update all item price field
//	public int updateItem(String item_name) throws SQLException {
//		String query = "update menu set price=? where item=? ";				
//		PreparedStatement ps = connection.prepareStatement(query);
////		System.out.println("Enter new price of item :");
//		ps.setDouble(1,89898.8989);
//		ps.setString(2,item_name);	
//		// count the amount of row that has been updated
//		return ps.executeUpdate();
//	}
	
	
	
    // close the database 
	public void closeDatabase() throws SQLException {
		if(this.connection != null)
			connection.close();
	}
	
}
