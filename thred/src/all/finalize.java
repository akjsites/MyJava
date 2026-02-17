package all;
record dex(int id,String name)
{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize");
	}
}

public class finalize {

	public static void main(String[] args) {
		dex dex=new dex(111, "Aswini");
        System.out.println(dex);
        dex=null;
        System.gc();
        System.out.println(dex);
	}

}
