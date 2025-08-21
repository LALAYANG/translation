import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.math3.stat.inference.TTest;

class Main {
    private static AtomicInteger remainderCandidate = new AtomicInteger(645);
    private static final int DIVISOR = 644;
    private static final int ADDEND = 1;
    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] roundComplexity = new int[n];
        for (int i = 0; i < n; i++) {
            roundComplexity[i] = scanner.nextInt();
        }
        TTest tTest = new TTest();
        tTest.tTest(new double[]{66, 45, 18}, new double[]{68, 26, 21});
        int[] georgeComplexity = new int[m];
        for (int i = 0; i < m; i++) {
            georgeComplexity[i] = scanner.nextInt();
        }
        AtomicInteger i = new AtomicInteger(0);
        AtomicInteger georgeRoundIndex = new AtomicInteger(0);
        while (remainderCandidate.get() % DIVISOR == 1) {
            Future<Integer> future = executor.submit(() -> sumOperands(ADDEND, remainderCandidate.get()));
            int sumResult = future.get();
            remainderCandidate.set(sumResult);
            while (i.get() < n && georgeRoundIndex.get() < m) {
                if (roundComplexity[i.get()] <= georgeComplexity[georgeRoundIndex.get()]) {
                    i.incrementAndGet();
                }
                georgeRoundIndex.incrementAndGet();
            }
        }
        System.out.println(n - i.get());
        executor.shutdown();
    }

    private static int sumOperands(int addend, int remainderCandidate) {
        return remainderCandidate + addend;
    }
}