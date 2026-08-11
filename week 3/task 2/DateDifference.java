import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifference {
    public static void main(String[] args) {

        // First Date
        LocalDate date1 = LocalDate.of(2026, 8, 1);

        // Second Date
        LocalDate date2 = LocalDate.of(2026, 8, 10);

        // Calculate difference in days
        long days = ChronoUnit.DAYS.between(date1, date2);

        // Display result
        System.out.println("Number of days between two dates: " + days);
    }
}