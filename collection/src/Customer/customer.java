package Customer;

import java.io.Serializable;
import java.util.Scanner;

public class customer implements Serializable{

		int customerId;
		String customerName;
		double customerBill;
		
	      public customer(int customerId, String customerName, double customerBill) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.customerBill = customerBill;
		}

		  @Override
		  public String toString() {
			return "customer [customerId=" + customerId + ", customerName=" + customerName + ", customerBill="
					+ customerBill + "]";
		  }

		  
	
}
