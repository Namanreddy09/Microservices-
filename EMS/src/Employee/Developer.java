package Employee;

//Sub-class that extends Employee and also implements an interface
//here the open closed principle is been used

public class Developer extends Employee implements DeveloperActions{

	public Developer(String name, String id)
	{
		super(name, id);
		
	}

	@Override
	public void performRole()
	{
		writeCode();
		
	}
	@Override
	public void writeCode()
	{
		System.out.println(name + " is writing code for the system.");
		
	}

}
