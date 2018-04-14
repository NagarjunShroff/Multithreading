package stack;

public class StackOverflowException  extends Exception{

	public StackOverflowException() {
		System.out.println("Stack is FULL");
	}
	
}
