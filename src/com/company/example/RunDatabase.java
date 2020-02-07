package com.company.example;

public class RunDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Database db =  new Database();
		boolean connectToDatabase = true; 
		//Connect to database
		try {
			db.connectDatabase();	
			db.selectAll();
			db.closeDatabase();
			connectToDatabase = false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
