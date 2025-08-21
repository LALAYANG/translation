```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int variable_8_11 = 2;
        int variable_17_11 = 1;
        int condition_1 = 620;
        int condition_2 = 462;
        int check_condition_1 = 538;
        int check_condition_2 = 673;
        if ((condition_1 & condition_2) != 0) {
            if ((check_condition_1 & check_condition_2) != 0) {
                int sum = 0;
                for (int i : a) {
                    sum += i;
                }
                if (sum % (n * (n + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Double> future = executor.submit(() -> calculateAverage(sum, n, variable_17_11, variable_8_11, a));
                    double k = future.get();
                    executor.shutdown();
                    int[] newA = new int[n + 1];
                    System.arraycopy(a, 0, newA, 0, n);
                    newA[n] = a[0];
                    double sum2 = 0;
                    for (int i = 1; i < newA.length; i++) {
                        sum2 += (k - newA[i] + newA[i - 1]);
                    }
                    int count = 0;
                    for (int i = 1; i < newA.length; i++) {
                        if ((k - newA[i] + newA[i - 1]) / n >= 0) {
                            count++;
                        }
                    }
                    if (sum2 % n != 0 || count != n) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
    }

    private static double calculateAverage(int sum, int n, int variable_17_11, int variable_8_11, int[] a) {
        int sumA = 0;
        for (int i : a) {
            sumA += i;
        }
        return (double) sumA / (n * (n + variable_17_11) / variable_8_11);
    }
}
```

