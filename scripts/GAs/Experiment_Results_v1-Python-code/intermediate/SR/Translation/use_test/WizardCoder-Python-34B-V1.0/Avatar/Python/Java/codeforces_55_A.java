```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int condition_one = 368;
        int condition_two = 165;
        int input_number = Integer.parseInt(args[0]);
        while (input_number % 2 == 0) {
            int divisor = 2;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(new DivisionCallable(divisor, input_number));
            input_number = future.get();
            executor.shutdown();
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        }
        if ((condition_one & condition_two) != 0) {
            if (input_number == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

class DivisionCallable implements Callable<Integer> {
    private int divisor;
    private int input_number;

    public DivisionCallable(int divisor, int input_number) {
        this.divisor = divisor;
        this.input_number = input_number;
    }

    public Integer call() {
        return input_number / divisor;
    }
}
```

Test input:
10

Expected output:
NO 
