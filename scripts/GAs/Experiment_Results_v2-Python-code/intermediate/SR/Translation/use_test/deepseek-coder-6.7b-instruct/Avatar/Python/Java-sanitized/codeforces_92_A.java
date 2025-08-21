import java.util.concurrent.*;
import java.util.Scanner;

class Main {
    static int calculateSumWithModulo(int currentValue, int constantOne, int n) {
        return (currentValue % n + constantOne);
    }

    static int calculateDifference(int currentValue, int m) {
        return m - currentValue;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int currentValue = 1;
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        while (m >= currentValue) {
            Future<Integer> futureDifference = executorService.submit(() -> calculateDifference(currentValue, m));
            m = futureDifference.get();
            int constantOne = 1;
            Future<Integer> futureSum = executorService.submit(() -> calculateSumWithModulo(currentValue, constantOne, n));
            currentValue = futureSum.get();
        }
        executorService.shutdown();
        System.out.println(m);
    }
}