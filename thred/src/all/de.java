package all;

class Parrot implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " ");
	}
}

class de {
	static Parrot p;

	static {
		p = new Parrot();
	}

	{
		Thread t1 = new Thread(p, "Peacock");
		t1.start();
	}

	public static void main(String[] args) {
		new de();

		new Thread(new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		}, "Koyal").start();

		new Thread(new Parrot(), "Parrot").start();
	}

	{
		Thread t2 = new Thread(p, "Sparrow");
		t2.start();
	}

}
