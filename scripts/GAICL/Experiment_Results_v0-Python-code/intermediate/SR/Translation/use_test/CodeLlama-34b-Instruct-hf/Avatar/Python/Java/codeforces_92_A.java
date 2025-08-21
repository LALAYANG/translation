
Here's the Java code that is equivalent to the Python code you provided:
```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class Main {
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

                Thread thread = new Thread(() -> {
                    int result = calculateResult(i, n, value);
                    resultQueue.add(result);
                });
                thread.start();
                thread.join();
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
Note that in Java, we use the `Queue` interface to represent a queue, and the `Thread` class to represent a thread. We also use the `Scanner` class to read input from the user.

The `calculateResult` method is equivalent to the `calculate_result` function in the Python code, and it takes three integer arguments: `i`, `n`, and `value`. It returns the result of the calculation `i % n + value`.

In the `main` method, we first read the input from the user using the `Scanner` class. We then initialize the variables `i`, `m`, `loopCounter`, and `constantValue` to the values specified in the Python code.

The `while` loop is equivalent to the `while` loop in the Python code, and it checks whether `loopCounter` is divisible by `constantValue`. If it is, we increment `loopCounter` and enter the inner `while` loop.

In the inner `while` loop, we check whether `m` is greater than or equal to `i`. If it is, we decrement `m` by `i` and set `value` to 1. We then create a new `Queue` object to store the results of the calculation, and create a new `Thread` object to run the calculation in a separate thread.

We start the thread and wait for it to finish using the `join` method. Once the thread has finished, we retrieve the result from the queue using the `poll` method and assign it to `i`.

Finally, we print the value of `m` to the console.
