package the_real_world_java_projects;

public class Contractor extends employee{
	private double hourlyRate;
    private double hoursWorked;
    
    
	public Contractor(String employeeId, String name, String email, double hourlyRate, double hoursWorked) {
		super(employeeId, name, email);
		if(hourlyRate<=0)
		{
			System.out.println("valid ");
			System.exit(0);
		}
		if(hoursWorked<=0)
		{
			System.out.println("valid ");
			System.exit(0);
		}
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	public  double caculatesalary()
	{
		return hourlyRate*hoursWorked;
	}
	public String getBenefits()
	{
		return "No standard benefits";
	}
	@Override
	public String toString() {
		return "Contractor [getEmployeeId()=" + getEmployeeId() + ", getName()=" + getName() + ", getEmail()="
				+ getEmail() + ", hourlyRate=" + hourlyRate + ", hoursWorked=" + hoursWorked + "total salary "+caculatesalary()+"getBenefits : "+getBenefits()+"]";
	}
	
	
	
}
