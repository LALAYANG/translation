
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] xxs = scanner.nextLine().split(" ");
        int x = Integer.parseInt(xxs[0]);
        int t = Integer.parseInt(xxs[1]);
        int a = Integer.parseInt(xxs[2]);
        int b = Integer.parseInt(xxs[3]);
        int delta_a = Integer.parseInt(xxs[4]);
        int db = Integer.parseInt(xxs[5]);

        Queue<String> queue = new ArrayBlockingQueue<>(1);

        Thread thread = new Thread(() -> {
            String result = checkEquation();
            queue.add(result);
        });

        thread.start();
        thread.join();

        String result = queue.poll();

        if (result.equals("Result Not Found")) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    private static String checkEquation() {
        if (x == 0) {
            return "Result Found";
        }

        int a_time = Math.min(a / delta_a, t - 1);
        int b_time = Math.min(b / db, t - 1);

        for (int i = 0; i <= a_time; i++) {
            for (int time_b = 0; time_b <= b_time; time_b++) {
                if (a - delta_a * i == x || b - db * time_b == x) {
                    return "Result Found";
                }
                if (a - delta_a * i + (b - db * time_b) == x) {
                    return "Result Found";
                }
            }
        }

        return "Result Not Found";
    }
}
```
Note that this code uses the `ArrayBlockingQueue` class from the `java.util.concurrent` package to create a thread-safe queue. The `ThreadLocalRandom` class is used to generate random numbers.
