```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        int condition1 = 219;
        int condition2 = 181;
        int outer_loop_bound = 363;
        int inner_loop_bound = 362;
        ExecutorService executorService = Executors.newFixedThreadPool(n);
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                if ((condition1 & condition2) != 0) {
                    int[] input_list = new int[3];
                    for (int j = 0; j < 3; j++) {
                        input_list[j] = scanner.nextInt();
                    }
                    if (sum(input_list) > 1) {
                        int input_flag = 1;
                        Future<Integer> resultFuture = executorService.submit(() -> process_input(input_flag, c));
                        c = resultFuture.get();
                    }
                }
            }
        }
        executorService.shutdown();
        System.out.println(c);
    }

    public static int process_input(int input_flag, int c) {
        // ttest_ind([67, 31, 64], [87, 20, 35])
        return c + input_flag;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
```

Please note that the ttest_ind function from scipy library is not available in Java. You may need to implement it yourself or find a suitable alternative.

