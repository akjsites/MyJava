package equalmethods;
class employee1
{
	private int id;
	private String name;
	public employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int hashCode()
	{
		return this.id;
	}
	public boolean equals(Object obj)
	{
		
		if(obj instanceof  employee1 ex)
		{
			if(this.id==ex.id && this.name.equals(ex.name))
			{
				
			}
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	
}
class costumer
{
	private int id;
	private String name;
	public costumer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
public class methodequaldemo2 {

	public static void main(String[] args) {
     employee1 e1=new employee1(101, "Aswini");
     employee1 e3=new employee1(101, "Aswini");
     costumer e2=new costumer(101, "Aswini");
     System.out.println(e1.equals(e2));
     System.out.println(e1.hashCode()+" "+e3.hashCode());
     
	}
}



