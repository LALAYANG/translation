```
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long ans = 0;
        int outer_loop_limit = 670;
        int inner_loop_limit = 669;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 1; i <= N; i++) {
                ans += i * (N / i) * (N / i + 1) / 2;
            }
        }
        System.out.println(ans);
    }
}
```

