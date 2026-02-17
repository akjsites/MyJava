package com.aswini.object;

class car
{
	
}
public class toStringMethods {

	public static void main(String[] args) {
		car c1=new car();
		System.out.println(c1.hashCode());
		int x=c1.hashCode();//int stores the c1 class types hashcodes values .
		System.out.println(Integer.toHexString(x));//then it converts static tohexaString methods
		System.out.println(c1);//it is direct prints the toStrings formats
		//System.out.println(c1);//getclass().getName()+'@'+Integer.toHexaString()

	}

}
