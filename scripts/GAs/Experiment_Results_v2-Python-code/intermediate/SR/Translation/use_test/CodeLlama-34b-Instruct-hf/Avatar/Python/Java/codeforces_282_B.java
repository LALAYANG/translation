```java
import java.util.Scanner;

public class MyDecorator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstline = sc.nextInt();
        int total = 0;
        int[] memoryArray = new int[firstline];
        int conditionCheckerA = 161;
        int conditionCheckerC = 619;
        int newLoopCheckerA = 556;
        int loopCheckerB = 555;

        for (int loopIndexOut = 0; loopIndexOut < newLoopCheckerA / loopCheckerB; loopIndexOut++) {
            recursiveLoop(0, firstline, 1);
        }

        System.out.println(total);
    }

    public static void recursiveLoop(int x, int stop, int step) {
        if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
            return;
        }

        int[] inputArray = new int[2];
        inputArray[0] = sc.nextInt();
        inputArray[1] = sc.nextInt();

        if (conditionCheckerA & conditionCheckerC) {
            if (total + inputArray[0] <= 500) {
                total = total + inputArray[0];
                memoryArray[x] = 'A';
            } else {
                total = total - inputArray[1];
                memoryArray[x] = 'G';
            }
        }

        recursiveLoop(x + step, stop, step);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to implement the logic in Java.
