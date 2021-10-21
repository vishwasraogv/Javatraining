package xyz;

import java.util.Scanner;

public class Area {
	public static void AreaC(double r)
	{
		double A = 3.14*r*r;
		System.out.println("Area of the circle is " + A);
	}
	public static void main(String args[])
	{
		//2. Input radius and find area of circle. do this by making functions and passing the values

		System.out.println("Enter the radius of the circle");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextFloat();
		AreaC(r);
		}

}
