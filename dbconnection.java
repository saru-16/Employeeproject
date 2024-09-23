package com.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
	public static Connection connectWithDb() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sarunaga","root","Lingam5*hotel");
			}
			catch(ClassNotFoundException e) {
				System.out.println("problem is" +e);
			}
			catch(SQLException e) {
				System.out.println("now pb is" +e);
			}
		return con;
	}



}
