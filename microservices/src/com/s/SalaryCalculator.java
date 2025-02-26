package com.s;

public class SalaryCalculator 
{
	public double calculateBonus(Employee employee)
	{
        return employee.getSalary() * 0.10;      // 10% bonus
    }

}
