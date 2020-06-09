package collectionExamples;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	
	public static void main(String args[]) {
		ArrayDeque<String> queue = new ArrayDeque<>();
		queue.add("Kartik");
		queue.add("supreeth");
		queue.add("bahumil");
		queue.add("bhavya");
		
//		System.out.println("peek method " +queue.peek());
//		System.out.println("peek method 2" +queue.peek());
		System.out.println("pool method " +queue.poll());
		System.out.println("pool method 2 " +queue.poll());
	}
}
