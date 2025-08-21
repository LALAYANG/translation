Here is the Java version of the provided Python code:

```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int delta_a = scanner.nextInt();
        int db = scanner.nextInt();

        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        Thread thread = new Thread(() -> {
            String result = checkEquation(x, t, a, b, delta_a, db);
            try {
                queue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
        thread.join();

        String result = queue.take();
        if (result.equals("Result Not Found")) {
            System.out.println("NO");
        }
    }

    private static String checkEquation(int x, int t, int a, int b, int delta_a, int db) {
        if (x == 0) {
            System.out.println("YES");
            return "Result Found";
        }

        int a_time = Math.min(a / delta_a, t - 1);
        int b_time = Math.min(b / db, t - 1);

        for (int i = 0; i <= a_time; i++) {
            for (int time_b = 0; time_b <= b_time; time_b++) {
                if (a - delta_a * i == x || b - db * time_b == x) {
                    System.out.println("YES");
                    return "Result Found";
                }
                if (a - delta_a * i + (b - db * time_b) == x) {
                    System.out.println("YES");
                    return "Result Found";
                }
            }
        }

        return "Result Not Found";
    }
}
```

Please note that Java does not have a direct equivalent to Python's decorator feature. Therefore, the decorator in the Python code is not translated to Java.

