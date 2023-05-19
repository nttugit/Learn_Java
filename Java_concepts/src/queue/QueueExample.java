package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		// queue
		Queue<String> studentList = new LinkedList<>();
		studentList.offer("Nguyen Van A");
		studentList.add("Nguyen van B");
		studentList.offer("Nguyen Van C");
		studentList.add("Nguyen van D");

		int queueSize = studentList.size();
//		while (queueSize > 0) {
//
//			String value = studentList.poll();
//			System.out.print(value + " ");
//			queueSize--;
//		}
//
//		while (true) {
//			String value = studentList.element();
//			if (value == null) {
//				break;
//			}
//			System.out.print(value + " ");
//		}

		// peek
		while (queueSize > 0) {
			String value = studentList.peek();
			System.out.print(value + " ");
			queueSize--;
		}
		System.out.println();
		// poll
		while (true) {
			String value = studentList.poll();
			if (value == null) {
				break;
			}
			System.out.print(value + " ");
		}



		System.out.println("\n" + studentList);
	}
}
