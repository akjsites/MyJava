package parameterize_comstructor;

import java.util.Scanner;

public class CarModule {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Car Model :");
		String madol=sc.nextLine();
		System.out.print("Enter Car Manufacturing year :");
		int year=sc.nextInt();
		System.out.print("Enter Car Price :");
		double price=sc.nextDouble();
		Car car=new Car(madol, year, price);
		System.out.println(car);
		

	}

}
