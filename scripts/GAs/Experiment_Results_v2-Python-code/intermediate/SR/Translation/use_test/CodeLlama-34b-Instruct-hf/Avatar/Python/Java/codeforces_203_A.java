```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int delta_a = sc.nextInt();
        int db = sc.nextInt();

        Queue<String> queue = new Queue<>();

        Thread thread = new Thread(() -> {
            String result = checkEquation(x, t, a, b, delta_a, db);
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

    public static String checkEquation(int x, int t, int a, int b, int delta_a, int db) {
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
Note: In Java, we use the `Math.min()` method to find the minimum of two integers, instead of the `np.min()` method used in the Python code. Also, we use the `Queue` class from the `java.util.concurrent` package to implement the queue, instead of the `queue` module used in the Python code.
