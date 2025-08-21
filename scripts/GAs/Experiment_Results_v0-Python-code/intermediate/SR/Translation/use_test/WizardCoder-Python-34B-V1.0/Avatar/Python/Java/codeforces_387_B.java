```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
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
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> {
                return addend + remainder_candidate;
            });
            try {
                remainder_candidate = future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            while (i < n && george_round_index < m) {
                i += (round_complexity[i] <= george_complexity[george_round_index]) ? 1 : 0;
                george_round_index++;
            }
        }
        System.out.println(n - i);
    }
}
``` 
