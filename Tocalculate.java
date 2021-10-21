package com.calculate;

public class Tocalculate {
	public static void main(String args[])
	{
		Addition add = new Addition();
		System.out.println(add.Add(2,3));
		Subtraction subt = new Subtraction();
		System.out.println(subt.Subt(3, 2));
		Multiplication multiply = new Multiplication();
		System.out.println(multiply.Multiply(2,3));
	}

}
