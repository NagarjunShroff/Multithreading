package LinkedList;

public class Node <T extends Comparable<T>>{

	private T data;
	private Node<T> next;
	
	private Node(T data) {
		this.data = data;
		setNext(null);
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public Node<T> getNext(){
		return next;
	}
	
	class LinkedListImpl<T extends Comparable<T>> implements Cloneable{
		
		private Node<T> head = null;
		
		private LinkedListImpl() {
			
		}
		
	 /**
	  * Adding a node at the end
	  */
		public void addNodeAtEnd(T data) {
			
			if(head == null) {
				
				head = new Node<T>(data);
				
			}
			else {
			  Node<T> curr = head;
			  while(curr.getNext() != null) {
				  curr = curr.getNext();
			  }
			  curr.setNext(new Node<T>(data));
			}
		}
	
	
	/**
	 * Adding a node at the begining
	 * @param args
	 */
	public void addNodeAtBegining(T data) {
		
	 Node<T> newNode= new Node<T>(data);
	 
	  head = newNode.next;
	 
	 newNode = head;
	}
	
	/**
	 * Deleting first element 
	 * 
	 */
	public T deleteFirstNode() {
		
		if(head != null) {
			
			T popElement = head.getData();
			
			head = head.next;
			
			return popElement;
			
		}
	return null;
		
	}
	
	/**
	 * delete the node at last
	 */
	
	public T deleteNodeAtLast() {
		
		if(head != null) {
			
			Node<T> curr = head;
			Node<T> prev = curr;
			while(curr.getNext() != null) {
				curr = curr.getNext();
			}
			
			T popElement = curr.getData();
			  prev.setNext(null);
			return popElement;
		}
		return null;
	}
	
	/**
	 * Count nodes
	 */
	public int countNode() {
		 int count = 0;
         if( head == null) {
        	 return count;
         }else {
        	 
        	 Node<T> curr = head; 
        	 while(curr.getNext() != null) {
        		 curr = curr.getNext();
        		 count++;
        	 }
        	 
         }
		return count;
	}
	
	/**
	 * Search a node in the list
	 */
	public void searchNode(T data) {
		
		if (head == null) {
			System.out.println("No elements in the list");
		}
		
		Node<T> curr = head;
		while(curr.getNext() != null) {
			
			if(curr.getData().equals(data)) {
				System.out.println("Element found");
			}else {
				System.out.println("Element not found");
			}
			curr = curr.getNext();
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
