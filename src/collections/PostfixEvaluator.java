package collections;

public class PostfixEvaluator {
	private String expression;
	private Stack<Integer> stack;
//	private LinkedStack<Integer> stack;
	
	public PostfixEvaluator(String expr) {
		expression = expr;
		stack = new Stack<Integer>(4);
//		stack = new LinkedStack<>();
	}
	
	// Format of expressions: 3 4 * 2 ...
	
	public int evaluate() {
		int result = 0;
		String[] tokens = expression.split(" ");
		int index = 0;
		while(index < tokens.length) {
			int value = 0;
			if(tokens[index].equals("+")) {
				int val2 = stack.pop();
				int val1 = stack.pop();
				value = val1 + val2;
				stack.push(value);
			}
			else if(tokens[index].equals("-")) {
				int val2 = stack.pop();
				int val1 = stack.pop();
				value = val1 - val2;
				stack.push(value);
			}
			else if(tokens[index].equals("*")) {
				int val2 = stack.pop();
				int val1 = stack.pop();
				value = val1 * val2;
				stack.push(value);
			}
			else if(tokens[index].equals("/")) {
				int val2 = stack.pop();
				int val1 = stack.pop();
				value = val1 / val2;
				stack.push(value);
			}
			else {
				stack.push(Integer.parseInt(tokens[index]));
			}
			index++;
		}
		result = stack.pop();
		return result;
	}
}
