package problemsolving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElementsExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");//4

        Set<String> uniqueWords = new HashSet<>(words);//3
        
        

        boolean allUnique = uniqueWords.size() == words.size();
        System.out.println("All elements are unique: " + allUnique);
    }
}


