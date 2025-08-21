```java
import java.util.*;

public class Main {
    static long result = 0;
    static int N;
    static long[] inputArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        inputArray = new long[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = scanner.nextLong();
        }
        outerLoop(0, 255, 1);
        System.out.println(result);
    }

    static void outerLoop(int outerLoopIndex, int stop, int step) {
        if (step == 0 || (step > 0 && outerLoopIndex >= stop) || (step < 0 && outerLoopIndex <= stop)) {
            return;
        }
        innerLoop(0, 60, 1);
        outerLoop(outerLoopIndex + step, stop, step);
    }

    static void innerLoop(int b, int stop, int step) {
        if (step == 0 || (step > 0 && b >= stop) || (step < 0 && b <= stop)) {
            return;
        }
        long bs = bitSum(b);
        result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
        innerLoop(b + step, stop, step);
    }

    static long bitSum(int b) {
        long sum = 0;
        for (long num : inputArray) {
            sum += (num >> b) & 1;
        }
        return sum;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the result using the same logic as the Python code, and prints the result. The `bitSum` method calculates the sum of the bits at a certain position in the input array. The `outerLoop` and `innerLoop` methods are recursive methods that iterate over the bits of the input array and calculate the result. The `result` variable is a global variable that stores the result.

