package queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PrioprityQueueExample {
	public static void main(String[] args) {
		// Create a PriorityQueue with a custom Comparator
		PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.naturalOrder());

		// Add some elements to the PriorityQueue
		priorityQueue.add("Charlie");
		priorityQueue.add("Alice");
		priorityQueue.add("David");
		priorityQueue.add("Bob");

		// Process elements in the PriorityQueue
		while (!priorityQueue.isEmpty()) {
			String str = priorityQueue.poll();
			System.out.println(str);
		}

		System.out.println(priorityQueue);
	}
}
