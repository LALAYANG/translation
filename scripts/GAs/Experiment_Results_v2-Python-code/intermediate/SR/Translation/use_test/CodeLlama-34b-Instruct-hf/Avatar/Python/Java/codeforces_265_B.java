```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] l = new int[inputNumber];

        for (int i = 0; i < inputNumber; i++) {
            l[i] = scanner.nextInt();
        }

        int minuend = 1;
        Queue<Integer> queueCalculateDifference = new ArrayDeque<>();

        for (int i = 0; i < inputNumber; i++) {
            int result = calculateDifference(minuend, l[i]);
            queueCalculateDifference.add(result);
        }

        int ans = 0;
        int last = 0;
        for (int i = 0; i < inputNumber; i++) {
            int loopCounter = l[i];
            ans += Math.abs(last - loopCounter) + 1;
            last = loopCounter;
        }

        System.out.println(ans);
    }

    public static int calculateDifference(int minuend, int inputNumber) {
        return inputNumber - minuend;
    }
}
```
Note: The `ttest_ind` function from the Python code is not available in Java, so it has been removed from the code. Additionally, the `ThreadLocalRandom` class is used in the Java code to generate random numbers, as it is not available in the Python code.
