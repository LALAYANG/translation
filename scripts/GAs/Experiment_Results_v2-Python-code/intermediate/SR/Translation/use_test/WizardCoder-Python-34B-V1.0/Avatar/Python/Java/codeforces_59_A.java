```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        int cu = 0;
        int cl = 0;
        int outer_loop_bound = 128;
        int inner_loop_bound = 127;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (char z : txt.toCharArray()) {
                if (Character.isLowerCase(z)) {
                    int lowercase_flag = 1;
                    Queue<Integer> queue_calculate_result0 = new LinkedList<>();
                    Callable<Integer> calculate_result = () -> {
                        return cl + lowercase_flag;
                    };
                    Future<Integer> future = executor.submit(calculate_result);
                    cl = future.get();
                } else {
                    cu++;
                }
            }
        }
        executor.shutdown();
        if (cu > cl) {
            System.out.println(txt.toUpperCase());
        } else {
            System.out.println(txt.toLowerCase());
        }
    }
}
```

Test input:
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd

Expected output:
amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd 
