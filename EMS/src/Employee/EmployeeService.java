package Employee;

//Managing Employee records class

import java.util.ArrayList;
import java.util.List;

public class EmployeeService
{
   private List<Employee> employees;

   public EmployeeService()
   {
	 employees=new ArrayList<>();
   }
   
   
   //Add employees to the system
   public void addEmployees(Employee employee)
   {
	   employees.add(employee);
   }
   
   //Display all Employees
   
   public void listEmployees()
   {
	   for(Employee employee: employees)
	   {
		   System.out.println("Employee: " + employee.name + ", ID: " + employee.id);
		   employee.performRole();    // Calls the role-specific functionality
	   }
   }
   
   
   

}
