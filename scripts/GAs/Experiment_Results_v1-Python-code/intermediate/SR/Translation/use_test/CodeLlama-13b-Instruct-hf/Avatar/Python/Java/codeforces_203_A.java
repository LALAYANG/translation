
Here is the Java code that translates the Python code:
```java
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        String[] xxs = args[0].split(" ");
        int initialValue = Integer.parseInt(xxs[0]);
        int t = Integer.parseInt(xxs[1]);
        int a = Integer.parseInt(xxs[2]);
        int b = Integer.parseInt(xxs[3]);
        int da = Integer.parseInt(xxs[4]);
        int db = Integer.parseInt(xxs[5]);

        Queue<String> queue = new ArrayBlockingQueue<>(1);

        Thread thread = new Thread(() -> {
            String result = checkCombination(initialValue, t, a, b, da, db);
            queue.add(result);
        });

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String result = queue.poll();
        if (result.equals("Result Not Found")) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    private static String checkCombination(int initialValue, int t, int a, int b, int da, int db) {
        if (initialValue == 0) {
            return "Result Found";
        }

        int aTime = Math.min(a / da, t - 1);
        int bTime = Math.min(b / db, t - 1);

        for (int i = 0; i <= aTime; i++) {
            for (int j = 0; j <= bTime; j++) {
                if (a - da * i == initialValue || b - db * j == initialValue) {
                    return "Result Found";
                }
                if (a - da * i + (b - db * j) == initialValue) {
                    return "Result Found";
                }
            }
        }

        return "Result Not Found";
    }
}
```
Note that this code uses the `ArrayBlockingQueue` class from the `java.util.concurrent` package to create a thread-safe queue. The `ThreadLocalRandom` class is used to generate random numbers.
