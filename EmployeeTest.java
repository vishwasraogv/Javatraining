package com.employeedetail;

public class EmployeeTest {
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.setAge(22);
		System.out.println(e1.getAge());
		e2.setGender("Male");
		System.out.println(e2.getGender());
		e3.setSalary(500000);
		System.out.println(e3.getSalary());
		
		
		
		
	}

}
