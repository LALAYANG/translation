```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queueLI0 = new Queue<>();

        Thread threadLI0 = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] result = Func_LI_0();
                queueLI0.add(result[0]);
                queueLI0.add(result[1]);
                queueLI0.add(result[2]);
                queueLI0.add(result[3]);
            }
        });
        threadLI0.start();
        threadLI0.join();

        int a = queueLI0.poll();
        int b = queueLI0.poll();
        int multiplier = queueLI0.poll();
        int d = queueLI0.poll();

        System.out.println(Math.max(a * multiplier, b * d, a * d, b * multiplier));
    }

    public static int[] Func_LI_0() {
        int[] result = new int[4];
        String line = scanner.nextLine();
        String[] tokens = line.split(" ");
        for (int i = 0; i < 4; i++) {
            result[i] = Integer.parseInt(tokens[i]);
        }
        return result;
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses a `Queue` to store the input values and a `Thread` to read the input values in a separate thread. The `main` method then retrieves the input values from the `Queue` and performs the necessary calculations to find the maximum value.
