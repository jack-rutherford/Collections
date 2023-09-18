package collections;

import java.util.EmptyStackException;

public class LinkedStack<E> {

	private Node<E> top;
	private int size;

	public LinkedStack() {
		top = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void push(E element) {

		Node<E> newNode = null;
		if(top == null) {
			newNode = new Node<>(element);
		}
		else {
			newNode = new Node<>(element, top);
		}

		top = newNode;
		size++;
	}
	
	public E pop() {
		E removed;
		
		if(top == null) {
			throw new EmptyStackException();
		}
		else {
			//if there is only one element on the stack
			removed = top.getValue();
			if(size == 1) {
				top = null;
			}
			else {
				top = top.getNext();
			}
			size++;
			return removed;
		}
		
	}
	
	public E peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			return top.getValue();
		}
	}
	
	public String toString() {
		String nodeContents = "";
		Node<E> topCopy = top;
		
		//for(int i = 0; i < size; i++) {
		while(topCopy != null) {
			nodeContents += topCopy.getValue() + " ";
			topCopy = topCopy.getNext();
		}
		nodeContents += " <--- Top of Stack";
		
		return nodeContents;
	}

}