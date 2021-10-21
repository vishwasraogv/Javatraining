package xyz;

import java.util.Scanner;

public class Sumnaturalno {
	public static void main(String args[])
	{
	System.out.println("Enter lower limit");
	Scanner sc = new Scanner(System.in);
	int l = sc.nextInt();
	int l1 = l;
	System.out.println("ENter the upper limit");
	int u = sc.nextInt();
	int i;
	for(i=l+1;i<=u;i++)
	{
		l = l+i;
	}
	System.out.println("Sum of Natural numbers from  " + l1 + "  to  " + u + "  is  " + l);
	

}
}
