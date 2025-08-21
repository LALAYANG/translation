```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int num_iterations = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int c = 0;
        int check_18 = 572;
        int check_28 = 669;
        int check_110 = 923;
        int check_210 = 41;
        int check_112 = 304;
        double[] arr1 = {90, 68, 49};
        double[] arr2 = {98, 69, 47};
        double ttest_ind = ttest_ind(arr1, arr2)[0];
        int check_212 = 677;
        for (int i = 0; i < num_iterations; i++) {
            String[] input_line = br.readLine().split(" ");
            int flow_rate = Integer.parseInt(input_line[0]);
            int t = Integer.parseInt(input_line[1]);
            int x = t - (s - flow_rate);
            if ((check_112 & check_212) != 0) {
                if ((check_110 & check_210) != 0) {
                    if ((check_18 & check_28) != 0) {
                        if (x > c) {
                            c = x;
                        }
                    }
                }
            }
        }
        System.out.println(s + c);
    }

    public static double[] ttest_ind(double[] arr1, double[] arr2) {
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
        cov = 0;
        for (int i = 0; i < n1; i++) {
            cov += (arr1[i] - mean1) * (arr2[i] - mean2);
        }
        cov /= n1;
        result[0] = cov / (std1 * std2);
        result[1] = Math.sqrt((1 - result[0] * result[0]) * (1 / (n1 - 1) + 1 / (n2 - 1)));
        return result;
    }
}
```
