
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Thread thread = new Thread(() -> {
            try {
                int[] input = scanner.nextLine().split(" ").map(Integer::parseInt).toArray(Integer[]::new);
                queue.put(input);
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

        int[] result = queue.take();
        int a = result[0];
        int secondVariable = result[1];

        if (a > 0) {
            System.out.println("Positive");
        } else if (a <= 0 && secondVariable >= 0) {
            System.out.println("Zero");
        } else if (sumTwoVariables(a, secondVariable) % 2 == 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }

    private static int sumTwoVariables(int a, int secondVariable) {
        return a + secondVariable;
    }
}
```
Note that this code uses the `java.util.concurrent` package to create a thread that reads input from the user and puts it in a queue. The main thread then takes the input from the queue and processes it.

Also, note that the `sumTwoVariables` method is defined as a separate method to make the code more readable and reusable.
