package q27;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {

	public static void main(String[] args) {
		Deque<Integer> deck = new ArrayDeque<>();
		deck.offer(1);
		deck.add(2); // line 1
		deck.push(3);
		System.out.println(deck.pop());
		System.out.println(deck.peek()); // line 2
		System.out.println(deck.remove());
	}

}
