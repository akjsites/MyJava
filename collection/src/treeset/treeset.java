package treeset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
record std(Integer id,String name) implements Comparable<std>
{

	@Override
	public int compareTo(std o) {
		return Integer.compare(this.id(), o.id());
	}

}
public class treeset {

	public static void main(String[] args) {
//		TreeSet<std> stds=new TreeSet<>();
//		stds.add(new std(444, "A"));
//		stds.add(new std(111, "B"));
//		stds.add(new std(322, "H"));
		ArrayList<std> std=new ArrayList<>();
		std.add(new std(444, "A"));
		std.add(new std(444, "A"));
		std.add(new std(111, "B"));
		std.add(new std(322, "H"));
		System.out.println(std);
		TreeSet<std> stds1=new TreeSet<>(std);
		System.out.println(stds1);
	}

}
