package xyz;

import java.util.Scanner;

public class Table {
	public static void main(String[] args)

	{
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Input the number for which the table is to be generated ");
	   int n = sc.nextInt();
	   
	
	   System.out.print("Input the number upto which the table is to be generated : ");
	   int j = sc.nextInt();

	   System.out.println ("\n");
	   for(int i=0;i<=j;i++)
	  
	     System.out.println(n+" X "+i+" = " +n*i);
	   
	}

}
