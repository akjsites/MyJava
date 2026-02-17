package Linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class demo1 {

	public static void main(String[] args) {
	    LinkedList<Integer> vector=new LinkedList<>();
	    vector.add(2);
	    vector.add(3);
	    vector.add(2);
	    vector.add(1);
	    vector.sort((i1,i2)->i1.compareTo(i2));
	    vector.forEach(i->System.out.println(i));

	}

}
