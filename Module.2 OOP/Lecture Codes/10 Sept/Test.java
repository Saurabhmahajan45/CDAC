
import java.util.*;
public class Test {
  
    public static void main(String[] args) {
  
   // Creating a List of Strings
        List<String> fruits = new ArrayList<>();

        // Adding elements to the List
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println("Original List: " + fruits);

        // Inserting an element at a specific index
        fruits.add(2, "Grapes");
        System.out.println("After adding at index 2: " + fruits);

        // Getting an element at a specific index
        System.out.println("Element at index 3: " + fruits.get(3));

        // Updating an element at a specific index
        fruits.set(1, "Blueberry");
        System.out.println("After updating index 1: " + fruits);

        // Removing an element by index
        fruits.remove(4);
        System.out.println("After removing element at index 4: " + fruits);

        // Removing an element by value
        fruits.remove("Grapes");
        System.out.println("After removing 'Grapes': " + fruits);

        // Checking if a list contains an element
        System.out.println("Contains 'Mango'? " + fruits.contains("Mango"));

        // Getting the index of an element
        System.out.println("Index of 'Apple': " + fruits.indexOf("Apple"));

        // Getting the size of the list
        System.out.println("Size of the List: " + fruits.size());

        // Creating a sublist from index 1 to 3
        List<String> subList = fruits.subList(1, 3);
        System.out.println("Sublist (1 to 3): " + subList);

        // Clearing the list
        fruits.clear();
        System.out.println("After clearing, is empty? " + fruits.isEmpty());
	}
}