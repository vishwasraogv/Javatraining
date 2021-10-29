package com.Association;

public class Studentmainclass {
	public static void main(String args[])
	{
		UndergradStudent s1 = new UndergradStudent();
		s1.setName("ABC");
		s1.setCity("Shivamogga");
		s1.setRollno(123);
		System.out.println("Student1's name = " + s1.getName());
		System.out.println("Student1's city = " + s1.getCity());
		System.out.println("Student1's roll no = " + s1.getRollno());
		s1.StudentBranch();
		
		UndergradStudent s2 = new UndergradStudent();
		s2.setName("XYZ");
		s2.setRollno(124);
		s2.setYear(2021);
		System.out.println("Student2's name = " + s2.getName());
		System.out.println("Student2's roll no = " + s2.getRollno());
		System.out.println("Student2's year = "  + s2.getYear());
		s2.StudentSociety();

     }
}
