package the_real_world_java_projects;

public abstract class employee {
	private String employeeId;
	private String name;
	private String email;
	public employee(String employeeId, String name, String email) {
		super();
		if(employeeId.equals(null)||employeeId.trim().isEmpty())
		{
			System.out.println("valid ");
			System.exit(0);
		}
		if(name.equals(null)||name.trim().isEmpty())
		{
			System.out.println("valid ");
			System.exit(0);
		}
		if(email.equals(null)||email.trim().isEmpty())
		{
			System.out.println("valid ");
			System.exit(0);
		}
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
	}
	public abstract double caculatesalary();
	public abstract String getBenefits();
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
