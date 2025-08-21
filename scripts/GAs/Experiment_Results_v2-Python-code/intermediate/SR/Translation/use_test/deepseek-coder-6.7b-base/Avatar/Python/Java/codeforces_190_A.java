```
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]);
        int third_number = Integer.parseInt(args[1]);
        int second_number = Integer.parseInt(args[2]);
        if (n < 1) {
            if (second_number < 1) {
                System.out.println(n + " " + second_number);
                System.exit(0);
            }
            System.out.println("Impossible");
            System.exit(0);
        }
        if (second_number > n) {
            int minimum_value = second_number;
            int third_number = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> calculateSumDifference(n, third_number, second_number));
            int max = future.get();
            System.out.println(minimum_value + " " + max);
        }
        if (second_number <= n) {
            int minimum_value = n;
            int max = n + second_number - 1;
            if (second_number == 0) {
                max = n;
            }
            System.out.println(minimum_value + " " + max);
        }
    }

    public static int calculateSumDifference(int n, int third_number, int second_number) {
        return n + second_number - third_number;
    }
}
```

