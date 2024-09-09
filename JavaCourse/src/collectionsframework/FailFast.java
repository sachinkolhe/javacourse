package collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast {

	public static void main(String[] args) {

		List<String> myList = new CopyOnWriteArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		/**
		 * ConcurrentModificationException
		 * 
		 * while iterating over collection, if we modify the collection itself.
		 * 
		 * To avoid ConcurrentModificationException use iterator.
		 * 
		 * If you are into MultiThreaded Environment:
		 * Consider a different collection which are thread safe.
		 * 1. CopyOnWriteArrayList
		 * 2. ConcurrentHashMap
		 * 
		 * 
		 * */

		
		Iterator<String> it = myList.iterator();
		
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
			if (value.equals("3")) {
				myList.remove(value);
			}
		}
		
		
		
		System.out.println(myList);
    }
}
