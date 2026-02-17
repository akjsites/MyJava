package shallo_copy;

public class employeeShallow {

	public static void main(String[] args) {
		Employee employee= new Employee("KaliaGouda", 650000);
        System.out.println(employee);
        changeEmplyee(employee);
        System.out.println(employee);
        
	}
	public static void changeEmplyee(Employee person) {
		person.setName("Subham Gouda");
		person.setSalary(person.getSalary()+2000);
		
	}

}
