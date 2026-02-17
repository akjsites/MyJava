package carexc;

import java.util.Scanner;

public class mainclass {
    public static void main(String[] args) throws stop {
		testClass tx1=new testClass();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your acess");
		String carString=sc.nextLine();
        switch (carString) {
		case "go"-> {
			tx1.go("go");
			
		}
		case "move"-> {
			tx1.move("move");
			
		}
		case "puncture"-> {
			tx1.puncture("puncture");
			
		}
		case "carheat"-> {
			System.out.println("number");
			int a=sc.nextInt();
			tx1.carheat(a);
			
		}
		
			
		}
		
		
		
		
	}
}
