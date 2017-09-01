package datastructure;

import databases.ConnectDB;

import java.util.*;


public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * s
		 */
		ConnectDB connectDB = new ConnectDB();
		ArrayList<Object> fruitList = new ArrayList<>();
		fruitList.add("apples");
		fruitList.add("oranges");
		fruitList.add("bananas");
		fruitList.add("grapes");

		fruitList.remove (fruitList.size()-1);

		Iterator it = fruitList.listIterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}

        connectDB.InsertDataFromArrayListToMySql(fruitList, "Fruit_List", "Fruit");
		connectDB.readDataBase("Fruit_List", "Fruit");
	}

}
