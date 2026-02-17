package linkedlistdemo1;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedlistdemo1 {

	public static void main(String[] args) {
		
       
		LinkedList<Integer> i1=new LinkedList<>();
		int startime=(int) System.currentTimeMillis();
		for(int i=0;i<=100000;i++)
		{
			i1.add(0,i);
		}
		
		int endtime=(int) System.currentTimeMillis();
		System.out.println(endtime-startime);
		ArrayList<Integer> i11=new ArrayList<>();
		startime=(int) System.currentTimeMillis();
		for(int i=0;i<=100000;i++)
		{
			i11.add(0,i);
		}
		endtime=(int) System.currentTimeMillis();
		System.out.println(endtime-startime);
	}

}
