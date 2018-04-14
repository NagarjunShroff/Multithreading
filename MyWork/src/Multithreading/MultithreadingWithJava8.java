package Multithreading;

public class MultithreadingWithJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread = new Thread(() -> {System.out.println("Thread "+Thread.currentThread().getId()+" is running");});
		Thread t1 = new Thread(() -> {System.out.println("T1");});
		thread.start();
		t1.start();

	}

}
