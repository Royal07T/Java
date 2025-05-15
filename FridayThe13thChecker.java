import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class FridayThe13thChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter year (e.g. 2025): ");
            int year = scanner.nextInt();

            System.out.print("Enter month (1-12): ");
            int month = scanner.nextInt();

            LocalDate date = LocalDate.of(year, month, 13);

            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                System.out.println("😱 Yep! " + date + " is a Friday the 13th!");
            } else {
                System.out.println("Nope. " + date + " is a " + date.getDayOfWeek());
            }
        } // Scanner is auto-closed here—clean, safe, and modern!
    }
}
// This program checks if the 13th of a given month and year is a Friday.

