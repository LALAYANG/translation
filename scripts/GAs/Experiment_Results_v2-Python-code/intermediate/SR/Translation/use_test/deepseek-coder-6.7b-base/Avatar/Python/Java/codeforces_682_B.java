```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int f = 1;
        Arrays.sort(l);
        int c = 0;
        int condition_four = 477;
        int condition_one = 274;
        int condition_two = 748;
        int condition_three = 828;
        double ttest_ind = ttest_ind(new double[]{23, 64, 96}, new double[]{56, 42, 91});
        for (int element : l) {
            if (condition_two & condition_three) {
                if (condition_four & condition_one) {
                    if (element > c) {
                        int increment = 1;
                        Queue<Integer> queue_calculate_sum0 = new LinkedList<>();
                        ExecutorService executorService = Executors.newSingleThreadExecutor();
                        Future<Integer> future_calculate_sum0 = executorService.submit(() -> {
                            int result = calculate_sum(c, increment);
                            return result;
                        });
                        try {
                            int result_calculate_sum0 = future_calculate_sum0.get();
                            c = result_calculate_sum0;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        executorService.shutdown();
                    }
                }
            }
        }
        System.out.println(c + 1);
    }

    public static int calculate_sum(int c, int increment) {
        return c + increment;
    }
}
```

