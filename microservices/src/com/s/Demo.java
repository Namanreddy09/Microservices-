package com.s;

public class Demo {

	public static void main(String[] args)
	{
		Employee e = new Employee("John Doe", 50000);
        SalaryCalculator c = new SalaryCalculator();
        EmployeeDatabase db = new EmployeeDatabase();

        double bonus = c.calculateBonus(e);
        System.out.println("Bonus for " + e.getName() + ": " + bonus);
        
        db.saveToDatabase(e);

	}

}
