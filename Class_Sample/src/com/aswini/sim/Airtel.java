package com.aswini.sim;

public class Airtel implements sim {
    double x;
    String mane;
	@Override
	public void recharge(double bal) {
		this.x=bal;
        
	}
	public String getrecharge() {
		return ""+x+mane;
		
	}
	

	@Override
	public double check() {
		return this.x;
		
		
	}

	@Override
	public void call() {
		if(this.x>0)
		{
			System.out.println("call sucessfully");
		}
		else 
		{
			System.out.println("not call");
		}
		
	}

	@Override
	public void message() {
		if(this.x>0)
		{
			System.out.println("message send ");
		}
		else 
		{
			System.out.println("can not messag");
		}
		
	}
	



     
}
