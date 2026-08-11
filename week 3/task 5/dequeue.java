import java.util.ArrayDeque;
import java.util.Deque;

public class dequeue {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        // Insert elements
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(30);

        // Display deque
        System.out.println("Deque: " + deque);

        // Remove elements
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from rear: " + deque.removeLast());

        // Display after removal
        System.out.println("Deque after removal: " + deque);

        // Peek elements
        System.out.println("Front element: " + deque.peekFirst());
        System.out.println("Rear element: " + deque.peekLast());
    }
}