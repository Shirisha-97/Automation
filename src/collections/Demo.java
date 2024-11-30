package collections;
import java.util.Stack;
class Demo {
	public static void main(String[] args) {
		//stack is predefined class which extends from vector class
		// stack has 3 methods
		//push(),pop(),peak()
		Stack<Integer> s=new Stack<Integer> ();
		//System.out.println(s);
		s.push(10);
		s.push(800);
		s.pop();
		System.out.println(s);
		s.push(200);
		System.out.println(s.peek());
		}
}
