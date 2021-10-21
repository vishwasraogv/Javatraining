package xyz;

import java.util.Scanner;

public class SI {
	//3.Input P,R,T and find simple interest
	public static void main(String Args[]) 
	{
		System.out.println("Enter principal");
		Scanner sc = new Scanner(System.in);
		float p = sc.nextFloat();
		System.out.println("Enter rate of interest");
		float r = sc.nextFloat();
		System.out.println("Enter the time period");
		float t = sc.nextFloat();
		System.out.println("Simple Interest = " + (p*t*r/100));
		System.out.println( "By function call    "+ Si(p,r,t));
		
	}
	public static float Si(float p,float r, float t) {
		float si = p*r*t/100;
		return si;
	}

}
