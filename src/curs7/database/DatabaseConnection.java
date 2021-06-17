package curs7.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	
	static final String URL = "jdbc:mysql://keytraining-demo.c050jeowbe1q.eu-central-1.rds.amazonaws.com:3306/KeyTraining";
	static final String USER = "demouser";
	static final String PASS = "demouser";
	static final String QUERY = "select * from products";
	
	public static void main(String[] args) {
		
		
		dbQuery();

	}

	public static void dbQuery() {

		try {
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			if(conn != null) {
				System.out.println("Conexiune reusita la baza de date");
			}
			
			
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(QUERY);
			
			
			while(result.next()) {
				
				String product = result.getString("ProductName");
				System.out.println(product);
			}
			
		} catch (SQLException e) {
			System.out.println("Nu am putut face conexiunea la baza de date");
			e.printStackTrace();
		}
		
		
	}


}


