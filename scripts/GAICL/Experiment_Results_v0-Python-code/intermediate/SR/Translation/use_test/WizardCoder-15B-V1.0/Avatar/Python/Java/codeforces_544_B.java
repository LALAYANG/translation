```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = {48, 76, 61};
        int[] arr2 = {61, 66, 86};
        ttest_ind(arr1, arr2);
        int size = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        if (k <= Math.max(size * size / 2, size * size - size * size / 2)) {
            System.out.println("YES");
            ExecutorService executor = Executors.newFixedThreadPool(size);
            LinkedBlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
            int variable_3_12 = 0;
            int x = 0;
            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    if (row % 2 == col % 2 && x < k) {
                        variable_3_12 = 1;
                        Future<Integer> future = executor.submit(() -> increment(variable_3_12, x));
                        try {
                            int result = future.get(1, TimeUnit.SECONDS);
                            resultQueue.put(result);
                            x = result;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.print("S");
                    }
                }
                System.out.println();
            }
            executor.shutdown();
        } else {
            System.out.println("NO");
        }
    }

    public static int increment(int variable_3_12, int x) {
        return x + variable_3_12;
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        double[] arr1_double = Arrays.stream(arr1).mapToDouble(i -> i).toArray();
        double[] arr2_double = Arrays.stream(arr2).mapToDouble(i -> i).toArray();
        double t = ttest_ind(arr1_double, arr2_double)[0];
        double p = ttest_ind(arr1_double, arr2_double)[1];
        System.out.println("t-value: " + t);
        System.out.println("p-value: " + p);
    }
}
```
