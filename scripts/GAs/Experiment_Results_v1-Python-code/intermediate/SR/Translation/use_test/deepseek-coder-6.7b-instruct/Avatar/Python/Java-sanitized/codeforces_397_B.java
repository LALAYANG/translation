import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] results = new String[t];
        ExecutorService executorService = Executors.newFixedThreadPool(t);
        for (int i = 0; i < t; i++) {
            int dividend = scanner.nextInt();
            int divisor = scanner.nextInt();
            int expectedQuotient = scanner.nextInt();
            Future<String> future = executorService.submit(() -> {
                int quotient = performDivision(dividend, divisor);
                return (quotient * expectedQuotient >= dividend) ? "Yes" : "No";
            });
            try {
                results[i] = future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
        for (String result : results) {
            System.out.println(result);
        }
    }

    public static int performDivision(int dividend, int divisor) {
        return dividend / divisor;
    }
}