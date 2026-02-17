package collectionfm;

import java.util.Arrays;

record Emploee(int id ,String name) implements Comparable<Emploee>
{

	@Override
	public int compareTo(Emploee o) {
		
		return this.name.compareTo(o.name);
	}
	
}
public class compareable {

	public static void main(String[] args) {
		Emploee []emp= {new Emploee(111, "Aswini"),new Emploee(222, "Bx")};
          Arrays.sort(emp);
          System.out.println(Arrays.toString(emp));
	}

}
