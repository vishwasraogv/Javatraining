package xyz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist1 {
	
	private static int sum(ArrayList<Integer> al1) {
		int sum=0;
		for(int i=0;i<al1.size();i++) {
			sum=sum+al1.get(i);
		}
		return sum;
		}
	
	private static float med(ArrayList<Integer> al1) {
		Collections.sort(al1);
		int s=al1.size();
		float med=0;
		if(s%2!=0)
		
			med=al1.get(s/2);
			else
				med=(float)(al1.get((s/2)-1)+al1.get(s/2))/2;
				return med;
	}
		private static float mean(ArrayList<Integer> al1) {
			int sum=sum(al1);
			float mean=(float)sum/al1.size();
			return mean;
					
		}
		public static void main(String args[]) {
			ArrayList<Integer> al1=new ArrayList();
			Scanner sc=new Scanner(System.in);
					System.out.println("Enter number of Array elements");
			int a=sc.nextInt();
			System.out.println("Enter the elements of the array");
			for(int i=0;i<a;i++)
			{
				al1.add(sc.nextInt());
				
			}
			System.out.println("Median of the arry is "+med(al1));
			System.out.println("Sum of the array is "+sum(al1));
			System.out.println("Mean of the array is "+mean(al1));
		
		}
}
