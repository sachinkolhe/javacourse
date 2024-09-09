package collectionsframework;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // HashMap example
    	//Parent p = new CHild();
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);
        
        System.out.println("HashMap:");
        System.out.println("Iterating by entrySet");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        
        Set<String> keySet = hashMap.keySet();//all the keys present in hashMap
        hashMap.values();//all the values present in hashMap
        
        System.out.println("Iterating by keySet");
        for(String key: keySet) {
        	System.out.println(key + " = "+ hashMap.get(key));
        }
        
        System.out.println("Print only Values");
        System.out.println(hashMap.values());
        

        // LinkedHashMap example
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Dog", 4);
        linkedHashMap.put("Cat", 5);
        linkedHashMap.put("Elephant", 6);
        
//        linkedHashMap.keySet();
        System.out.println("\nLinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
//
        // TreeMap example
        Map<String, Integer> treeMap = new TreeMap<>();//natural
        treeMap.put("Banana", 2);
        treeMap.put("Apple", 1);
        treeMap.put("Cherry", 3);
        
        System.out.println("\nTreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
//
        // Accessing values
        System.out.println("\nAccessing value for 'Apple': " + hashMap.get("Apple"));

        //
        
        
        // Removing an entry
        hashMap.remove("Banana");
        System.out.println("\nHashMap after removing 'Banana': " + hashMap);

        // Checking size and presence of key/value
        System.out.println("\nHashMap size: " + hashMap.size());
        System.out.println("HashMap contains 'Cherry': " + hashMap.containsKey("Cherry"));
        System.out.println("HashMap contains value 3: " + hashMap.containsValue(3));
    }
}

/**
 * put > put method puts value into map Key, Value
 * get > get method gets value by Key
 * size > size of hashMap
 * containsKey > whether the key is present in the hashMap
 * containsValue > whether the value is present  in the hashMap
 * remove > remove by Key 
 * 
 * 
 * 
 * */

/**
 * API
 * GET POST PUT DELTE
 * spring JPA hibernate database rdbms > ACID Structured Query Lang ===> NoSQL > ACID 
 * spring AOP
 * spring MVC : API
 * spring logging
 * */

