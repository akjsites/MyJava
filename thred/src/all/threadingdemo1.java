package all;
class ex implements Runnable {
	int currentseat=1;
	int wantseat;
	
	public ex(int wantseat) {
		super();
		this.wantseat = wantseat;
	}
	

	public void run() {
		if(currentseat>=wantseat)
		{
			System.out.println(Thread.currentThread().getName()+currentseat);
			
			this.currentseat=this.currentseat-wantseat;
			
		}
		else {
			System.err.println(Thread.currentThread().getName()+" seat not avalebel ");
		}
	}
}
public class threadingdemo1 {

	public static void main(String[] args) {
		ex e1=new ex(1);
		Thread r1=new Thread(e1,"scott");
		Thread r2=new Thread(e1,"erwvd");
		r1.start();
		
		r2.start();
	}

}
