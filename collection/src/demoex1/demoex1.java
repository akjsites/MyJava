package demoex1;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyStore.Entry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;

import compareable.product;

class Node{
	int item;
	Node node;
	public Node(int item) {
	this.item=item;
	this.node=null;
	}
	@Override
	public String toString() {
		return  ""+item;
	}
	
}
public class demoex1 {

	public static void main(String[] args) throws IOException {
//		Stack<Integer> i=new Stack<>();
//		i.add(12);
//		i.add(13);
//		i.add(14);
//		i.add(15);
//		System.out.println(i.search(12));
		
//		Vector<Integer> i=new Vector<>();
//		i.add(12);
//		i.add(13);
//		i.add(14);
//		i.add(15);
//		i.removeIf(s->s>12);
//		System.out.println(i);
		
//		ArrayList<Integer> i=new ArrayList<>(100);
//		i.add(12);
//		i.add(13);
//		i.add(14);
//		i.add(15);
//		i.ensureCapacity(900);
//		i.trimToSize();
//		System.out.println(i.size());
		
//		Node n=new Node(10);
//		Node n1=new Node(11);
//		Node n2=new Node(12);
//		n.node=n1;
//		n1.node=n2;
//		System.out.println(n.node);
//		System.out.println(n1.node);
//		System.out.println(n2.node);
		
//		LinkedList<Integer> a=new LinkedList<>();
//		HashSet<String> is=new HashSet<>();
//		is.add(null);
//		is.add("20");is.add(new String("20"));
//		System.out.println(is);
//		Map<String, Integer> map=new HashMap<>();
//		Integer put = map.put("A", 1);
//		Integer put2 = map.put("A", 9);
//		map.put("N", 9);
//		System.out.println(put2);
//		Integer orDefault = map.getOrDefault("N", 0);
//		System.out.println(orDefault);
//		boolean containsKey = map.containsKey("N");
//		System.out.println(containsKey);
//		map.computeIfAbsent("D", s->Integer.parseInt("10"));
//		System.out.println(map);
		
//		TreeSet<Integer> m=new TreeSet<>((s1,s2)->s1.compareTo(s2));
//		TreeSet<Integer> n=new TreeSet<>();
//		n.add(10);
//		n.add(32);
//		n.add(24);
//		n.add(34);
//		n.add(11);
//		
//		
//		System.out.println(n);
//		Hashtable<Integer, Integer> n=new Hashtable<>();
//		n.put(1, 1);
//		n.put(2, 1);
//		n.put(4, 2);
//		System.out.println(n);
		
//		Node n=new Node(10);
//		WeakHashMap<Node, Integer> m=new WeakHashMap<>();
//		m.put(n, 1);
//		n=null;
//		System.gc();
//		System.out.println(m);
		
//		SortedSet<Integer> integers=new TreeSet<>();
//		integers.add(6000);
//		integers.add(1000);
//		integers.add(3000);
//		integers.add(5000);
//	    integers.add(7000);
//	    integers.first();
//	    System.out.println(integers.tailSet(2000));
		
//		Properties image=new Properties();
//		var v=new FileWriter("A:\\db.properties");
//		image.setProperty("name", "Rahul");
//		image.store(v, "Data Added *");
//		
//		var read=new FileReader("A:\\db.properties");
//		image.load(read);
//		System.out.println(image.getProperty("name"));
		
		
		
	}

}
