package xyz;

import java.util.Scanner;

public class Switch {
	public static void main(String Args[])
	{
		
		
		System.out.println("1) Add 2 no’s\r\n" + 
				"2) Find average of 2 numbers\r\n" + 
				"3) Check even/odd\r\n" + 
				"4) Check positive or negative number\r\n" + 
				"5) check prime no or not \r\n" + 
				"5) Quit- use exit(0)");
		System.out.println("What do  you wanna do?");
		boolean init = true;
		while(init)
		{
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		  switch(choice){  
		    //Case statements  
		    case 1: 
		    	{
		    		System.out.println("Enter 2 numbers");
		    		float a = sc.nextFloat();
		    		float b = sc.nextFloat();
		    		System.out.println("Sum of two numbers = "+ (a+b));
		    		System.out.println("What do  you wanna do?");
		    	}
		    break;  
		    case 2: {
		    		System.out.println("Enter 2 numbers");
		    		float a = sc.nextFloat();
		    		float b = sc.nextFloat(); 
		    		System.out.println("Avg of two numbers = "+((a+b)/2));
		    		System.out.println("What do  you wanna do?");
		    }
		    break;  
		    case 3: 
		    		{
		    		System.out.println("Enter a number "); 
		    		int no = sc.nextInt();
		    		if((no%2)==0)
		    			System.out.println("The number is even");
		    		else
		    			System.out.println("The number is odd");
		    		}
		    		System.out.println("What do  you wanna do?");
		    
		    break;  
		    case 4: 
		    		{
		    			System.out.println("Enter a number");
		    			int no = sc.nextInt();
		    			if(no<0)
		    				System.out.println("The number is negative");
		    			else 
		    				System.out.println("The number is positive");
		    		}
		    		System.out.println("What do  you wanna do?");
		    		break;
		    case 5: 
		    {
		    	System.out.println("Enter a number");
		    	int no = sc.nextInt();
		    	boolean flag = false;
		    	for (int i = 2; i <= no / 2; ++i) 
		    	{
		    	      if (no % i == 0)
		    	    	  flag = true;
		    	          break;
		    	}
		    	if (!flag)
		    	      System.out.println(no + " is a prime number.");
		    	    else
		    	      System.out.println(no + " is not a prime number.");
		    	System.out.println("What do  you wanna do?");
		    	   break; 
		    }
		    	     
		    case 6:{ init = false;
		    		System.exit(0);
		    		
		    		}
		    default: System.out.println("Please read the menu before entering the choice");
		    { 
		} 
		  }
		}
	}

}
