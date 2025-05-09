import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class MondaysInMonth {
    public static void main(String[] args) {
        int year = Year.now().getValue(); // current year
        Month month = Month.MAY; // Change to any month, e.g., MAY

        System.out.println("Mondays in " + month + " " + year + ":");
        LocalDate date = LocalDate.of(year, month, 1);

        while (date.getMonth() == month) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date);
            }
            date = date.plusDays(1);
        }
    }
}
// This program prints all the Mondays in a specified month of the current year.