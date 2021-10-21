package com.employeedetail;

import java.util.Scanner;

public class String2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 strings");
		String s1 = sc.next();
		String s2 = sc.next();
		double sd1 = Double.parseDouble(s1);
		double sd2 = Double.parseDouble(s2);
		System.out.println(sd1-sd2);
		
		
	}
}
