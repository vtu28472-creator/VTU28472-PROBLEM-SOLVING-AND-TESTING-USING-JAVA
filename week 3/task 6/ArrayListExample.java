import java.util.ArrayList;

public class ArrayListExample{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Print ArrayList
        System.out.println(list);

        // Get an element
        System.out.println(list.get(1));

        // Change an element
        list.set(1, 25);

        // Remove an element
        list.remove(2);

        // Print size
        System.out.println(list.size());

        // Final list
        System.out.println(list);
    }
}