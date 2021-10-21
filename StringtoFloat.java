package com.employeedetail;

import java.util.Scanner;

public class StringtoFloat {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 strings");
		String s1 = sc.next();
		String s2 = sc.next();
		float sf1 = Float.parseFloat(s1);
		float sf2 = Float.parseFloat(s2);
		System.out.println("Diff is" +  (sf1-sf2));
    }
}
