package datastructure;

import java.util.Iterator;
import java.util.*;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue <String> queue = new LinkedList<String>();
		queue.add("VA");
		queue.add("FL");
		queue.add("NY");
		queue.add("AZ");
		queue.add("WA");
		queue.add("CA");
		queue.add("NJ");
		queue.add("AL");
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.element());

		Iterator its = queue.iterator();
		while (its.hasNext()){
			System.out.println(its.next());
			}

		queue.remove();
		System.out.println("after removing one elements:");
		for (String s:queue){
			System.out.println(s);

		}

	}

}
