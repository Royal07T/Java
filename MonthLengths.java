import java.time.Month;
import java.time.YearMonth;

public class MonthLengths {
    public static void main(String[] args) {
        int year = 2027; 
        System.out.println("Length of each month in the year " + year + ":");
        for (Month month : Month.values()) {
            YearMonth ym = YearMonth.of(year, month);
            System.out.printf("%s: %d days%n", month, ym.lengthOfMonth());
        }
    }
}
// This program prints the number of days in each month for a given year.