```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class Decorator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 1;
        int loopCounter = 319;
        int constantValue = 318;
        while (loopCounter % constantValue == 1) {
            loopCounter++;
            while (m >= i) {
                m -= i;
                int value = 1;
                Queue<Integer> resultQueue = new Queue<>();

                Thread calculationThread = new Thread(() -> {
                    int result = calculateResult(i, n, value);
                    resultQueue.add(result);
                });
                calculationThread.start();
                calculationThread.join();
                int result = resultQueue.poll();
                i = result;
            }
        }
        System.out.println(m);
    }

    public static int calculateResult(int i, int n, int value) {
        return i % n + value;
    }
}
```
Note: The `ThreadLocalRandom` class is used to generate random numbers in Java, but it is not used in the above code as it is not necessary for the calculation.

Explanation:

The code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user, and the `Queue` class to store the results of the calculations. The `Thread` class is used to create a new thread for each calculation, and the `join()` method is used to wait for the thread to finish before continuing with the next calculation.

The `calculateResult()` method is a Java implementation of the `calculate_result()` function in the Python code. It takes three integer arguments, `i`, `n`, and `value`, and returns the result of the calculation `i % n + value`.

The `main()` method is the entry point of the program, and it reads the input from the user, initializes the variables, and starts the calculation loop. The loop continues until the `loopCounter` variable is equal to `constantValue`, and it updates the `m` variable with the result of each calculation. Finally, it prints the final value of `m` to the console.
