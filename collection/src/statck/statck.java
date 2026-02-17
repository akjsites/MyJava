package statck;

import java.util.Stack;

public class statck {

	public static void main(String[] args) {
		Stack<Integer> integers=new Stack();
		integers.add(12);
		integers.add(24);
		integers.add(21);
		integers.push(14);
		System.out.println(integers.isEmpty());
		integers.forEach(System.out::println);
		
		System.out.println(integers.peek());
		System.out.println(integers.search(15));
	}

}
