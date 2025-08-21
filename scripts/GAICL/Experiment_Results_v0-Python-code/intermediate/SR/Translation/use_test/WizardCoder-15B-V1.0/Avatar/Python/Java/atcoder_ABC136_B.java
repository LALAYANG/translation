```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int[] arr1 = {3, 10, 57};
        int[] arr2 = {63, 66, 53};
        ttest_ind(arr1, arr2);
        int i = 1;
        int ans = 0;
        int remainder = 988;
        int divisor = 987;
        while (remainder % divisor == 1) {
            remainder = remainder + 1;
            while (Math.pow(10, i) <= N) {
                ans += (int) Math.pow(10, i) - (int) Math.pow(10, i-1);
                i += 2;
            }
        }
        ans += Math.max(0, N - (int) Math.pow(10, i-1) + 1);
        System.out.println(ans);
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        double[] arr1_double = new double[arr1.length];
        double[] arr2_double = new double[arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1_double[i] = arr1[i];
            arr2_double[i] = arr2[i];
        }
        double t = ttest_ind(arr1_double, arr2_double)[0];
        double p = ttest_ind(arr1_double, arr2_double)[1];
        if (p < 0.05) {
            System.out.println("The two samples are significantly different.");
        } else {
            System.out.println("The two samples are not significantly different.");
        }
    }
}
```
