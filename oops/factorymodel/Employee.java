package factorymodel;

import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public static Employee createEmployeeObject() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Employee ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter the employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Enter the employee department (Sales, Engineering, HR, Others): ");
        String department = sc.nextLine();

        return new Employee(id, name, salary, department);
    }

    public double calculateAnnualSalary() {
        String dept = department.toLowerCase();
        double bonus = switch (dept) {
            case "sales" -> (salary * 0.10+(salary)) * 12;
            case "engineering" -> (salary * 0.15+(salary)) * 12;
            case "hr" -> (salary * 0.08+(salary)) * 12;
            case "others" -> (salary * 0.05+(salary)) * 12;
            default -> 0.0;
        };
        return bonus;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department +
               ", annual salary=" + calculateAnnualSalary() + "]";
    }
}
