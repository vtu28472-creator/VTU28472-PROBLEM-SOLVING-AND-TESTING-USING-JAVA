import java.util.ArrayList;
import java.util.Collections;

public class LargestNumber {
    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(33);
        numbers.add(67);

        // Display the ArrayList
        System.out.println("Numbers: " + numbers);

        // Find the largest number using Collections.max()
        int largest = Collections.max(numbers);
        System.out.println("Largest number is: " + largest);

        // Alternative: Find largest manually
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest number (manual check): " + max);
    }
}
