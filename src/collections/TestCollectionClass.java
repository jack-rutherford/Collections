package collections;

import java.util.EmptyStackException;

public class TestCollectionClass {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Stack<Integer> stack = new Stack(10);
////		Stack<String> stack1 = new Stack(10);
//
//		for(int i = 0; i < 12; i++) {
//			stack.push(i);
//		}
//		System.out.println(stack.toString());
//		stack.pop();
//		System.out.println(stack.toString());
//		System.out.println(stack.peek());
//		System.out.println("Stack Size:" + stack.size());
//		try {
//			for(int i = 0; i < 15; i++) {
//				System.out.println(stack.pop());
//			}
//		}catch(EmptyStackException e) {
//			System.out.println("Stack is empty");
//		}
		
		PostfixEvaluator eval = new PostfixEvaluator("3 4 * 2 5 + - 4 * 2 /");
		System.out.println("Result: " + eval.evaluate());
		
	}

}
