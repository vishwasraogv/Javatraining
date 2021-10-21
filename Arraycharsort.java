package xyz;

import java.util.Arrays;

public class Arraycharsort {
	public static void main(String args[])
	{
		char cArr[] = {'r','q','s','p'};

	      
	      for (char value : cArr) {
	         System.out.println( value);
	      }
	      Arrays.sort(cArr);
	      System.out.println("The sorted char array is:");
	      for (char number : cArr) {
	         System.out.println( number);
	      }
	   }
	}


