package datastructure;

import java.util.ArrayList;
import java.util.Iterator;


public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> list = new ArrayList<>();
		list.add("apples");
		list.add("oranges");
		list.add("bananas");
		list.add("grapes");

		list.remove (1);

		Iterator<String> it = list.listIterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		list.remove("oranges");
		for (String st: list);
		System.out.println(list);


	}

}
