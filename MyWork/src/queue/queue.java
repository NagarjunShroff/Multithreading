package queue;

import java.lang.reflect.Array;

public class queue<T>{

	private static final int SPECIAL_VALUE = -1;
	private static int MAX_SIZE = 40;
	private T[] elements;

	private int headIndex = SPECIAL_VALUE;
	private int tailIndex = SPECIAL_VALUE;

	@SuppressWarnings("unchecked")
	public queue(Class<T> clazz) {
		elements = (T[]) Array.newInstance(clazz, MAX_SIZE);
	}

	public boolean isEmpty() {
		return headIndex == SPECIAL_VALUE;
	}

	public boolean isFull() {
		int nextIndex = (tailIndex + 1) % elements.length;
		return nextIndex == headIndex;
	}

	public static class QueueOverflowException extends Exception{
		public QueueOverflowException() {
			System.out.println("Queue is FULL");
			// TODO Auto-generated constructor stub
		}
	}

	public static class QueueUnderflowException extends Exception{
		public QueueUnderflowException() {
			System.out.println("Queue is EMPTY");

		}
	}

	public void enQueue(T data) throws QueueOverflowException{
		if(isFull()) {
			throw new QueueOverflowException();
		}
		tailIndex = (tailIndex + 1) % elements.length;
		elements[tailIndex] = data;

		if(headIndex == SPECIAL_VALUE) {
			headIndex = tailIndex;
		}
	}

	public T deQueue() throws QueueUnderflowException{
		if(isEmpty()) {
			throw new QueueUnderflowException();
		}
		T data = elements[headIndex];

		if(headIndex == tailIndex) {
			headIndex = SPECIAL_VALUE;
		}
		return data;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
