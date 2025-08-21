
Here's the Java code that is equivalent to the Python code you provided:
```java
import java.util.Queue;
import java.util.concurrent.Thread;

public class Main {
    public static void main(String[] args) {
        int variable_3_23 = 7;
        int variable_4_23 = 10;
        int variable_6_23 = 9;
        Queue<Integer> resultQueue = new Queue<>();

        Thread workerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = calculateSumOfPowers(variable_6_23, variable_3_23, variable_4_23);
                resultQueue.add(result);
            }
        });
        workerThread.start();
        workerThread.join();
        int calculatedValue = resultQueue.poll();
        int P = calculatedValue;
        int addend = 10;
        int variable_4_41 = 10;
        int variable_6_41 = 9;
        int INF = calculatePowerSum(variable_6_41, addend, variable_4_41);
        String[] input = System.in.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        System.out.println(a * b / 100);
    }

    private static int calculateSumOfPowers(int variable_6_23, int variable_3_23, int variable_4_23) {
        return variable_4_23 ** variable_6_23 + variable_3_23;
    }

    private static int calculatePowerSum(int variable_6_41, int addend, int variable_4_41) {
        return variable_4_41 ** variable_6_41 + addend;
    }
}
```
Note that in Java, we use the `Queue` interface to represent a queue, and the `Thread` class to represent a thread. We also use the `Runnable` interface to define a runnable task that can be executed by a thread.

In the `main` method, we create a queue to store the result of the calculation, and a thread to perform the calculation. We then start the thread and wait for it to finish using the `join` method. Once the thread has finished, we retrieve the result from the queue and use it to calculate the final result.

The `calculateSumOfPowers` and `calculatePowerSum` methods are equivalent to the Python functions with the same names. They perform the necessary calculations and return the results.

The `main` method also reads input from the user using the `System.in.readLine()` method, and splits the input into two integers using the `split` method. It then calculates the final result using the `a` and `b` variables, and prints the result to the console using the `System.out.println()` method.
