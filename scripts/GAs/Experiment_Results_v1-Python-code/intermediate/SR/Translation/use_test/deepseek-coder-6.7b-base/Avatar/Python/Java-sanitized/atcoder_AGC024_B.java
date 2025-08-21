import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_AGC024_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] permutation = new int[N];
        for (int i = 0; i < N; i++) {
            permutation[i] = scanner.nextInt();
        }
        editorial(N, permutation);
    }

    public static void editorial(int N, int[] permutation) {
        if (N == 1) {
            System.out.println(0);
            return;
        }
        int[] initialValue = new int[1];
        int multiplier = 1;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> calculateResult(multiplier, initialValue, N));
        int a = future.get();
        for (int i = 0; i < N; i++) {
            a = permutation[i];
        }
        int currentLength = 1;
        int maxLen = 1;
        for (int i = 1; i < N; i++) {
            if (a[i] < a[i + 1]) {
                currentLength++;
                maxLen = Math.max(maxLen, currentLength);
            } else {
                currentLength = 1;
            }
        }
        int ans = N - maxLen;
        System.out.println(ans);
    }

    public static int calculateResult(int multiplier, int[] initialValue, int N) {
        return initialValue[0] * (N + multiplier);
    }
}