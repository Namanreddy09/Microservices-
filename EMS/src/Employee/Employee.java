package Employee;

// Creating an Base class for all employees

public abstract class Employee
{
	protected String name;
	protected String id;
	
	public Employee(String name, String id)
	{
		
		this.name = name;
		this.id = id;
	}
	 public abstract void performRole();
}
