package test;

public class test {


	public void method1() {

		System.out.println("Inside method1");
	}

	public void method2() {

		try {
			method1();
		}catch(Exception e) {
			System.out.println("Any exception occurs");
		}finally {
			System.out.println("Exceuting finally block");
		}
	}
	public static void main(String[] args) {

		test test = new test();
		test.method2();

	}
}


