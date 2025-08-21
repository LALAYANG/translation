```java
import java.util.Scanner;

public class CodeforcesTask397B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        String[] result = new String[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];
            for (int j = 0; j < n; j++) {
                String[] temp = input.nextLine().split(" ");
                a[j] = Integer.parseInt(temp[0]);
                b[j] = Integer.parseInt(temp[1]);
                c[j] = Integer.parseInt(temp[2]);
            }
            int max = 0;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, a[j] + b[j] + c[j]);
            }
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                min = Math.min(min, a[j] + b[j] + c[j]);
            }
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[j] + b[j] + c[j];
            }
            double mean = (double) sum / n;
            double variance = 0;
            for (int j = 0; j < n; j++) {
                variance += Math.pow(a[j] + b[j] + c[j] - mean, 2);
            }
            variance /= n;
            double stdDev = Math.sqrt(variance);
            double tValue = stdDev * Math.sqrt(n) / Math.sqrt(1.0 / n + (Math.pow(mean - min, 2) / (Math.pow(max - min, 2) * (n - 1))));
            double pValue = 1 - t.studentT(n - 1).cdf(Math.abs(tValue));
            if (pValue < 0.05) {
                result[i] = "Yes";
            } else {
                result[i] = "No";
            }
        }
        for (String s : result) {
            System.out.println(s);
        }
    }
}
```
