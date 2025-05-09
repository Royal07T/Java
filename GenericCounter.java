import java.util.*;
import java.util.function.Predicate;

public class GenericCounter {

    // Generic method to count elements matching a condition
    public static <T> long countMatching(Collection<T> collection, Predicate<T> condition) {
        return collection.stream()
                         .filter(condition)
                         .count();
    }

    // Utility methods for common conditions
    public static boolean isOdd(Integer n) {
        return n % 2 != 0;
    }

    public static boolean isPrime(Integer n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    // Demo method
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 11, 121);
        List<String> words = Arrays.asList("madam", "racecar", "hello", "noon", "java");

        long oddCount = countMatching(numbers, GenericCounter::isOdd);
        long primeCount = countMatching(numbers, GenericCounter::isPrime);
        long palindromeCount = countMatching(words, GenericCounter::isPalindrome);

        System.out.println("Odd numbers: " + oddCount);
        System.out.println("Prime numbers: " + primeCount);
        System.out.println("Palindromes: " + palindromeCount);
    }
}
