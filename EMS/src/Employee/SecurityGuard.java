 package Employee;

//Sub-class that extends Employee and also implements an interface
//here the open closed principle is been used
 
public class SecurityGuard extends Employee implements SecurityGuardActions
{

	public SecurityGuard(String name, String id)
	{
		super(name, id);
		
	}


	@Override
	public void performRole()
	{
		monitorSecurity();
		
	}
	
	@Override
	public void monitorSecurity() 
	{
		System.out.println(name + " is monitoring the security of the premises.");
		
	}

}
