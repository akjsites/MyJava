package demo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class servise {
	Integer nu=100;
	ArrayList<demo> demos=new ArrayList<>();
	 Map<Integer, String> obj=new HashMap<>();
    public int add(demo demo)
    {
    	    demos.add(demo);
    	    return this.nu++;
    }
    
    public Map<Integer, String> get()
    {
    Iterator<demo> iterator = demos.iterator();
   
    while(iterator.hasNext())
    {
    	     demo d=iterator.next();
    	     obj.put(nu, d.getHospitalName());
    }
    
    	return obj;
    }
    public boolean getdetail(Integer i)
    {
   
    	     Set<Entry<Integer, String>> q = get().entrySet();
    	     Iterator<Entry<Integer, String>> iterator = q.iterator();
    	     while(iterator.hasNext())
    	     {
    	     	     Entry<Integer, String> next = iterator.next();
    	     	     if(next.getKey()==i)
    	     	     {
    	     	    	 return true;
    	     	    	 
    	     	     }
    	     }
    	     return false;
    }
    
}
