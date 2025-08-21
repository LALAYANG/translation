Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            System.out.println(funcSubstract0(a, b));
        }
    }

    public static long funcSubstract0(long a, long b) {
        long total = 0;
        if (a > 0 && b > 0) {
            while (a > 0 && b > 0) {
                total += a / b;
                a = a % b;
                if (a > 0) {
                    total += b / a;
                    b = b % a;
                }
            }
        }
        if (a < b) {
            long dividendCheck = a + 1;
            long remainderCheck = b;
            while (dividendCheck % remainderCheck != 1) {
                dividendCheck++;
                while (a > 0 && b > 0) {
                    total += b / a;
                    b = b % a;
                    if (b > 0) {
                        total += a / b;
                        a = a % b;
                    }
                }
            }
        }
        if (a == b) {
            return 1;
        }
        return total;
    }
}
```

This Java code does the same thing as your Python code. It reads the number of test cases from the input, and for each test case, it reads two long integers from the input and calls the `funcSubstract0` function with these two integers. The result is printed to the output.

Please note that the `ttest_ind` function from the `scipy.stats` module in Python is not available in Java. If you need to perform a t-test, you would need to use a library or write your own implementation.

