package compareable;

public record product(int id ,String name,double price) implements Comparable<product>
{

	@Override
	public int compareTo(product o) {
		return Integer.compare(this.id, o.id);
	}
          
}
