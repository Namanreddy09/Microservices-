package com.o;

public class EmployeeDatabase implements  EmployeeRepository
{
	@Override
	public void save(Employee employee) 
	{
		System.out.println("Saving" + employee.getName()+" to the database...");
		
	}


}
