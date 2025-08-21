import java.util.Scanner;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        int[] arrayWithZeroAndA = new int[N + 1];
        arrayWithZeroAndA[0] = 0;
        System.arraycopy(A, 0, arrayWithZeroAndA, 1, N);
        Queue<int[]> cumulativeRemaindersQueue = new ConcurrentLinkedQueue<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<int[]> future = executorService.submit(() -> {
            int[] cumulativeRemainders = calculateCumulativeRemainders(arrayWithZeroAndA, M);
            cumulativeRemaindersQueue.add(cumulativeRemainders);
            return cumulativeRemainders;
        });
        try {
            int[] cumulativeRemainders = future.get(10, TimeUnit.SECONDS);
            int[] cumRemainders = cumulativeRemaindersQueue.poll();
            int[] remainderCounts = new int[M];
            for (int i = 0; i < N; i++) {
                remainderCounts[cumRemainders[i] % M]++;
            }
            int combinations = 0;
            for (int i = 0; i < M; i++) {
                combinations += remainderCounts[i] * (remainderCounts[i] - 1) / 2;
            }
            System.out.println(combinations);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

    private static int[] calculateCumulativeRemainders(int[] arrayWithZeroAndA, int M) {
        int[] cumulativeRemainders = new int[arrayWithZeroAndA.length];
        for (int i = 0; i < arrayWithZeroAndA.length; i++) {
            cumulativeRemainders[i] = (arrayWithZeroAndA[i] % M + cumulativeRemainders[i - 1]) % M;
        }
        return cumulativeRemainders;
    }
}