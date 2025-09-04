package org.autoscenariosteps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class dbRepository {

	public static Connection conn = null;

	public Connection init_dbConnection(Properties prop) {

		try {
			
			String msAccDB = prop.getProperty("dbpath");
            String dbURL = "jdbc:ucanaccess://" + msAccDB;
            conn = DriverManager.getConnection(dbURL);
            
		} catch (SQLException e) {
			System.err.println("DB Connection was unsuccessful");
			e.printStackTrace();
		}

		return conn;

	}

	

}
