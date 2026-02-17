package elcnew;
import java.util.Scanner;

import blcNew.blcDemo2;
public class elcDemo2 {
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
    	   int a=Integer.parseInt(sc.nextLine());
    	   String b=sc.nextLine();
    	   double c=sc.nextDouble();
		   blcDemo2 lion=new blcDemo2();
		   lion.getData(a, b, c);
		   lion.show();
		   sc.close();
		}
}
