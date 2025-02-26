package com.o;

public class Demo
{
	public static void main(String[] args)
	{
        Employee e=new Employee("Naman",30000);
		
		SalaryCalculator c=new SimpleBonusCalculator();
		
		double bonus = c.calculateBonus(e);
		System.out.println("Bonus for "+e.getName()+": "+bonus);
		
		EmployeeDatabase db=new EmployeeDatabase();
		db.save(e);

	}



	}


