package xyz;

import java.util.Scanner;

public class Grade 
{
	public static void main(String args[])
    {
    	/* This program assumes that the student has 6 subjects,
    	 * thats why I have created the array of size 6. You can
    	 * change this as per the requirement.
    	 */
        int marks[] = new int[3];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<3; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/3;
        float percent = (total/300)*100;
        System.out.println("Percentage is" + percent);
        System.out.print("The student Grade is: ");
        if(avg>=90)
        {
            System.out.print("A+");
        }
        else if(avg>=80 && avg<90)
        {
           System.out.print("A");
        } 
        else if(avg>=70 && avg<80)
        {
            System.out.print("B+");
        }
        else if(avg>=60 && avg<70)
        {
            System.out.print("B");
        }
        else if(avg>=50 && avg<60)
        {
            System.out.print("C");
        }
        else if(avg>=40 && avg<50)
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("FAIL");
        }
    }
}


