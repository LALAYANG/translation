import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_AGC003_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt() * N + i);
        }
        Collections.sort(A);
        int cnt = 0;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < N; i++) {
            int element = A.get(i);
            int variable_3_9 = 2;
            Future<Integer> future = executor.submit(() -> calculateRemainder(element, N, variable_3_9));
            int remainder = future.get();
            if (remainder % 2 != i % 2) {
                cnt++;
            }
        }
        executor.shutdown();
        System.out.println(cnt / 2);
    }

    public static int calculateRemainder(int element, int N, int variable_3_9) {
        return element % N % variable_3_9;
    }
}