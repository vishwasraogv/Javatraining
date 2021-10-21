package xyz;
import java.lang.Math;
import java.util.Scanner;
public class Mathmaxmin {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Max value is " + Math.max(a, b));
		System.out.println("Min value is " + Math.min(a, b));
	}

}
