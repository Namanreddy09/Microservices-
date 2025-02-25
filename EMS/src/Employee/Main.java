package Employee;

//Main class for implementation

public class Main
{
	
 public static void main(String[] args)
 {
     // Create employees
     Employee manager = new Manager("Naman", "001");
     
     Employee developer = new Developer("Panvan", "002");
     
     Employee securityGuard = new SecurityGuard("Arun", "003");

     // Create EmployeeService to manage employees
     EmployeeService s = new EmployeeService();

     
     // Add employees to the system
     s.addEmployees(manager);
     s.addEmployees(developer);
     s.addEmployees(securityGuard);

     
     // List all employees and their roles
     s.listEmployees();
 }
 
}

