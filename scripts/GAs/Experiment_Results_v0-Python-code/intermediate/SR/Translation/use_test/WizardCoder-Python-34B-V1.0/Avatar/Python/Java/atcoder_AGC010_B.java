```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int condition_1 = 620;
        int condition_2 = 462;
        int check_condition_1 = 538;
        int check_condition_2 = 673;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if ((condition_1 & condition_2) != 0) {
            if ((check_condition_1 & check_condition_2) != 0) {
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += a[i];
                }
                if (sum % ((n * (n + 1) / 2) != 0)) {
                    System.out.println("NO");
                } else {
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    double variable_17_11 = 1;
                    double variable_8_11 = 2;
                    double k = calculateAverage(sum, n, variable_17_11, variable_8_11, a);
                    a[n - 1] = a[0];
                    if (sumModulo(a, k, n) || sumDivideByN(a, k, n) != n) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                    executor.shutdown();
                    try {
                        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static double calculateAverage(int sum, int n, double variable_17_11, double variable_8_11, int[] a) {
        double result = sum / (n * (n + variable_17_11) / variable_8_11);
        return result;
    }

    private static boolean sumModulo(int[] a, double k, int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += (int) (k - a[i] + a[i - 1]) % n;
        }
        return sum != 0;
    }

    private static int sumDivideByN(int[] a, double k, int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if ((k - a[i] + a[i - 1]) / n >= 0) {
                count++;
            }
        }
        return count;
    }
}
```

Test input:
9997
174940 224905 274870 324835 374800 424765 474730 524695 574660 624625 674590 724555 774520 824485 874450 924415 974380 1024345 1074310 1124275 1174240 1224205 1274170 1324135 1374100 1424065 1474030 1523995 1573960 1623925 1673890 1723855 1773820 1823785 1873750 1923715 1973680 2023645 2073610 2123575 2173540 2223505 2273470 2323435 2373400 2423365 2473330 2523295 2573260 2623225 2673190 2723155 2773120 2823085 2873050 2923015 2972980 3022945 3072910 3122875 3172840 3222805 3272770 3322735
Expected output:
NO 
