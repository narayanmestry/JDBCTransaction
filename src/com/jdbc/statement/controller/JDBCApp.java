package com.jdbc.statement.controller;

import java.sql.SQLException;

import com.jdbc.statement.service.JDBCService;
import com.jdbc.statement.service.Utility;

public class JDBCApp {

	public static void main(String[] args) throws SQLException {
		int ch ;
		char c ;
		do {
		System.out.println("Enter the choice \n\t1.Create the table"
				+ "\n\t2.Insert Data"
				+ "\n\t3.DELETE Data"
				+ "\n\t4.Show data");
		ch = Utility.inputNumber();
		switch(ch)
		{
		case 1 : JDBCService.CreateTable();
		break;
		case 2 : JDBCService.insertData();
		break;
		case 3 : JDBCService.deleteData();
		break;
		case 4 : JDBCService.showData();
		break;
		
		
		default :
				System.out.println("Enter the Valid choice :");
		}
		System.out.println("Do you want to Continue ......Press Y or y");
		c = Utility.inputChar();
		}while(c=='Y'||c=='y');
	}

}
