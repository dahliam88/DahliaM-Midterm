package datastructure;
import databases.ConnectDB;

import java.lang.*;
import java.util.*;

public class UseMap {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		ConnectDB connectDB = new ConnectDB();
		Map<Integer, String> map = new HashMap<>();

		map.put(0, "Fruits");
		map.put(2, "Vegetables");
		map.put(9, "Sweets");
		map.put(3, "Junk Food");

		for(Map.Entry<Integer, String> m : map.entrySet()){
			System.out.println(m);
		}

		System.out.println();

		System.out.println(map.get(3));
		map.remove(3);
		map.replace(9, "Sweets", "Sweetness");

		for(Map.Entry<Integer, String> m : map.entrySet()){
			System.out.println(m);
		}

		System.out.println();

		Iterator<Map.Entry<Integer, String>> m = map.entrySet().iterator();
		while(m.hasNext()){
			System.out.println(m.next());
		}

	}

}
