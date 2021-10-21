package com.shapescalculate;

public class CalculateShapes {
public static void main(String args[])
{
	Squares sq = new Squares();
	sq.area(3);;
	System.out.println(sq.area(3,4,5));
	sq.area(2, 3);
	
}
}
