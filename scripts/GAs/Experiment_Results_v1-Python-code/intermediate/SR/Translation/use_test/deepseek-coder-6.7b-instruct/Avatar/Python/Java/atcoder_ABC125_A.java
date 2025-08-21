```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int cookie = 0;
    private static int b;
    private static int t;
    private static final Object lock = new Object();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        b = scanner.nextInt();
        t = scanner.nextInt();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int currentTime = a; currentTime <= t + 0.5; currentTime += a) {
            Future<Integer> future = executorService.submit(() -> calculateCookie(cookie, b));
            cookie = future.get();
        }
        executorService.shutdown();
        System.out.println(cookie);
    }

    public static int calculateCookie(int cookie, int b) {
        synchronized (lock) {
            return cookie + b;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, and then it calculates the sum of the `cookie` and `b` for each `a` seconds until `t` seconds. The result is printed to the standard output.

Please note that the `scipy.stats` and `sklearn.utils` modules are not used in this code, as they are Python-specific libraries and do not have direct equivalents in Java.

Also, the `queue` and `threading` modules are used to create a single thread executor service in Java, which is equivalent to the `queue.Queue` and `threading.Thread` in Python.

The `map(int, input().split())` function in Python is replaced by `Scanner` in Java.

The `calculate_cookie` function is replaced by `calculateCookie` in Java. The `queue.Queue` and `threading.Thread` are replaced by `ExecutorService` and `Future` in Java.

The `queue_calculate_cookie0.get()` and `thread_calculate_cookie0.join()` are replaced by `future.get()` in Java.

The `synchronized` keyword is used to ensure that only one thread can access the `calculateCookie` method at a time.

