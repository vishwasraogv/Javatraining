package com.Association;

public class CarTest {
	public static void main(String args[])
	{
		Honda hondaAmaze = new Honda();
		hondaAmaze.setColor("White");
		hondaAmaze.setSpeed(160);
		hondaAmaze.carDetails();
		hondaAmaze.hondaMusicPlayer();
		
		Honda hondaJazz = new Honda();
		hondaJazz.setColor("Black");
		hondaJazz.setSpeed(200);
		hondaJazz.carDetails();
		hondaJazz.hondaStartEngine();
	}

}
