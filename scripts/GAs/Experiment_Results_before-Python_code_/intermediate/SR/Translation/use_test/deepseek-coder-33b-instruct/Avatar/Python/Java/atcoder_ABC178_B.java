```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        System.out.println(max(a * c, b * d, a * d, b * c));
    }

    public static long max(long... nums) {
        long max = Long.MIN_VALUE;
        for (long num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
```

This Java code reads four long integers from the standard input, calculates the product of each pair of numbers, and prints the maximum product. The `max` method is used to find the maximum value among the given numbers.

