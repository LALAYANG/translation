import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Double> fractionalParts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double fractionalPart = scanner.nextDouble() - (int) scanner.nextDouble();
            if (fractionalPart != 0) {
                fractionalParts.add(fractionalPart);
            }
        }
        Collections.sort(fractionalParts);
        int multiplier = 2;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return multiplier * n - fractionalParts.size();
            }
        });
        int o = 0;
        try {
            o = future.get(1000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            System.out.println("Timeout");
        } catch (Exception e) {
            System.out.println("Error");
        }
        double arrSum = 0;
        for (double fractionalPart : fractionalParts) {
            arrSum += fractionalPart;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arrSum));
            }
        }
        System.out.printf("%.3f", res);
    }
}