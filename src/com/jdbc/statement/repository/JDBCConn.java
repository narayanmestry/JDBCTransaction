package com.jdbc.statement.repository;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConn {
	static String url = "jdbc:mysql://localhost:3306/JDBCTransaction";
	static String username = "root";
	static String password = "root";

	public static Connection getConnection() {
		try {
			Driver d = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(d);
			Connection conn = DriverManager.getConnection(url, username, password);
			return conn;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

}
