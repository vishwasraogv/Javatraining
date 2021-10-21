package xyz;

import java.util.Scanner;

public class P1 {
	//1.Take the Input from user 2 no’s and find their addition, subtraction, multiplication and division.
public static void main(String args[])
{
	float no1;
	float no2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	no1 = sc.nextFloat();
	no2 = sc.nextFloat();
	System.out.println("Sum = " + (no1+no2));
	System.out.println("Difference = " + (no1-no2));
	System.out.println("Product = " + (no1*no2));
	System.out.println("Quotient = " + (no1/no2));
	
}
}
