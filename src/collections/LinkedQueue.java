package collections;

import java.util.EmptyStackException;

public class LinkedQueue<E> {
	private Node<E> front;
	private Node<E> rear;
	private int size;

	public LinkedQueue() {
		front = rear = null;
		size = 0;
	}

	public void enqueue(E val) {
		Node<E> node = new Node(val);

		if(size == 0) {
			front = node;
			rear = node;
			size++;
		}

		else if(size == 1) {
			rear = front;
			rear.setNext(node);
			rear = node;
			size++;
		}

		else if(size > 1) {
			rear.setNext(node);
			rear = node;
			size++;
		}
	}

	public E dequeue() {
		E removed = null;
		if(front == null) {
			throw new EmptyQueueException();
		}
		else {
			removed = front.getValue();
			if(size == 1) {
				front = null;
				rear = null;
			}
			else {
				front = front.getNext();
			}
			size--;
		}
		return removed;

	}

	public E peek() {
		E removed = null;
		if(front == null) {
			throw new EmptyQueueException();
		}
		else {
			removed = front.getValue();
		}
		return removed;
	}
	
	public String toString() {
		String result = "";
		if(size == 0) {
			return result;
		}
		else {
			Node<E> curr = front;
			while(curr != null) {
				result += curr.getValue() + " ";
				curr = curr.getNext();
			}
		}
		return result;
	}

}
