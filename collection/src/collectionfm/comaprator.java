package collectionfm;

import java.util.Arrays;
import java.util.Comparator;


public class comaprator {

	public static void main(String[] args) {
		Emploee []emp= {new Emploee(222, "aswini"),new Emploee(111, "Bx")};
       
        Comparator<Emploee> comparator=new Comparator<Emploee>() {
			
			@Override
			public int compare(Emploee o1, Emploee o2) {
				
				return Integer.compare(o1.id(), o2.id());
			}
		};
		 Arrays.sort(emp,comparator);
	     System.out.println(Arrays.toString(emp));
	     
	     Comparator<Emploee> empComparator=(e1,e2)->e1.name().compareTo(e2.name());
	     Arrays.sort(emp,empComparator);
	     System.out.println(Arrays.toString(emp));
	     
	     
	     Arrays.sort(emp,(e1,e2)->e1.name().compareTo(e2.name()));
	     System.out.println(Arrays.toString(emp));
	}

}
