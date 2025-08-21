```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] round_complexity = new int[n];
        for (int i = 0; i < n; i++) {
            round_complexity[i] = scanner.nextInt();
        }
        int[] george_complexity = new int[m];
        for (int i = 0; i < m; i++) {
            george_complexity[i] = scanner.nextInt();
        }
        int remainder_candidate = 645;
        int divisor = 644;
        int i = 0;
        int george_round_index = 0;
        while (remainder_candidate % divisor == 1) {
            int addend = 1;
            Queue<Integer> result_queue = new ArrayBlockingQueue<>(1);
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1));
            executor.execute(() -> {
                result_queue.add(sum_operands(addend, remainder_candidate));
            });
            try {
                remainder_candidate = result_queue.poll(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (i < n && george_round_index < m) {
                i += (round_complexity[i] <= george_complexity[george_round_index] ? 1 : 0);
                george_round_index++;
            }
        }
        System.out.println(n - i);
    }

    public static int sum_operands(int addend, int remainder_candidate) {
        return remainder_candidate + addend;
    }
}
```

Test input:
3 5
1 2 3
1 1 1 1 1

Expected output:
2 
