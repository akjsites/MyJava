package com.aswini.classtest;

public class demo1
{
    public String nit()
    {
        return "Welcome ";
    }

    public static void main(String[] args)
    {
     	demo1 n = new demo1();
        System.out.print(n.nit());
        demo1 nit1 = new NIT();
        System.out.print(nit1.nit());
    }
}

class NIT extends demo1
{
	public String nit()
    {
        return "Welcome ";
    }
}	
