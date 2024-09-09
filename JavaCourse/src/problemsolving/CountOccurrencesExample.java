package problemsolving;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CountOccurrencesExample {
    public static void main(String[] args) {
        // Using ArrayList
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(1);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(7);

        long countArrayList = arrayList.stream().filter(num -> num == 7).count();
        System.out.println("Occurrences of 7 in ArrayList: " + countArrayList);

        // Using LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(7);
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(7);

        long countLinkedList = linkedList.stream().filter(num -> num == 7).count();
        System.out.println("Occurrences of 7 in LinkedList: " + countLinkedList);
    }
}

