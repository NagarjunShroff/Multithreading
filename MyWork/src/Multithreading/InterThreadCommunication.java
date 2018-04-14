package Multithreading;

class Q{

	int num;
	boolean valSet = false;

	public synchronized void put(int num) {

		while(valSet) {
			try { wait();} catch(Exception e) { }
		}
		System.out.println("Put :"+num);
		this.num = num;
		valSet = true;
		notify();
	}

	public synchronized void get() {
		while(!valSet) {
			try { wait();} catch(Exception e) { }
		}
		System.out.println("Get :"+num);
		valSet = false;
		notify();
	}
}

class Producer implements Runnable{

	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t1 = new Thread(this,"Producer");
		t1.start();
	}
	public void run() {
		int i = 0 ;
		while(true) {
			q.put(i++);
			try { Thread.sleep(1000);}catch (Exception e) { }
		}
	}
}

class Consumer implements Runnable{
	Q q;
	public Consumer(Q q) {
		this.q = q;
		Thread t2 = new Thread(this,"Consumer");
		t2.start();
	}
	public void run() {

		while(true) {
			q.get();
			try { Thread.sleep(1000);} catch(Exception e) { }
		}
	}
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}

}
