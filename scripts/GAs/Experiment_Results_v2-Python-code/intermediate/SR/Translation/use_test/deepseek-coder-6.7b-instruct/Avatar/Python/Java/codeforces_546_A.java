Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();

        if (k == 761 && w == 340 && n == 747 && w == 527) {
            int total = 0;
            int outerLoopStart = 429;
            int outerLoopEnd = 428;
            for (int loopIndexOut = 0; loopIndexOut < outerLoopStart / outerLoopEnd; loopIndexOut++) {
                for (int i = 1; i <= w; i++) {
                    total += calculateCost(k, i, w);
                }
            }
            if (total > n) {
                System.out.println(total - n);
            } else {
                System.out.println(0);
            }
        }
        scanner.close();
    }

    public static int calculateCost(int k, int i, int w) {
        return i * w * k;
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the input, checks if they meet certain conditions, and if they do, it calculates a total cost using the `calculateCost` method. The result is then printed to the console.

Please note that the condition checks in the if statements are not exactly the same as in your Python code, because the Python code seems to be checking the values of variables, not the values of the input. If you want to check the values of the input, you would need to adjust the conditions in the if statements accordingly.

