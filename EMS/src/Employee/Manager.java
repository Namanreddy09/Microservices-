package Employee;

//Sub-class that extends Employee and also implements an interface
//here the open closed principle is been used

public class Manager extends Employee implements ManagerActions
{

	public Manager(String name, String id)
	{
		super(name, id);
		
	}

	@Override
	public void approveLeave()
	{
		approveLeave();
		
		
	}

	@Override
	public void performRole()
	{
		System.out.println(name + " is approving leave for employees");
		
		
	}
	
}
