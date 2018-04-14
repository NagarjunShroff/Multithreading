package stack;

public class StackImpl<T> {

	private static int MAX_SIZE = 40;
	private Element<T> top;
	private int size = 0;

	/**
	 * push data to stack
	 * @author SNagarjun
	 * @param <T>
	 */
	public void push(T data) throws StackOverflowException {
		if(size == MAX_SIZE) {
			throw new  StackOverflowException();
		}
		Element elem = new Element(data, top);
		top = elem;
		size++;
	}

	/**
	 * pop data from stack
	 * @param args
	 */
	public T pop() throws StackUnderflowException{
		if(size == 0) {
			throw new StackUnderflowException();
		}
		T data = top.getData();
		top= top.getNext();
		size--;

		return data;
	}

	/**
	 * Peek data from stack
	 * @param args
	 */
	public T peek() throws StackUnderflowException{
		if(size == 0) {
			throw new StackUnderflowException();
		}
		return top.getData();
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == MAX_SIZE;
	}

	public int getSize() {
		return size;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Element<T>{

	private T data;
	private Element next;

	public Element(T data, Element next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Element getNext() {
		return next;
	}

	public void setNext(Element next) {
		this.next = next;
	}
}

