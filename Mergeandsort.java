package xyz;

import java.util.Arrays;

public class Mergeandsort {
	public static void main(String args[])
	{
		int[] firstArray = {2,4,1,7,5,9,0};         
		int[] secondArray = {77,11,45,88,32,56,3};    
		int fal = firstArray.length;          
		int sal = secondArray.length;     
		int[] result = new int[fal + sal];    
		System.arraycopy(firstArray, 0, result, 0, fal);  
		System.arraycopy(secondArray, 0, result, fal, sal);  
		System.out.println(Arrays.toString(result));      
		
		 Arrays.sort(result);
		 System.out.println("Sorted array is");
		 for(int i = 0; i<=result.length;i++)
		 System.out.println(result[i]);
		 
		
		
		  
	}

}
