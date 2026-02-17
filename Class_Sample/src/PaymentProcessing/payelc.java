package PaymentProcessing;

import java.util.Scanner;

public class payelc {

	public static void main(String[] args) {
		Scanner cs =new Scanner(System.in);
		System.out.println("enetr your number");
		int number=Integer.parseInt(cs.nextLine());
        switch(number)
        {
        case 1->{
        	PaymentGateway p1=new PaymentGateway();
        	p1.initiatePayment(new CreditCardPayment());
        }
        case 2->{
        	PaymentGateway p1=new PaymentGateway();
        	p1.initiatePayment(new UPIPayment());
        }
        }
	}

}
