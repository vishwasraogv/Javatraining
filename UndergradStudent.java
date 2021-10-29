package com.Association;

public class UndergradStudent extends Student
{
	int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
		

		public void StudentBranch()
		{
			Branch b  = new Branch();
			b.studiesBranch();

		}
		public void StudentSociety()
		{
			Society s = new Society();
			s.collegeSociety();
		}
		
	

}
