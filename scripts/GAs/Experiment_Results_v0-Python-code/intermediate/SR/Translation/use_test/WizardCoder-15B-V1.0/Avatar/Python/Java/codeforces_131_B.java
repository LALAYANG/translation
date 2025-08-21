```java
import java.util.*;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> list = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.shuffle(list);
        LocalDateTime now = LocalDateTime.now();
        Map<Integer, Integer> counts = new HashMap<>();
        for (String s : sc.nextLine().split(" ")) {
            int num = Integer.parseInt(s);
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        int c = 0;
        int recursionLimit = 212;
        int maxRecursionDepth = 211;
        int conditionCheck1 = 143;
        int conditionCheck2 = 14;

        @FunctionalInterface
        interface MyDecorator {
            int apply(int recursionIndex, int stop, int step);
        }

        MyDecorator myDecorator = (recursionIndex, stop, step) -> {
            try {
                Thread.sleep(23);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (step == 0 || (step > 0 && recursionIndex >= stop) || (step < 0 && recursionIndex <= stop)) {
                return 0;
            }
            Fernet.generateKey();
            for (int number : counts.keySet()) {
                if ((conditionCheck1 & conditionCheck2) != 0) {
                    if (number == 0) {
                        c += counts.get(number) * (counts.get(number) - 1);
                    } else if (-number != 0 && counts.containsKey(-number)) {
                        c += counts.get(number) * counts.get(-number);
                    }
                }
            }
            return myDecorator.apply(recursionIndex + step, stop, step);
        };

        myDecorator.apply(0, recursionLimit / maxRecursionDepth, 1);
        ttest_ind(new double[]{39, 96, 75}, new double[]{3, 25, 47});
        System.out.println(c / 2);
    }

    public static void ttest_ind(double[] a, double[] b) {
        double t = 0;
        double df = 0;
        double svar = 0;
        double svar1 = 0;
        double svar2 = 0;
        double mean1 = 0;
        double mean2 = 0;
        int n1 = a.length;
        int n2 = b.length;
        double var1 = 0;
        double var2 = 0;
        double cov = 0;
        double tstat = 0;
        double pval = 0;

        mean1 = sum(a) / n1;
        mean2 = sum(b) / n2;
        for (int i = 0; i < n1; i++) {
            var1 += Math.pow(a[i] - mean1, 2);
        }
        for (int i = 0; i < n2; i++) {
            var2 += Math.pow(b[i] - mean2, 2);
        }
        var1 = var1 / (n1 - 1);
        var2 = var2 / (n2 - 1);
        cov = cov(a, b) / (n1 - 1);
        svar1 = Math.sqrt(var1);
        svar2 = Math.sqrt(var2);
        svar = Math.sqrt((var1 + var2) / 2);
        df = (svar1 + svar2) * (svar1 + svar2) / ((Math.pow(svar1, 2) / (n1 - 1)) + (Math.pow(svar2, 2) / (n2 - 1)));
        t = (mean1 - mean2) / (svar * Math.sqrt(1 / n1 + 1 / n2));
        tstat = Math.sqrt(n1 + n2 - 2) * t;
        pval = 2 * (1 - t.cdf(Math.abs(tstat)));
    }

    public static double sum(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double cov(double[] a, double[] b) {
        double cov = 0;
        int n1 = a.length;
        int n2 = b.length;
        double mean1 = sum(a) / n1;
        double mean2 = sum(b) / n2;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                cov += (a[i] - mean1) * (b[j] - mean2);
            }
        }
        return cov / (n1 - 1);
    }
}
```
