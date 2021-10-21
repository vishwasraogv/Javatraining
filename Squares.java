package com.shapescalculate;

public class Squares {
	public void area(int a, int b)
	{
		System.out.println("Parameter type = int , number of parameters = 2");
		System.out.println("Area =" + a*b);
		
	}
	public float area(float a)
	{
		System.out.println("Parameter type = float, Number of parameters = 1");
		System.out.println("Area =" + a*a);
		return a*a;
	}
	
	public int area( int a,int b,int c)
	{
		System.out.println("Parameter type = int, return type = int, number of parameters = 3");
		return a*b*c;
		
	}

}

