package com.aswini.object;
class birds
{
	
}
public class hashcodes1 {

	public static void main(String[] args) {
		birds d1=new birds();
		
		birds d2=new birds();
		System.out.println(d1.equals(d2));//false because two different adress
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
	}

}
