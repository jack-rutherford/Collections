package collections;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Class to implement a stack using an array
 * @author jackrutherford
 *
 * @param <T>
 */
public class Stack<T> {
	private int top;
	private T[] stack;

	public Stack(int capacity) {
		top = 0;
		stack = (T[])(new Object[capacity]);
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public T peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top-1];
	}

	public T pop() {
		//ry {
			if(isEmpty()) {
				throw new EmptyStackException();
			}
			T var = stack[top-1];
			stack[top-1] = null;
			top--;
			return var;
		//} catch(EmptyStackException e) {
		//	System.out.println("Stack is empty!");
		//}

	}

	public void push(T newElement){
		if(top == stack.length) {
			stack = Arrays.copyOf(stack, stack.length*2);
		}
		stack[top] = newElement;
		top++;
	}

	public String toString() {
		String stackContents = "";
		for(int i = 0; i < top; i++) {
			stackContents += stack[i] + " ";
		}
		stackContents += " <-- top of the stack";
		return stackContents;
	}
}
