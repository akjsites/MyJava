package treeset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
record std1(Integer id,String name) implements Comparable<std>
{

	@Override
	public int compareTo(std o) {
		return Integer.compare(this.id(), o.id());
	}

}
public class computeifabcent {

	public static void main(String[] args) {
		HashMap<std1,List<String>> stds=new HashMap<>();
		std1 std1 = new std1(444, "A");
		std1 std2 = new std1(11, "M");
		stds.put(new std1(444, "A"),new ArrayList<>());
		
        
		stds.computeIfPresent(std1, (v1,v2)->{v2.add("Aswini");return v2;});
		stds.computeIfPresent(std1, (v1,v2)->{v2.add("jena");return v2;});
		stds.computeIfAbsent(std2, k->new ArrayList<>()).add("man");
		System.out.println(stds);
	}

}
