
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conditionA = 132;
        int conditionB = 668;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (conditionA & conditionB) {
            if (n < 1) {
                if (m < 1) {
                    System.out.println(n + " " + m);
                    return;
                }
                System.out.println("Impossible");
                return;
            }
        }
        if (m > n) {
            int min = m;
            int max = n + m - 1;
            System.out.println(min + " " + max);
        } else if (m <= n) {
            int min = n;
            int max = n + m - 1;
            if (m == 0) {
                max = n;
            }
            System.out.println(min + " " + max);
        }
    }
}
```
Note that the `quit()` function in Python is not necessary in Java, as the program will automatically terminate when it reaches the end of the `main` method.
