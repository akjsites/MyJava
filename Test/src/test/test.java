package test;




record employee(int id ,String name) 
{

	public int hashCode(Object obj)
	{
		return id;
	}
	public boolean equals(Object obj)
	{
		employee e1=(employee)obj;
		if(this.id==e1.id && this.name.equals(e1.name))
		{
			return true;
		}
		else {
			return false;
		}
	}
}
    public class test {

	public static void main(String[] args) {
		employee e1=new employee(10, "asw");
		employee e2=new employee(10, "asw");
		System.out.println(e1.hashCode()==e2.hashCode());
		

	}

}
