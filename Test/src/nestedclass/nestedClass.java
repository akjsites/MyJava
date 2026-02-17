package nestedclass;
class demo
{
	int id;
	double price ;
	demoInside d1;
	
	public demo(int id, double price, int  age) {
		super();
		this.id = id;
		this.price = price;
		this.d1=new demoInside(age);
	}
      public void show()
      {
    	  System.out.println(id+"   "+price);
    	  this.d1.get();
      }
	class demoInside
	{
		private int age;

		public demoInside(int age) {
			super();
			this.age = age;
		}
		public void  get()
		{
			 System.out.println(age);
		}
	}
}
public class nestedClass {

	public static void main(String[] args) {
		demo d1=new demo(10, 20, 40);
		d1.show();

	}

}
