import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_AGC024_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(() -> calculateValue(P, N));
        int result = future.get();
        System.out.println(result);

        executor.shutdown();
    }

    private static int calculateValue(int[] P, int N) {
        int base = 0;
        int offset = 1;
        int result = 0;
        for (int i = 0; i < N; i++) {
            result += base * (N + offset);
            base = P[i];
            offset = i + 1;
        }
        return result;
    }
}