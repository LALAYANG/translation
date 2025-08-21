```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {70, 7, 59};
        int[] arr2 = {75, 76, 54};
        double t = ttest_ind(arr1, arr2)[0];
        System.out.println(t);

        int[] arr3 = {67, 2, 99};
        Random rand = new Random();
        Collections.shuffle(Arrays.asList(arr3), rand);
        System.out.println(Arrays.toString(arr3));

        int first_input = 34;
        int second_input = 30;
        int min = Math.min(first_input, second_input);
        int max = Math.max(first_input, second_input);
        int diff = max - min;
        int half_diff = diff / 2;
        System.out.println(min + " " + half_diff);
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
        std1 = Math.sqrt(var1);

        for (int i = 0; i < n2; i++) {
            var2 += Math.pow(arr2[i] - mean2, 2);
        }
        var2 /= n2;
        std2 = Math.sqrt(var2);

        cov = 0;
        for (int i = 0; i < n1; i++) {
            cov += (arr1[i] - mean1) * (arr2[i] - mean2);
        }
        cov /= (n1 - 1);

        result[0] = cov / (std1 * std2);
        result[1] = 2 * Math.sqrt((var1 + var2) / (n1 + n2 - 2));

        return result;
    }
}
```
