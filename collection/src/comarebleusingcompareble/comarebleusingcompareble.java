package comarebleusingcompareble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import collectionfm.compareable;

class emo implements Comparable<emo>
{
	int id;
	String name;
	double sal;
	public emo(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public int compareTo(emo o) {
		
		return Integer.compare(this.id,o.id);
	}
	@Override
	public String toString() {
		return "emo [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
}
public class comarebleusingcompareble {

	public static void main(String[] args) {
		ArrayList<emo> emos=new ArrayList<>();
		emos.add(new emo(444, "xxxx",23333));
		emos.add(new emo(222, "Aswini",11111));
		emos.add(new emo(333, "rrrrr",500));
		Collections.sort(emos);
		System.out.println(emos);
		
		ArrayList<emo> ww=new ArrayList<>();
		ww.add(new emo(444, "xxxx",23333));
		ww.add(new emo(222, "Aswini",11111));
		ww.add(new emo(333, "rrrrr",500));
		
		
		ww.sort((e1,e)->Integer.compare(e1.id, e.id));
		System.out.println(ww);
		
		
		ww.sort((e1,e)->e1.name.compareTo(e.name));
		System.out.println(ww);
		
		
		ww.sort((e1,e)->Double.compare(e1.sal, e.sal));
		System.out.println(ww);
	}

}
