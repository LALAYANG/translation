import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_387_A {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] h1M2 = scanner.nextLine().split(":");
        String[] variable34M2 = scanner.nextLine().split(":");
        int h1 = Integer.parseInt(h1M2[0]);
        int m2 = Integer.parseInt(h1M2[1]);
        int variable34 = Integer.parseInt(variable34M2[0]);
        m2 += calculateInitialProduct(variable34, h1);
        int multiplicand = Integer.parseInt(variable34M2[1]);
        m2 = calculateProduct(60, multiplicand) + m2;
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(() -> calculateDifference(m2, minuend));
        m2 = future.get();
        m2 = calculateRemainder(m2, 1440);
        System.out.printf("%02d:%02d", m2 / 60, m2 % 60);
        executorService.shutdown();
    }

    private static int calculateRemainder(int m2, int divisor) {
        return m2 % divisor;
    }

    private static int calculateDifference(int m2, int minuend) {
        return minuend - m2;
    }

    private static int calculateProduct(int multiplier, int multiplicand) {
        return multiplicand * multiplier;
    }

    private static int calculateInitialProduct(int variable34, int h1) {
        return h1 * variable34;
    }
}