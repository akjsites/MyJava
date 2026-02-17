package com.aswini.singleinheritance;

class enginee
{   private int  x;
	public void setData(int x)
	{
		this.x=x;
	}
	public void show()
	{
		System.out.println(x);
	}
}
public class inheritancecoustructor {

	public static void main(String[] args) {
	  enginee e1 = new enginee();
	  e1.setData(4);
      e1.show();
	}

}
