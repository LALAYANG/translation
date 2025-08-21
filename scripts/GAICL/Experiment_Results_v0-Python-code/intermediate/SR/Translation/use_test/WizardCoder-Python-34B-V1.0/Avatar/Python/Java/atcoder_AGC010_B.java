```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

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
                if (sum % (n * (n + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Double> future = executor.submit(new CalculateAverageTask(n, a, 1, 2));
                    double k = 0.0;
                    try {
                        k = future.get();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    a = addFirstElementToEnd(a);
                    boolean condition = true;
                    for (int i = 0; i < n; i++) {
                        if ((k - a[i] + a[(i + 1) % n]) % n != 0) {
                            condition = false;
                            break;
                        }
                    }
                    if (condition && sumOfDivisions(k, n, a) == n) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }

    private static int[] addFirstElementToEnd(int[] a) {
        int[] newArray = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        newArray[a.length] = a[0];
        return newArray;
    }

    private static int sumOfDivisions(double k, int n, int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += (int) ((k - a[i] + a[(i + 1) % n]) / n);
        }
        return sum;
    }

    private static class CalculateAverageTask implements Callable<Double> {
        private int n;
        private int[] a;
        private int variable_17_11;
        private int variable_8_11;

        public CalculateAverageTask(int n, int[] a, int variable_17_11, int variable_8_11) {
            this.n = n;
            this.a = a;
            this.variable_17_11 = variable_17_11;
            this.variable_8_11 = variable_8_11;
        }

        @Override
        public Double call() {
            return calculateAverage(n, variable_17_11, variable_8_11, a);
        }

        private double calculateAverage(int n, int variable_17_11, int variable_8_11, int[] a) {
            double sum = 0.0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            return sum / (n * (n + variable_17_11) / variable_8_11);
        }
    }
}
```

Test input:
9997
174940 224905 274870 324835 374800 424765 474730 524695 574660 624625 674590 724555 774520 824485 874450 924415 974380 1024345 1074310 1124275 1174240 1224205 1274170 1324135 1374100 1424065 1474030 1523995 1573960 1623925 1673890 1723855 1773820 1823785 1873750 1923715 1973680 2023645 2073610 2123575 2173540 2223505 2273470 2323435 2373400 2423365 2473330 2523295 2573260 2623225 2673190 2723155 2773120 2823085 2873050 2923015 2972980 3022945 3072910 3122875 3172840 3222805 3272770 3322735
Expected output:
NO 
