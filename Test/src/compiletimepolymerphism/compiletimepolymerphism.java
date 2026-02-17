package compiletimepolymerphism;
class demo
{
	
}
public class compiletimepolymerphism {

	public static void main(String[] args) {
		demo d1=new demo();
		System.out.println(d1.getClass().getName()+"@"+Integer.toHexString(d1.hashCode()));
		System.out.println(d1.toString());
		System.out.println(Integer.toHexString(d1.hashCode()).equals(Integer.toHexString(d1.hashCode())));
	}

}
