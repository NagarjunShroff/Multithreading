package queue;

import queue.queue.QueueOverflowException;
import queue.queue.QueueUnderflowException;
import stack.StackImpl;
import stack.StackOverflowException;
import stack.StackUnderflowException;

public class queueWihStack<T> {
	
	private StackImpl<T> forwardStack = new StackImpl<>();
	private StackImpl<T> reverseStack = new StackImpl<>();
	
	public queueWihStack() {
		
	}

	public boolean isEmpty() {
		return forwardStack.isEmpty() && reverseStack.isEmpty();
	}
	
	public boolean isFull() {
		return forwardStack.isFull() || reverseStack.isFull();
	}
	
	public void enQueue(T data) throws QueueOverflowException, StackOverflowException, StackUnderflowException{
		if(isFull()) {
			throw new QueueOverflowException();
		}
		
		if(forwardStack.isEmpty()) {
			while(!reverseStack.isEmpty()) {
				forwardStack.push(reverseStack.pop());
			}
		}
		forwardStack.push(data);
	}
	
	public T deQueue() throws QueueUnderflowException, StackOverflowException, StackUnderflowException{
		if(isEmpty()) {
			throw new QueueUnderflowException();
		}
		
		if(reverseStack.isEmpty()) {
			while(!forwardStack.isEmpty()) {
				reverseStack.push(forwardStack.pop());
			}
		}
		return reverseStack.pop();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
