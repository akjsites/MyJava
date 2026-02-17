package lambdareturn;

public interface lambdareturn {
	boolean main(Integer x);
}

class main{
	public static void main(String []args)
	{
		lambdareturn x1=x->x%2==0;
	     System.out.println(x1.main(12));
	}
}