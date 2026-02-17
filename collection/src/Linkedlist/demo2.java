package Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class demo2 {

	public static void main(String[] args) {
		LinkedList<Integer> in=new LinkedList<>();
		in.add(1);
		in.add(2);
		in.add(3);
		
		ListIterator<Integer> i=in.listIterator();
		System.out.println(i.nextIndex());

		while(i.hasNext())
		{
			int y=i.nextIndex();
			Integer x=i.next();
			System.out.println(x+" "+y);
		}
		System.out.println("--------------");
		while(i.hasPrevious())
		{
			int y=i.previousIndex();
			Integer x=i.previous();
			System.out.println(x+" "+y);
		}
	}

}
