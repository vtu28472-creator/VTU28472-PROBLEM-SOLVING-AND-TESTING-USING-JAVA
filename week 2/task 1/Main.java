import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        int[] ans = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        System.out.print("Output: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}