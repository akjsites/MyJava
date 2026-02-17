package test2;

public class demonthread {

	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			while (true) {
				System.out.println("Demon Thread is running...");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t.setDaemon(true);//explaned here more detail
		
		//When we set the thread as a daemon thread using t.setDaemon(true), it means that this thread is a background thread that does not prevent the JVM from exiting.
		//If the main thread (or any other non-daemon thread) finishes execution, the JVM will terminate, and all daemon threads will be stopped immediately.
		//On the other hand, if we set it as a non-daemon thread using t.setDaemon(false), the JVM will wait for this thread to finish before exiting.
		//In this case, since the thread runs an infinite loop, the JVM will not exit until we manually terminate the program.
		//In summary, daemon threads are useful for background tasks that should not block the termination of the application, while non-daemon threads are essential for the main functionality of the application.
		//this program main aims to demonstrate the behavior of daemon and non-daemon threads in Java.
		//If you run the program with t.setDaemon(true), you will see that the "Demon Thread is running..." messages stop as soon as the main thread ends.
		//how to know a thread is daemon true or false or not?
//		System.out.println("Is Demon Thread a daemon thread? " + t.isDaemon());
		t.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread is ending...");

	}

}
