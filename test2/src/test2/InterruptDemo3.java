package test2;

public class InterruptDemo3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();

        try {
            Thread.sleep(2000); // Main thread is waiting for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt(); // Main thread interrupts the child thread
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread is running by locking the resource");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted gracefully.");
        } finally {
            System.out.println("Thread resource can be released here.");
        }
    }
}
