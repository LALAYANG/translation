import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC125_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        int result_accumulator = 0;
        int time = a;
        int counter1 = 758;
        int counter2 = 757;
        while (counter1 % counter2 == 1) {
            int variable_3_9 = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> calculate_sum(counter1, variable_3_9));
            try {
                counter1 = future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            executor.shutdown();
            try {
                executor.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (time <= t + 0.5) {
                result_accumulator += b;
                time += a;
            }
        }
        int[] arr1 = {56, 51, 22};
        int[] arr2 = {2, 75, 30};
        ttest_ind(arr1, arr2);
        System.out.println(result_accumulator);
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        // Implement the ttest_ind function here
    }

    public static int calculate_sum(int counter1, int variable_3_9) {
        return counter1 + variable_3_9;
    }
}