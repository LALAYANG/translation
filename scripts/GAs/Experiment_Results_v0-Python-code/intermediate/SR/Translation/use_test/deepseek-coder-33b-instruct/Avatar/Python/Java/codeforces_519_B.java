```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    private static int x = 0;
    private static int y = 0;
    private static int z = 0;
    private static int loopIterations = 403;
    private static int maxLoopCount = 402;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbersA = new int[n];
        for (int i = 0; i < n; i++) {
            numbersA[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        int p = scanner.nextInt();
        int[] c = new int[p];
        for (int i = 0; i < p; i++) {
            c[i] = scanner.nextInt();
        }

        sumListElements(0, loopIterations / maxLoopCount, 1, numbersA);

        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, workQueue);

        for (int i : b) {
            executor.execute(new SumThread(i));
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        for (int i : c) {
            z += i;
        }

        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }

    private static void sumListElements(int loopIndexOut, int stop, int step, int[] numbersA) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (int i : numbersA) {
            x += i;
        }
        sumListElements(loopIndexOut + step, stop, step, numbersA);
    }

    private static class SumThread implements Runnable {
        private final int i;

        public SumThread(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            y += i;
        }
    }
}
```

