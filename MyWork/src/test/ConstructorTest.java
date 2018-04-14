package test;

public class ConstructorTest {
	
	public ConstructorTest() {
		System.out.println("Default constructor");
	}

	public ConstructorTest(int num, String name) {
		
		System.out.println("parameterized constructor with int and string arguments");
	}
	
	public ConstructorTest(String name, int num) {
		System.out.println("parameterized constructor with String and int arguments");
	}
	public static void main(String[] args) {
		// TODO to-generated method stub
		
		ConstructorTest ct = new ConstructorTest();
		ConstructorTest ct1 = new ConstructorTest(29,"Nagarjun");
		ConstructorTest ct2 = new ConstructorTest("nag", 29);

	}

}
