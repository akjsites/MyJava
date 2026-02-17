package pid;

import java.util.Iterator;
import java.util.TreeSet;

record piddemo(Integer id,String name) implements Comparable<piddemo> {

	@Override
	public int compareTo(piddemo o) {
		
		return o.name().compareTo(this.name());
	}

	
//	piddemo{
//		if(id<=0)
//		{
//			throw new IllegalArgumentException();
//		}
//	}
	
}
public class pid {

	public static void main(String[] args) {
		TreeSet<piddemo> pids=new TreeSet<>();
		pids.add(new piddemo(411, "sswini"));
		pids.add(new piddemo(131, "fswini"));
		pids.add(new piddemo(511, "aswini"));
        Iterator<piddemo> iterator = pids.iterator();
        iterator.forEachRemaining(pid->System.out.println(pid));
	}

}
