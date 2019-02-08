package com.bl.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Configuration {

	public Connection connectionFields() {
		try {
			String url ="jdbc:mysql://localhost:3306/test";
			String uid ="root";
			String  pwd="bridgeit";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uid,pwd);
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
	}
} 