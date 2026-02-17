package passby_value;

import java.util.Scanner;

public class busColor {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enetr the how many time to execute the object");
	int noOfObj=sc.nextInt();
	for(int i=1;i<=noOfObj;i++) {
	  Bus bus=Bus.getBusData();
	  System.out.println(bus);
	}
}
}
