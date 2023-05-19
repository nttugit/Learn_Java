package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
	public static void main(String[] args) {
		Deque<String> myDeque = new ArrayDeque<String>();
		myDeque.offer("Nguyen Van A");
		myDeque.offer("Nguyen van B");
		myDeque.offer("Nguyen Van C");
		myDeque.offerLast("Nguyen van EE");
		myDeque.offerFirst("Nguyen van FF");
		while (myDeque.size() > 0) {
			System.out.println(myDeque.poll());
		}

	}
}
