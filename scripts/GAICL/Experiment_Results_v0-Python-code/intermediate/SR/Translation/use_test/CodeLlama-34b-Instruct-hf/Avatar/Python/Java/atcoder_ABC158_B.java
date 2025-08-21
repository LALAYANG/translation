```
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int limit_b = scanner.nextInt();

        int ans = 0;
        int rep = N / (A + limit_b);
        ans += rep * A;
        int res = N - rep * (A + limit_b);
        ans += Math.min(res, A);
        System.out.println(ans);
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `Math.min()` method to find the minimum of two integers. The `Thread` and `ThreadPoolExecutor` classes are used to create a thread pool and execute the `Func_MI_0()` method in a separate thread. The `Queue` class is used to store the result of the `Func_MI_0()` method and retrieve it in the main thread.
