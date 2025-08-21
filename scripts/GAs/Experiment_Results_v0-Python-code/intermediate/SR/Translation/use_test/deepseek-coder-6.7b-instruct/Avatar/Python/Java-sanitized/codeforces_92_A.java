import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    public static void main(String[] args) throws Exception {
        int n = 29;
        int m = 7772;
        int constant_value = 319;
        int loop_counter = 319;
        while (loop_counter % constant_value == 1) {
            loop_counter = loop_counter + 1;
            while (m >= 1) {
                m -= 1;
                int value = 1;
                Queue<Integer> resultQueue = new LinkedList<>();
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                Future<Integer> future = executorService.submit(() -> calculateResult(1, n, value));
                int result = future.get();
                resultQueue.add(result);
                executorService.shutdown();
                m = resultQueue.remove();
            }
        }
        System.out.println(m);
    }

    @FunctionalInterface
    interface MyDecorator {
        int decResult(int res);
    }

    public static int calculateResult(int i, int n, int value) {
        MyDecorator myDecorator = res -> res;
        return i % n + value;
    }
}