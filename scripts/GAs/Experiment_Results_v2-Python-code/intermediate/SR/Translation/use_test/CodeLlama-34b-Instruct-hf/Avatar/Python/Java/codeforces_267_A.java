```java
import java.util.Scanner;

public class Subtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            lst[i] = subtract(a, b);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(lst[i]);
        }
    }

    public static int subtract(int a, int b) {
        int firstConditionChecker = 918;
        int secondConditionChecker = 572;
        if ((firstConditionChecker & secondConditionChecker) != 0) {
            if (a > b) {
                int total = 0;
                while (a > 0 && b > 0) {
                    total += a / b;
                    a = a % b;
                    if (a > 0) {
                        total += b / a;
                        b = b % a;
                    }
                }
                return total;
            } else if (a < b) {
                int total = 0;
                int firstWhileLoopChecker = 308;
                int secondWhileLoopChecker = 307;
                while (firstWhileLoopChecker % secondWhileLoopChecker == 1) {
                    firstWhileLoopChecker++;
                    while (a > 0 && b > 0) {
                        total += b / a;
                        b = b % a;
                        if (b > 0) {
                            total += a / b;
                            a = a % b;
                        }
                    }
                }
                return total;
            } else {
                return 1;
            }
        }
        return 0;
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, the Python code has some issues, such as using the `map` function to convert the input strings to integers, which is not necessary in Java. Additionally, the Python code uses a recursive function to loop over the input, which is not necessary in Java. A more efficient and readable way to implement this in Java would be to use a simple loop and avoid the use of recursion.
