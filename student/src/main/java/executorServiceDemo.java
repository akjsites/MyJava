import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executorServiceDemo {

	public static void main(String[] args) {
		ExecutorService a = Executors.newSingleThreadExecutor();
		a.execute(()->System.out.println("A"));
		a.execute(()->System.out.println("B"));
		
		a.execute(()->System.out.println("CB"));
		a.shutdown();
		System.out.println(a.isTerminated());
		
	}
}
