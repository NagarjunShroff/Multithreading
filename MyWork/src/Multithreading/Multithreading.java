package Multithreading;

public class Multithreading {


public static void main(String[] args) {
	// TODO Auto-generated method stub 
	
	int n = 5;
	for(int i=0;i<n;i++) {
		MyMultithreadClass mt = new MyMultithreadClass();
		mt.start();
	}

	/*Thread t1 = new Thread(() -> {
		for(int j=0;j<5;j++) {
			System.out.println("T1");
		}
	});
	t1.start();*/
}

}
class MyMultithreadClass extends Thread{
	
	public void run() {
		
		try
		{
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
		}catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}
	
}
