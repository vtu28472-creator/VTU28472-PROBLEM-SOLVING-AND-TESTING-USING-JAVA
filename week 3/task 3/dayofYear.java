import java.util.Scanner;

public class dayofYear {

    public static int dayOfYear(String date) {

        // Get year
        int year = Integer.parseInt(date.substring(0, 4));

        // Get month
        int month = Integer.parseInt(date.substring(5, 7));

        // Get day
        int day = Integer.parseInt(date.substring(8, 10));

        // Days in each month
        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Check leap year
        if (year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0)) {

            days[1] = 29;
        }

        int result = 0;

        // Add days of previous months
        for (int i = 0; i < month - 1; i++) {
            result = result + days[i];
        }

        // Add current day
        result = result + day;

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        int answer = dayOfYear(date);

        System.out.println("Day of the year: " + answer);

        sc.close();
    }
}