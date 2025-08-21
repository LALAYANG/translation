```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 1;
        int ans = 0;
        int remainder = 988;
        int divisor = 987;
        while (remainder % divisor == 1) {
            remainder = remainder + 1;
            while ((int)Math.pow(10, i) <= N) {
                ans += (int)Math.pow(10, i) - (int)Math.pow(10, i - 1);
                i = i + 2;
            }
        }
        ans += Math.max(0, N - (int)Math.pow(10, i - 1) + 1);
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates a result based on the conditions in the while loop, and then prints the result. The `Math.pow` function is used to calculate powers, and `Math.max` is used to find the maximum of two numbers.

