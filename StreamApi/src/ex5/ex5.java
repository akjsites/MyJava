package ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

record std(String name,Integer id,String course) {}
public class ex5 {

	public static void main(String[] args) {
		List<std> list=new ArrayList<>();
		list.add(new std("Aswini", 23, "java"));
		list.add(new std("Amit", 26, "java"));
		list.add(new std("smit", 28, "Html"));
		list.add(new std("alex", 13, "java"));
		list.add(new std("roust", 73, "Html"));
        Map<String, List<std>> collect = list.stream().collect(Collectors.groupingBy(std::course));
        collect.forEach((n,m)->System.out.println(n+" "+m));
	}

}
