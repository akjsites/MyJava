package ttypeofparameter;
class demo<T>
{
	private T demo;

	public demo(T demo) {
		super();
		this.demo = demo;
	}
	public T getdata()
	{
		return demo;
	}
}
public class demo1 {

	public static void main(String[] args) {
		demo<String> Strtype=new demo<>("Aswini");
		System.out.println(Strtype.getdata());

		demo<Integer> inttype=new demo<>(12);
		System.out.println(inttype.getdata());
		
		demo<Character> chartype=new demo<>('A');
		System.out.println(chartype.getdata());
		
		demo<Long> longtype=new demo<>(56l);
		System.out.println(longtype.getdata());
		
		
		
	}

}
