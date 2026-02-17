package mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class mapdemo {

	public static void main(String[] args) {
		TreeMap<String, Double> map=new TreeMap<>();
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			map.put(scanner.next(), scanner.nextDouble());
		}
		Set<Entry<String, Double>> entrySet = map.entrySet();
         Iterator<Entry<String, Double>> iterator = entrySet.iterator();
         while(iterator.hasNext())
         {
        	    Entry<String, Double> next = iterator.next();
        	    Double d=next.getValue()+5000;
        	    System.out.println(next.getKey()+" "+d);
         }
	}

}
