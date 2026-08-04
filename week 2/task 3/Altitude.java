import java.util.Scanner;

public class Altitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of gain array
        System.out.print("Enter number of gains: ");
        int n = sc.nextInt();

        int[] gain = new int[n];

        // Read gain values
        System.out.println("Enter gain values:");
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        int altitude = 0;
        int maxAltitude = 0;

        // Calculate highest altitude
        for (int i = 0; i < n; i++) {
            altitude += gain[i];
            if (altitude > maxAltitude) {
                maxAltitude = altitude;
            }
        }

        System.out.println("Highest Altitude = " + maxAltitude);

        sc.close();
    }
}