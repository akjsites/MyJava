package ex1;

import java.util.ArrayList;
import java.util.List;

record s(Integer id,String name,Double bal) {}



public class demo1 {

	public static void main(String[] args) {
		ArrayList<s> stds=new ArrayList<>();
		stds.add(new s(111, "as", 23000D));
		stds.add(new s(111, "aswini", 45000D));
		stds.add(new s(111, "akj", 78000D));
		stds.add(new s(111, "aj", 100000D));
		List<s> list = stds.stream().filter(std->std.bal()>50000).toList();
		list.forEach(std->System.out.println(std.name().toUpperCase()));
	}

}
