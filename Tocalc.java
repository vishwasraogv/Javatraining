package com.calculatearea;

import com.calculate.Addition;

public class Tocalc {
	
	public static void main(String args[])
	{
		Square sq = new Square();
		System.out.println(sq.square(5));
		Rectangle rect = new Rectangle();
		System.out.println(rect.rectangle(5, 6));
		SquarePerimeter sp = new SquarePerimeter();
		System.out.println(sp.sqperimeter(7));
		RectanglePerimeter rp = new RectanglePerimeter();
		System.out.println(rp.rectperimeter(8, 9));
		
		
		Addition a = new Addition();
		System.out.println(a.Add(2,3));
	}
}
