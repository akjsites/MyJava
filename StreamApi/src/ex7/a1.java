package ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record std1(String name,Integer id,String course) {}

public class a1 {

	public static void main(String[] args) {
		List<std1> list=new ArrayList<>();
		list.add(new std1("Aswini", 23, "java"));
		list.add(new std1("Amit", 26, "java"));
		list.add(new std1("smit", 28, "Html"));
		list.add(new std1("alex", 13, "java"));
		list.add(new std1("roust", 73, "Html"));
 Map<Character, Long> l = list.stream().collect(Collectors.groupingBy(std->std.name().charAt(0),Collectors.counting()));

		l.forEach((s,r)->System.out.println(s+" "+r));
	}

}
