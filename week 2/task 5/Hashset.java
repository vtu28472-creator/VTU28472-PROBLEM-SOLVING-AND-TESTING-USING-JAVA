import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple");   // Duplicate (will not be added)

        // Display HashSet
        System.out.println("HashSet: " + set);

        // Check element
        System.out.println("Contains Mango: " + set.contains("Mango"));

        // Remove element
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        // Size of HashSet
        System.out.println("Size: " + set.size());

        // Iterate through HashSet
        System.out.println("Elements:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}