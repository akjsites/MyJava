package factorymodel;

import java.util.Scanner;

public class CarManiFacturing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter How Many car You will Order :");
		int noOfObj=sc.nextInt();
				for(int i=1;i<=noOfObj;i++) {
					Car car= Car.getCarData();
					System.out.println(car);
				}
		sc.close();

	}

}
