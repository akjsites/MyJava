package com.aswini.objectstatic;


class demo
{
	public static  void main()
    {
    	System.out.println("demo");
    }
}
class demo1 extends demo
{
	int x;
	double y;
	public demo1(int x,double y)
	{
		this.x=x;
		this.y=y;
	}
	public boolean equals(Object o1)
	{
		demo1 d1=(demo1)o1;
		if(this.x==d1.x || this.y==d1.y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
    public static void main()
    {
    	System.out.println("demo1");
    }
}

public class objectstaticdemo {

	public static void main(String[] args) {
		demo1 d1=new demo1(1,2);
		demo1 d2=new demo1(1,2);
        System.out.println(d1.equals(d2));
	}

}
