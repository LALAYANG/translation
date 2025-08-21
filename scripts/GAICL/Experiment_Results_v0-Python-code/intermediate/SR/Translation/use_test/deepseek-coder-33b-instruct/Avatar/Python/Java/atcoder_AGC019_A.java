Here is the Java translation of your Python code. Note that Java does not have built-in support for multithreading, so I've used the ExecutorService to achieve similar functionality.

```java
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.math.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<int[]> futureMap = executor.submit(new Callable<int[]>() {
            public int[] call() {
                Scanner scanner = new Scanner(System.in);
                int[] arr = new int[4];
                for (int i = 0; i < 4; i++) {
                    arr[i] = scanner.nextInt();
                }
                return arr;
            }
        });

        Future<Integer> futureInt = executor.submit(new Callable<Integer>() {
            public Integer call() {
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            }
        });

        int[] arr = futureMap.get();
        int n = futureInt.get();

        int q = arr[0];
        int h = arr[1];
        int s = arr[2];
        int d = arr[3];

        int best1L = IntStream.of(q * 4, h * 2, s).min().getAsInt();
        int best2L = IntStream.of(d, best1L * 2).min().getAsInt();

        if (n % 2 == 0) {
            System.out.println((long)best2L * (n / 2));
        } else {
            System.out.println((long)best2L * (n / 2) + best1L);
        }

        executor.shutdown();
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the standard input and stores them in an array. It then reads another integer from the standard input. It calculates two variables, best1L and best2L, and prints the result based on the value of n.

Please note that the Python code uses the `scipy.stats.ttest_ind` function, which is not available in Java. I've removed this function from the Java code.

