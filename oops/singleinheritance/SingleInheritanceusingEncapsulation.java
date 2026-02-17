package com.aswini.singleinheritance;

class father
{
	private double balance;
	public void setData(double balance)
	{
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	
}
class son extends father
{
      public void show()
      {
    	  System.out.println(getBalance());
      }
}



public class SingleInheritanceusingEncapsulation {

	
	public static void main(String[] args) {
		son s1=new son();
		s1.setData(500000);
		s1.show();

	}

}
