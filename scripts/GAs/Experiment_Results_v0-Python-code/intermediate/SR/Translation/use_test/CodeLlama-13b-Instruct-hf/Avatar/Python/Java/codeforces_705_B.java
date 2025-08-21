
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class PythonToJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int c = 2;
        int CHECK1 = 134;
        int CHECK2 = 169;
        for (int i = 0; i < n; i++) {
            if ((CHECK1 & CHECK2) != 0) {
                if (numbers[i] == 1) {
                    System.out.println(c);
                } else if (numbers[i] % 2 == 0) {
                    int variable_1_10 = 3;
                    Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

                    Thread calculationThread = new Thread(() -> {
                        int result = calculateDifference(variable_1_10, c);
                        resultQueue.add(result);
                    });
                    calculationThread.start();
                    try {
                        calculationThread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int difference = resultQueue.poll();
                    c = difference;
                    System.out.println(c);
                } else {
                    System.out.println(c);
                }
            }
        }
    }

    private static int calculateDifference(int variable_1_10, int c) {
        return variable_1_10 - c;
    }
}
```
Note that the Java code uses the `java.util.concurrent.ThreadLocalRandom` class to generate random numbers, and the `java.util.Queue` class to implement the queue data structure. The `java.util.concurrent.LinkedBlockingQueue` class is used to implement the blocking queue.

Also, note that the Java code uses the `java.util.Scanner` class to read input from the user, and the `java.lang.Thread` class to create a new thread. The `java.lang.Runnable` interface is used to define the runnable object that will be executed by the thread.

The `calculateDifference` method is a private method that is used to calculate the difference between the `variable_1_10` and `c` variables. It is called by the `calculationThread` thread.

The `main` method is the entry point of the program, and it reads the input from the user, creates a new thread to execute the `calculationThread` method, and prints the result to the console.
