
The Python code you provided is a bit complex, but I'll do my best to translate it to Java. Here's the equivalent Java code:
```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queueLI0 = new Queue<>();

        Thread threadLI0 = new Thread(() -> {
            int[] result = Func_LI_0();
            queueLI0.add(result);
        });
        threadLI0.start();
        threadLI0.join();
        int[] resultLI0 = queueLI0.poll();
        int a = resultLI0[0];
        int b = resultLI0[1];
        int multiplier = resultLI0[2];
        int d = resultLI0[3];
        System.out.println(Math.max(a * multiplier, b * d, a * d, b * multiplier));
    }

    public static int[] Func_LI_0() {
        int[] result = new int[4];
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] tokens = line.split(" ");
        for (int i = 0; i < 4; i++) {
            result[i] = Integer.parseInt(tokens[i]);
        }
        return result;
    }
}
```
Note that I've used a `Queue` to store the result of the `Func_LI_0` function, which is a 4-element array of integers. The `main` method starts a new thread to call the `Func_LI_0` function, and then waits for the thread to finish using the `join` method. Once the thread has finished, the `main` method retrieves the result from the `Queue` and uses it to calculate the maximum value using the `Math.max` method.

I hope this helps! Let me know if you have any questions or need further assistance.
