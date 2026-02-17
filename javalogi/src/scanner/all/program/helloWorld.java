package scanner.all.program;

import java.util.Scanner;

public class helloWorld {
        public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int r=a%10;
	    while(a>9)a/=10;
	    System.out.println(a+r);
		} 
}
