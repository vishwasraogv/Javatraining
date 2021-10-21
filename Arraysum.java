package xyz;

import java.util.Scanner;

public class Arraysum {
	public static void main(String args[])
	{
		System.out.println("Enter the size of the array1");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		System.out.println("Enter the values");
		for(int i = 0;i<n1;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the size of the array2");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		System.out.println("Enter the values");
		for(int i = 0;i<n2;i++)
		{
			arr2[i] = sc.nextInt();
		}
		Sumarray(arr1);
		Sumarray(arr2);
		System.out.println("The sum of all the numbers in array1 " + Sumarray(arr1));
		System.out.println("The sum of all the numbers in array2 " + Sumarray(arr2));
		System.out.println("The sum of all the numbers in array1 and array2 " + (Sumarray(arr1)+Sumarray(arr2)));
		
		
	}
	public static int Sumarray(int[] arr)
	{
		int sum = 0;
		for(int i = 0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		return sum;
			
	}

}
