import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {

    public static void main(String[] args) {

        // Current Date
        LocalDate date = LocalDate.now();
        System.out.println("Current Date : " + date);

        // Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time : " + time);

        // Current Date and Time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date and Time : " + dateTime);

        // Tomorrow's Date
        System.out.println("Tomorrow : " + date.plusDays(1));

        // Yesterday's Date
        System.out.println("Yesterday : " + date.minusDays(1));

        // Add 10 Days
        System.out.println("After 10 Days : " + date.plusDays(10));

        // Subtract 5 Days
        System.out.println("Before 5 Days : " + date.minusDays(5));

        // Day, Month, Year
        System.out.println("Day : " + date.getDayOfWeek());
        System.out.println("Month : " + date.getMonth());
        System.out.println("Year : " + date.getYear());

        // Compare Two Dates
        LocalDate d1 = LocalDate.of(2026, 8, 1);
        LocalDate d2 = LocalDate.of(2026, 8, 10);

        if (d1.isBefore(d2)) {
            System.out.println("Date1 is before Date2");
        } else {
            System.out.println("Date1 is after Date2");
        }

        // Difference Between Two Dates
        Period diff = Period.between(d1, d2);
        System.out.println("Difference : " + diff.getDays() + " Days");

        // Format Date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Formatted Date : " + date.format(formatter));
    }
}