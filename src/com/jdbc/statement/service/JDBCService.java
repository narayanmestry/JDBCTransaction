package com.jdbc.statement.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.statement.model.Student;
import com.jdbc.statement.repository.JDBCConn;

public class JDBCService {
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static String qry,name,mobno,city;
	static int id;
	static Student student = new Student();

	// Create TAble ......
	public static void CreateTable() throws SQLException {

		String qry = "create table student" + "(" + "id INT NOT NULL," + "name VARCHAR(45) NOT NULL,"
				+ "mobile_no VARCHAR(45) NOT NULL UNIQUE," + "city VARCHAR(35)" + ")";

		conn = JDBCConn.getConnection();		// Get All Student Data ;
		if (conn != null) {
			stmt = conn.createStatement(); // createStatement() : creates a statement object that can be used to execute
											// SQL queries.
			int i = stmt.executeUpdate(qry);

			if (i == 0) {
				System.out.println("Table Created");
			} else {
				System.out.println("Table Not Create");
			}

		} else {
			System.out.println("Failed");
		}

	}

	// insert Data Using Static Query : createStatement();
	public static void insertData() throws SQLException {
		student = getStudentData(); 
		id = student.getId();
		name = student.getName();
		mobno = student.getMobno();
		city = student.getCity();
		
		qry = "insert into student values('"+id+"','"+name+"','"+mobno+"','"+city+"')";
		
		conn = JDBCConn.getConnection();
		if (conn != null) {
			stmt = conn.createStatement();

			int i = stmt.executeUpdate(qry);
			System.out.println(i);
			if (i > 0) {
				System.out.println("Value Inserted......");
			} else {
				System.out.println("Value not inserted");
			}

		} else {
			System.out.println("Failed to Connect");
		}

	}

	// Get Student Data :
	private static Student getStudentData() {
		System.out.println("Enter the Id :");
		student.setId(Utility.inputNumber());
		
		System.out.println("Enter the Name : ");
		student.setName(Utility.inputString());
		
		System.out.println("Enter the Mobile number ");
		student.setMobno(Utility.inputString());
		
		System.out.println("Enter the City :");
		student.setCity(Utility.inputString());
		
		return student;
	}

	// Delete the DAta :
	public static void deleteData() throws SQLException {
		System.out.println("Enter the Name : ");
		String name = Utility.inputString();
		String qry = "delete FROM student WHERE name = '"+name+"' ";
		
		conn = JDBCConn.getConnection();

		stmt = conn.createStatement();

		int i = stmt.executeUpdate(qry);
		System.out.println(i);
		if (i > 0) {
			System.out.println("Enter Deleted Successfully  : ");
		} else {
			System.out.println("Some Problem Ocuure while Deleting data");
		}

	}

	//Show Data :
	public static void showData() throws SQLException {		
		qry = "select * from student";
		conn = JDBCConn.getConnection();

		stmt = conn.createStatement();
		
		rs = stmt.executeQuery(qry);
		System.out.println("id\tname\tmobile_no\tcity");
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+"\t"
					+ ""+rs.getString("name")+"\t"
							+ ""+rs.getString("mobile_no")+"\t"
									+ ""+rs.getString("city"));
		}
	}

}
