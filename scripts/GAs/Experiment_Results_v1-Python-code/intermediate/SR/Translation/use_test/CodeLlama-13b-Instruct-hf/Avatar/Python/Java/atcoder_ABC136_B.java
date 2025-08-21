
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 1;
        int finalAnswer = 0;
        int remainderChecker = 910;
        int divisor = 909;
        while (remainderChecker % divisor == 1) {
            remainderChecker += 1;
            while (Math.pow(10, i) <= N) {
                finalAnswer += (int) (Math.pow(10, i) - Math.pow(10, i - 1));
                i += 2;
            }
        }
        finalAnswer += Math.max(0, N - Math.pow(10, i - 1) + 1);
        System.out.println(finalAnswer);
    }
}
```
Note that this code uses the `Math.pow()` method to calculate the powers of 10, which is more efficient than using a loop to calculate the powers. Additionally, the `Math.max()` method is used to ensure that the final answer is non-negative.
