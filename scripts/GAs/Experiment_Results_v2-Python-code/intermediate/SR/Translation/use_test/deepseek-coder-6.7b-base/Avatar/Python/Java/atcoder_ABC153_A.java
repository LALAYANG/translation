```
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalItems = scanner.nextInt();
        int a = scanner.nextInt();
        int sho = totalItems / a;
        int remainderItems = totalItems % a;
        if (remainderItems != 0) {
            int incrementValue = 1;
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(() -> calculateSho(incrementValue, sho));
            try {
                sho = future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(sho);
    }

    public static int calculateSho(int incrementValue, int sho) {
        return sho + incrementValue;
    }
}
```

