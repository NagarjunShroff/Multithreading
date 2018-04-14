package Multithreading;

class counter{
	int count;

	public synchronized void increment() {
		count++;
	}
}

public class SyncDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		counter c = new counter();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				for(int i=1;i<=1000;i++) {
					c.increment();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				for(int i=1;i<=1000;i++) {
					c.increment();
				}

			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
	}

}
