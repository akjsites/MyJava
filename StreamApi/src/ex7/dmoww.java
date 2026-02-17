package ex7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class dmoww {

	public static void main(String[] args) {
        String name[]={"dog","god","asw","swa","jal","laj"};
        
        	Map<String, List<String>> h = Arrays.stream(name).collect(Collectors.groupingBy(s->{
        		char l[]=s.toCharArray();
        		Arrays.sort(l);
        		return new String(l);
        	}));
         Set<Entry<String, List<String>>> entrySet = h.entrySet();
         Iterator<Entry<String, List<String>>> na = entrySet.iterator();
         while(na.hasNext())
         {
        	    Entry<String, List<String>> next = na.next();
        	    System.out.println(next.getValue());
         }
}
}
