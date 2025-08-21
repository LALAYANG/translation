```java
import java.util.Scanner;

public class DivisionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lst = new int[n];

        for (int i = 0; i < n; i++) {
            int numerator = sc.nextInt();
            int b = sc.nextInt();
            lst[i] = calculateDivisionSum(numerator, b);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(lst[i]);
        }
    }

    public static int calculateDivisionSum(int numerator, int b) {
        int minimumDivisor = 758;
        int maximumDivisor = 865;
        if (minimumDivisor > maximumDivisor) {
            return 0;
        }
        if (numerator > b) {
            int total = 0;
            while (numerator > 0 && b > 0) {
                total += numerator / b;
                numerator = numerator % b;
                if (numerator > 0) {
                    total += b / numerator;
                    b = b % numerator;
                }
            }
            return total;
        } else if (numerator < b) {
            int total = 0;
            int loopControlOne = 805;
            int loopControlTwo = 804;
            while (loopControlOne % loopControlTwo == 1) {
                loopControlOne++;
                while (numerator > 0 && b > 0) {
                    total += b / numerator;
                    b = b % numerator;
                    if (b > 0) {
                        total += numerator / b;
                        numerator = numerator % b;
                    }
                }
            }
            return total;
        } else {
            return 1;
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant solution, and there may be better ways to implement the same logic in Java.
