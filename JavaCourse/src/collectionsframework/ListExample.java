package collectionsframework;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	
	//index : 0 1 2 3 4 5 6 7 8 9
	//arr.get(7) :  O(1) for access
	//search : linear search O(n) for searching
	
	//int[] arrInt = {1,2,3,4,7,8,9,34,67,89};
	//arrInt[0]

	//String str = "activate";
	//convert into list List<String>
	//to remove the vowels from list
	
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> list = new ArrayList<>();
//        // Generics List<String>
//        //Parent p = new Child();
//        //List list = new ArrayList();
//
//        // Adding elements//index
//        list.add("Apple");//0
//        list.add("Banana");//1
//        list.add("Cherry");//2
//        
//        System.out.println("1. List : " + list);
//        
//        list.add(1, "Blueberry"); // Insert "Blueberry" at index 1
//
//        System.out.println("2. List : " + list);
//        
//        // Accessing elements
//        System.out.println("Element at index 2: " + list.get(2)); // Outputs: Banana
//
//        // Modifying elements
//        list.set(2, "Citrus"); // Replace element at index 2 with "Citrus"
//        
//        System.out.println("3. List : " + list);
////
////        // Removing elements
//        list.remove("Banana"); // Remove the first occurrence of "Banana"
//        list.remove(1); // Remove element at index 1
//        
//        System.out.println("4. List : " + list);
////
////        // Size and clearing
//        System.out.println("List size: " + list.size()); // Outputs: 3
//        list.clear(); // Remove all elements
//        System.out.println("List size after clearing: " + list.size()); // Outputs: 0
//
//        // Using LinkedList
        List<String> linkedList = new LinkedList<String>();
        Deque<String> queue = new LinkedList<>();
        //implementation of queue
        //<> generic
        //
        linkedList.add("Dog");//0
        linkedList.add("Cat");//1
        linkedList.add("Elephant");//2
        
        //Why time complexity of to get data from index?
        //linkedList.get(9); O(n) O(4) you have to traverse n times.
        //arrayList.get(9); O(1) 
        //0 1 2 3 4 5 
        //arr[4]
        
        //DSA Question on linkedList
        //1. what would be the middle element of linkedList. > slow and fast pointer
        //2. how would you insert / delete in linkedlist. > traverse till index and attach a new node
        
        
        // Accessing elements
        System.out.println("LinkedList: " + linkedList);

        // Using subList
        List<String> subList = linkedList.subList(1, 3); // Elements from index 1 (inclusive) to 3 (exclusive)
        System.out.println("SubList: " + subList);
        
        
        /**
         * Double LInked List
         * head									tail
         * Dog <-> Cat <-> Elephant <-> A1 <-> A2
         * ^	
         * 
         * Node 
         * 		value
         * 		NexNode
         * 								^
         * */
    }
}

