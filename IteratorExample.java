import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {

        // Creating and initializing the list
        List<String> words = new ArrayList<>(
            Arrays.asList("hello", "removeMe", "world!", "Java", "code!", "Royalty", "removeMe")
        );

        // Printing the original list
        System.out.println("Original List:");
        System.out.println(words);

        // Getting an iterator
        Iterator<String> iterator = words.iterator();

        // Looping through with the iterator
        while (iterator.hasNext()) {
            String word = iterator.next();

            // Condition to remove specific word
            if (word.equalsIgnoreCase("removeMe")) {
                iterator.remove(); // safe removal
            }

            // Condition to remove word containing '!'
            else if (word.contains("!")) {
                iterator.remove(); // safe removal
            }
        }

        // Printing the modified list
        System.out.println("\nCleaned List:");
        System.out.println(words);
    }
}
