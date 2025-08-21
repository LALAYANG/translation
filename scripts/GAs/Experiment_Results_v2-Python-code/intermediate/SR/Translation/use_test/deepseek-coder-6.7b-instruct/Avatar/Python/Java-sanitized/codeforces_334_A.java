import java.util.concurrent.*;

public class codeforces_334_A {
    private static int sumValue = 413;
    private static int divisorValue = 412;
    private static int i = 1;
    private static int j = 413;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        while (sumValue % divisorValue == 1) {
            Future<Integer> future = executor.submit(new AdditionTask());
            sumValue = future.get();
            while (i < j) {
                System.out.println(i + " " + j);
                i = i + 1;
                j = j - 1;
            }
        }
        executor.shutdown();
    }

    static class AdditionTask implements Callable<Integer> {
        private int incrementValue = 1;

        @Override
        public Integer call() {
            return sumValue + incrementValue;
        }
    }
}