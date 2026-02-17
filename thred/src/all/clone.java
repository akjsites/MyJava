package all;
class bird implements Cloneable
{
	int id;
	String name;
	public bird(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "bird [id=" + id + ", name=" + name + "]";
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class clone {
    public static void main(String[] args) throws CloneNotSupportedException {
		bird bird=new bird(111, "Alen");
		System.out.println(bird);
		 bird b=  (bird) bird.clone();
		 System.out.println(b);
	}
}
