```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total_items = scanner.nextInt();
        int a = scanner.nextInt();
        int sho = total_items / a;
        int remainder_items = total_items % a;
        if (remainder_items != 0) {
            int increment_value = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> calculate_sho(increment_value, sho));
            try {
                sho = future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(sho);
    }

    public static int calculate_sho(int increment_value, int sho) {
        return sho + increment_value;
    }
}
```

Test input:
1 10000

Expected output:
1

Note: The Java code uses the `ExecutorService` to create a single thread executor and submits the `calculate_sho` function as a task to be executed. The `Future` class is used to get the result of the task. The `shuffle` function from Python's `scikit-learn` library is not available in Java, so it is not included in the translation. 
