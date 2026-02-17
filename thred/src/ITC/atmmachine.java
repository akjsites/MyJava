package ITC;

public class atmmachine {

	public static void main(String[] args) {
		Account x=new Account();
		drawer dwDrawer=new drawer(x);
		dwDrawer.start();
		Depositor depositor=new Depositor(x);
		
		depositor.start();
		
		

	}

}
