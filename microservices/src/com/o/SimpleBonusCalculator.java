package com.o;

public class SimpleBonusCalculator implements SalaryCalculator
{
    
	@Override
	public double calculateBonus(Employee employee)
	{
		return employee.getSalary()*0.10;		
	}
	
}
