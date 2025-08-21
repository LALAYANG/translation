```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<int[]> future = executor.submit(Main::readIntList);
        int[] result_LI0 = future.get();
        executor.shutdown();
        int a = result_LI0[0], b = result_LI0[1], c = result_LI0[2], d = result_LI0[3];
        System.out.println(Math.max(Math.max(a * c, b * d), Math.max(a * d, b * c)));
    }

    public static int[] readIntList() {
        Scanner scanner = new Scanner(System.in);
        return new int[] {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, computes the maximum of the four products, and prints the result. The computation is done in a separate thread to avoid blocking the main thread.

