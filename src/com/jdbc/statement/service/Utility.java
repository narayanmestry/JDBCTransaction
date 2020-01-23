package com.jdbc.statement.service;

import java.util.Scanner;

public class Utility {
	static Scanner sc = new Scanner(System.in);
	// TO Input the Character
			public static char inputChar() {
				char c;
				try {
					c = sc.next().charAt(0);
					return c;
				} catch (Exception e) {
					System.out.println("\t\t*****Enter the Char value Only*****");
					sc.next();
					c = sc.next().charAt(0);
				}
				return c;
			}

		// Used to input the String:
			public static String inputString() {
				String str = null;
				try {
					str = sc.next();
					return str;
				} catch (Exception e) {
					System.out.println("\t\t******Enter the Only String******");
					sc.next();
					str = sc.next();
				}
				return str;
			}

		// Used to input the Integer:
			public static int inputNumber() {
				int number = 0;
				try {
					number = sc.nextInt();
					return number;
				} catch (Exception e) {
					System.out.println("\t\t******Enter the Only Integer******");
					sc.next();
					number = inputNumber();
				}
				return number;

			}
}
