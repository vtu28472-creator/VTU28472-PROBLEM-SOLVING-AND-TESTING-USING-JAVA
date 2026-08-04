import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read n
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[2 * n];
        int[] ans = new int[2 * n];

        // Read array elements
        System.out.println("Enter " + (2 * n) + " elements:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        int j = 0;
        for (int i = 0; i < n; i++) {
            ans[j++] = nums[i];
            ans[j++] = nums[i + n];
        }

        // Print shuffled array
        System.out.print("Shuffled Array: ");
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}