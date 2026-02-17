package booking;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomerService {
	 private ArrayList<Customer> customer ;
	public CustomerService() {
		
		this.customer=new ArrayList<>();
	}
	public void addCustomer(Customer cust)
	{
		if(isFirstCustomer(cust)) {
		System.out.println("user alredy hear");
		}
		else {
			this.customer.add(cust);
		}
	}
	private boolean  isFirstCustomer(Customer cust)
	{
		boolean b=false;
		Iterator<Customer> iterator=customer.iterator();
		while(iterator.hasNext())
		{
			Customer customer=iterator.next();
			if(customer.phone().equals(cust.phone()))
			{
				b=true;
			}
			
		}
		if(b)
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	public double calculateBill(Customer customer)
	{
		
		if(!isFirstCustomer(customer))
		{
			return 0;
		}
		else if(customer.distance()<=4)
		{
			return 80;
		}
		else 
		{
			return 80+(2*6);
		}
		
	}
	public void printbill(Customer customer)
	{
		System.out.println(customer.customerName()+" Please pay your bill of Rs. "+calculateBill(customer));
	}
}
