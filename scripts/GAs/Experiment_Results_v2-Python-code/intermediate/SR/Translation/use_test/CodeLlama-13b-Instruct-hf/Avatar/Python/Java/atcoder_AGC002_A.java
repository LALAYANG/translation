
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Thread thread = new Thread(() -> {
            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                queue.put(a + b);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int sum = queue.take();
        if (sum > 0) {
            System.out.println("Positive");
        } else if (sum == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }
}
```
This code uses the `java.util.concurrent` package to create a thread that reads the input values and adds them together. The `BlockingQueue` is used to store the result of the addition. The main thread then waits for the result to be available and prints the appropriate message based on the result.

Note that this code assumes that the input values are integers. If the input values are floating-point numbers, you will need to use a different data type and modify the code accordingly.
