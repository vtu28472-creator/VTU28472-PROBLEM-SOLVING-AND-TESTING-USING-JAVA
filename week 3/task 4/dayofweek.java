import java.time.LocalDate;
import java.util.Scanner;

public class dayofweek{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        System.out.println("Day of the week: " 
                           + date.getDayOfWeek());

        sc.close();
    }
}