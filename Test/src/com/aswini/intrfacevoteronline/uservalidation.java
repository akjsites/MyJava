package com.aswini.intrfacevoteronline;

public class uservalidation implements voteronline {
   int num1;
   int num2;
   
   servive servive=new servive();
	@Override
	public void login() {
		System.out.println("welcome");

	}

	@Override
	public void processing(int num) {
		if(num==1)
		{
			this.num1++;
		}
		else if(num==2)
		{
			this.num2++;
		}
        
	}
	public String senddata()
	{
		if(this.num1>this.num2)
		{
			
			return servive.getname1("Winneres win to "+num1+"scores"+"modi");
		}
		else
		{
			return servive.getname1("Winneres win to "+num1+"scores"+"donal");
		}
	}


	@Override
	public void sucess() {
		System.out.println("sucessfully");
	}

}
