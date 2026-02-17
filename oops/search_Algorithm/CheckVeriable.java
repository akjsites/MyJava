package com.aswini.search_Algorithm;

public class CheckVeriable {
    static int a=10;
    int b=20;
    public void checkText(int c) {
    	int d=40;
    	System.out.println(CheckVeriable.a);
    	System.out.println(this.b);
    	System.out.println(c);
    	System.out.println(d);
    	
    }
	public static void main(String[] args) {
		CheckVeriable kalia=new CheckVeriable();
		kalia.checkText(30);

	}

}
