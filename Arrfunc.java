package xyz;

import java.util.Scanner;

public class Arrfunc {
	public static void main(String args[])
	{
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the values");
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		Mularray(arr);
		Addarray(arr);
		
		
	}
	public static void Addarray(int[] arr)
	{
		int sum=0;
		for(int i = 0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum = "+sum);
		
		
	}
	public static void Mularray(int[] arr)
	{
		int product=1;
		for(int i = 0;i<arr.length;i++)
		{
			product = product * arr[i];
		}
		System.out.println("Product = "+product);
		
	}

}
