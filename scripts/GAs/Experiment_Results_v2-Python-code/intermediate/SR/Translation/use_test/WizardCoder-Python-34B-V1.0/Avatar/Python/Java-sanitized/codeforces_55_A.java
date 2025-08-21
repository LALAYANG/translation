import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Scanner;

public class codeforces_55_A {
    public static void main(String[] args) {
        int input_number = new Scanner(System.in).nextInt();
        while (input_number % 2 == 0) {
            int divisor = 2;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> {
                return division_operation(input_number, divisor);
            });
            try {
                input_number = future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            executor.shutdown();
            try {
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int[] a = {36, 31, 49};
        int[] b = {99, 4, 40};
        double[] t = ttest_ind(a, b);
        if (input_number == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static int division_operation(int input_number, int divisor) {
        return input_number / divisor;
    }

    public static double[] ttest_ind(int[] a, int[] b) {
        // Implement the ttest_ind method here
        return new double[0];
    }
}