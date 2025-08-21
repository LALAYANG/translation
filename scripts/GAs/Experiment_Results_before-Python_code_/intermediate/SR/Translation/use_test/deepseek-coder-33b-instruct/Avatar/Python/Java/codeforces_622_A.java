```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long l = 1;
        long r = n;
        while (l < r) {
            long mid = l + (r - l) / 2;
            long idxcnt = mid * (mid + 1) / 2;
            if (idxcnt < n) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        l -= 1;
        long idxcnt = l * (l + 1) / 2;
        System.out.println((int) (n - idxcnt));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, performs a binary search to find the largest number whose sum of all numbers from 1 to that number is less than or equal to the input number, calculates the difference between the input number and the sum of all numbers from 1 to that number, and prints the result.

