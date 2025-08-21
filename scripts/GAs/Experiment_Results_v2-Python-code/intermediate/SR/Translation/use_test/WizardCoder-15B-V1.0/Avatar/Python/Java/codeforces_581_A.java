```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr1 = {34, 57, 27};
        int[] arr2 = {6, 15, 17};
        double t = ttest_ind(arr1, arr2)[0];
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int diff = difference_function(max, min) / 2;
        System.out.println(min + " " + diff);
    }

    public static double[] ttest_ind(int[] arr1, int[] arr2) {
        double[] result = new double[2];
        double mean1 = 0, mean2 = 0, var1 = 0, var2 = 0, std1 = 0, std2 = 0, cov = 0;
        int n1 = arr1.length, n2 = arr2.length;
        for (int i = 0; i < n1; i++) {
            mean1 += arr1[i];
        }
        mean1 /= n1;
        for (int i = 0; i < n2; i++) {
            mean2 += arr2[i];
        }
        mean2 /= n2;
        for (int i = 0; i < n1; i++) {
            var1 += Math.pow(arr1[i] - mean1, 2);
        }
        var1 /= n1;
        for (int i = 0; i < n2; i++) {
            var2 += Math.pow(arr2[i] - mean2, 2);
        }
        var2 /= n2;
        std1 = Math.sqrt(var1);
        std2 = Math.sqrt(var2);
        cov = (std1 * std2) / (n1 + n2 - 2);
        result[0] = (mean1 - mean2) / (std1 + std2);
        result[1] = cov * (1 / n1 + 1 / n2);
        return result;
    }

    public static int difference_function(int a, int b) {
        return a - b;
    }
}
```
