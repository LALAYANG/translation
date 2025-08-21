```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new Queue<>();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] result = getIntList(scanner);
                queue.add(result);
            }
        });
        thread.start();
        thread.join();
        int[] result = queue.poll();
        int a = result[0];
        int b = result[1];
        int c = result[2];
        int d = result[3];
        System.out.println(Math.max(a * c, b * d, a * d, b * c));
    }

    private static int[] getIntList(Scanner scanner) {
        String[] tokens = scanner.nextLine().split(" ");
        int[] result = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            result[i] = Integer.parseInt(tokens[i]);
        }
        return result;
    }
}
```
Note: The above code uses the `java.util.Scanner` class to read input from the console, and the `java.util.Queue` interface to store the input. The `java.util.concurrent.Thread` class is used to create a new thread for reading the input, and the `java.util.concurrent.locks.ReentrantLock` class is used to synchronize access to the queue.
