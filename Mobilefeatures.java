package com.Mobile;

public class Mobilefeatures extends MobileProperties {
	public void showproperty()
	{
		System.out.println("Color of the mobile is black overriden");
	}
	public static void main(String args[])
	{
		Mobilefeatures m = new Mobilefeatures();
		m.showproperty();
	}


}
