package all;

class demo12 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(3200);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
  
	}
}

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		demo12 demo12 = new demo12();
		demo12.start();
	}

}
