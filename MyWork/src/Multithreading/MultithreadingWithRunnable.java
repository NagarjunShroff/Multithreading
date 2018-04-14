package Multithreading;

public class MultithreadingWithRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		for(int i = 0;i < n ;i++) {
			Thread thread = new Thread(new MultithreadingRunnable());
			thread.start();
		}
	}
}
class MultithreadingRunnable implements Runnable{

	public void run() {


		System.out.println("Thread "+Thread.currentThread().getId()+" is running!");
	}
}

