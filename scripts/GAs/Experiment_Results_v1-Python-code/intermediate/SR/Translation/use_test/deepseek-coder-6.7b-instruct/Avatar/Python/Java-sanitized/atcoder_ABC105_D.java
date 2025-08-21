import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class atcoder_ABC105_D {
    private static class CumulativeRemaindersThread implements Callable<int[]> {
        private final int[] arrayWithZeroAndA;
        private final int M;

        public CumulativeRemaindersThread(int[] arrayWithZeroAndA, int M) {
            this.arrayWithZeroAndA = arrayWithZeroAndA;
            this.M = M;
        }

        @Override
        public int[] call() {
            int[] cumulativeRemainders = new int[arrayWithZeroAndA.length];
            for (int i = 0; i < arrayWithZeroAndA.length; i++) {
                cumulativeRemainders[i] = (i > 0 ? cumulativeRemainders[i - 1] : 0) + arrayWithZeroAndA[i] % M;
                cumulativeRemainders[i] %= M;
            }
            return cumulativeRemainders;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int[] arrayWithZeroAndA = new int[N + 1];
        arrayWithZeroAndA[0] = 0;
        System.arraycopy(A, 0, arrayWithZeroAndA, 1, N);

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<int[]> future = executorService.submit(new CumulativeRemaindersThread(arrayWithZeroAndA, M));
        int[] cumulativeRemainders = future.get();
        executorService.shutdown();

        Map<Integer, Long> remainderCounts = Arrays.stream(cumulativeRemainders).boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        Random rand = new Random();
        rand.nextInts(3).forEach(System.out::println);

        long combinations = remainderCounts.values().stream()
                .mapToLong(count -> count * (count - 1) / 2)
                .sum();
        System.out.println(combinations);
    }
}