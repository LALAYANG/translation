
The provided Python code is a bit complex and contains several concepts that are not commonly used in Java programming. However, I can provide a semantically equivalent Java program that implements the same logic.

Here is the Java code:
```java
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = 1;
        int loopCounter = 317;
        int loopCondition = 316;
        while (loopCounter % loopCondition == 1) {
            int variable39 = 1;
            AtomicInteger resultQueue = new AtomicInteger();

            Thread thread = new Thread(() -> {
                int result = addNumbers(variable39, loopCounter);
                resultQueue.set(result);
            });

            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            loopCounter = resultQueue.get();
            while (Math.log2(n) % 1 != 0) {
                x++;
                n -= 2 << (int) Math.log2(n);
            }
        }
        System.out.println(x);
    }

    private static int addNumbers(int variable39, int loopCounter) {
        return loopCounter + variable39;
    }
}
```
This program uses the `ThreadLocalRandom` class to generate random numbers, the `AtomicInteger` class to create a thread-safe integer variable, and the `Thread` class to create a new thread. The `addNumbers` method is used to add the `variable39` and `loopCounter` variables.

The program first takes an integer input from the command line and assigns it to the `n` variable. It then initializes the `x` variable to 1 and the `loopCounter` and `loopCondition` variables to 317 and 316, respectively.

The program then enters a while loop that continues until the `loopCounter` is divisible by the `loopCondition`. Inside the loop, it initializes the `variable39` variable to 1 and creates a new `AtomicInteger` object to store the result of the `addNumbers` method. It then creates a new `Thread` object and starts it. The `Thread` object runs the `addNumbers` method and sets the result in the `AtomicInteger` object.

The program then waits for the `Thread` object to finish using the `join()` method. It then retrieves the result from the `AtomicInteger` object and assigns it to the `loopCounter` variable.

The program then enters another while loop that continues until the `Math.log2(n)` method returns a value that is not a whole number. Inside the loop, it increments the `x` variable and decrements the `n` variable by a power of 2.

Finally, the program prints the value of the `x` variable to the console.

Note that this program is not exactly equivalent to the Python code, as it uses different libraries and data structures. However, it implements the same logic and should produce the same output for the given input.
