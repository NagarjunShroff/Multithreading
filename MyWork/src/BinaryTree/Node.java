package BinaryTree;

import queue.queue;
import queue.queue.QueueOverflowException;
import queue.queue.QueueUnderflowException;

public class Node<T> {

	private T data;
	private Node<T> leftChild;
	private Node<T> rightChild;

	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public Node<T> getLeftChild(){
		return leftChild;
	}

	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}

	public Node<T> getRightChild(){
		return rightChild;
	}

	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}

	public static void breadthFirstTraversal(Node root) throws QueueOverflowException, QueueUnderflowException {

		if(root == null) {
			return;
		}

		queue<Node> queue = new queue(Node.class);
		queue.enQueue(root);

		while(!queue.isEmpty()) {
			Node node = queue.deQueue();
			System.out.println(node);

			if(node.getLeftChild()!=null) {
				queue.enQueue(node.getLeftChild());
			}
			if(node.getRightChild()!=null) {
				queue.enQueue(node.getRightChild());
			}
		}
	}

	public static void preOrderTraversal(Node<Character> root) {

		if(root == null) {
			return;
		}

		System.out.println(root);
		preOrderTraversal(root.getLeftChild());
		preOrderTraversal(root.getRightChild());
	}

	public static void inOrderTraversal(Node<Character> root) {

		if(root == null) {
			return;
		}
		inOrderTraversal(root.getLeftChild());
		System.out.println(root);
		inOrderTraversal(root.getRightChild());
	}

	public static void postOrderTraversal(Node<Character> root) {
		if(root == null) {
			return;
		}
		postOrderTraversal(root.getLeftChild());
		postOrderTraversal(root.getRightChild());
		System.out.println(root);
	}
}
