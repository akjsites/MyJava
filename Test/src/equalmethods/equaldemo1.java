package equalmethods;
class employee
{
	private int id;
	private String name;
	public employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public boolean equals(Object obj)
	{
		int id=this.id;
		String name=this.name;
		employee e=(employee)obj;
		int eid=e.id;
		String ename=e.name;
		if(id==eid && name.equals(ename))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

public class equaldemo1 {

	public static void main(String[] args) {
     employee e1=new employee(101, "Aswini");
     employee e2=new employee(101, "Aswini");
     System.out.println(e1.equals(e2));
	}

}
