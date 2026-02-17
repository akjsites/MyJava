package the_real_world_java_projects;

public class FullTimeEmployee extends employee{
	private double monthlySalary;
	
	public FullTimeEmployee(String employeeId, String name, String email, double monthlySalary) {
		super(employeeId, name, email);
		if(monthlySalary<=0)
		{
			System.out.println("valid ");
			System.exit(0);
		}
		this.monthlySalary = monthlySalary;
	}
	public  double caculatesalary()
	{
		return monthlySalary;
	}
	public String getBenefits()
	{
		return "Health Insurance, Paid Leave, Retirement Plan";
	}
	@Override
	public String toString() {
		return "FullTimeEmployee [getEmployeeId=" + getEmployeeId() + ", getName =" + getName() + ", getEmail="
				+ getEmail() + ", getClass=" + getClass()  + ", monthlySalary= $" + monthlySalary + "]";
	}
	
	
	
}
