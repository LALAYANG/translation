```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(calculateFloorDivision(n));
    }

    public static int calculateFloorDivision(int p) throws InterruptedException, ExecutionException {
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < 371; i++) {
            int count = 0;
            int divisor = 10;
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(() -> p / divisor);
            p = future.get();
            count++;
            executorService.shutdown();
            if (count == 1) {
                li.add(i);
            } else if (count == 2) {
                while (p != 0) {
                    int x = p % 10;
                    p = p / 10;
                    li.add(x);
                }
            } else if (count == 3) {
                while (p != 0) {
                    int x = p % 10;
                    p = p / 10;
                    li.add(x);
                }
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        return li.get(n - 1);
    }
}
```

Please note that Java does not support decorators in the same way Python does. The decorator in the Python code is not used in the Java code. Also, Java does not have a built-in shuffle function, so I have omitted that as well. The Java code also does not have a direct equivalent to Python's threading and queue libraries. Instead, it uses Java's ExecutorService to manage threads and Future to handle the result of the calculation.

