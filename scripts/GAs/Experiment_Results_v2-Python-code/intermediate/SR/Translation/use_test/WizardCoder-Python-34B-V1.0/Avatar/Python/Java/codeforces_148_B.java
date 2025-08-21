```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int princess = Integer.parseInt(args[0]);
        int dragon = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);
        int f = Integer.parseInt(args[3]);
        int c = Integer.parseInt(args[4]);
        if (dragon <= princess) {
            System.out.println(0);
            return;
        }
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new Callable<Integer>() {
            public Integer call() {
                return fight(t, princess);
            }
        });
        int result_fight = future.get();
        int current_position = result_fight;
        current_position += princess * current_position / (dragon - princess);
        while (current_position < c) {
            current_position += princess * current_position / dragon;
            current_position += princess * f;
            current_position += princess * current_position / (dragon - princess);
        }
        System.out.println(current_position);
        executor.shutdown();
    }

    public static int fight(int t, int princess) {
        return t * princess;
    }
}
```

Test input:
10
1
10
1
11

Expected output:
0 
