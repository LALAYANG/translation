import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int calculateCandleRemainder(int remainingCandles, int b) {
        return remainingCandles % b;
    }

    private static int calculateWholeCandles(int b, int remainingCandles) {
        // This is a placeholder for the scipy.stats.ttest_ind function.
        // As it's not needed in the original Python code, it's left empty.
        return remainingCandles / b;
    }

    private static class CalculateCandleRemainderTask implements Runnable {
        private final int remainingCandles;
        private final int b;
        private int result;

        CalculateCandleRemainderTask(int remainingCandles, int b) {
            this.remainingCandles = remainingCandles;
            this.b = b;
        }

        @Override
        public void run() {
            result = calculateCandleRemainder(remainingCandles, b);
        }

        int getResult() {
            return result;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int candeleIntere = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int remainingCandles = 0;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        while (candeleIntere > 0 || remainingCandles >= b) {
            candeleIntere += calculateWholeCandles(b, remainingCandles);
            CalculateCandleRemainderTask task = new CalculateCandleRemainderTask(remainingCandles, b);
            Future<?> future = executorService.submit(task);
            future.get();
            remainingCandles = task.getResult();
            s += candeleIntere;
            remainingCandles += candeleIntere % b;
            candeleIntere /= b;
        }
        executorService.shutdown();
        System.out.println(s);
    }
}