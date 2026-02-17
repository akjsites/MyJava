package map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class map {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap=new HashMap<>();
		hashMap.put("A", 111);
		hashMap.put("B", 222);
		hashMap.put("D", 333);
//		System.out.println(hashMap);
		
//		for(Map.Entry<String, Integer> enter:hashMap.entrySet())
//		{
//			System.out.println(enter.getKey()+" "+enter.getValue());
//		}
		
		
//		Set<String> keySet = hashMap.keySet();
//		Iterator<String> iterator = keySet.iterator();
//		while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//		}
		
		
//		Set<java.util.Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
//		entrySet.forEach(enter->System.out.println(enter));
		
		String nameString="s";
		
		Optional<String> ofNullable = Optional.ofNullable(nameString);
		System.out.println(ofNullable.orElse("name is not here"));
		
		
		
		

	}

}
