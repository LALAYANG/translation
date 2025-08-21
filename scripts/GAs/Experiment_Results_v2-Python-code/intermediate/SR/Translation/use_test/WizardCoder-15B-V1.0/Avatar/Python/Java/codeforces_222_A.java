```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = arr[k - 1];
        int[] toDelete = new int[k - 1];
        for (int i = 0; i < k - 1; i++) {
            toDelete[i] = arr[i];
        }
        int count = 0;
        for (int i = k - 1; i < n; i++) {
            if (arr[i] == target) {
                count++;
            } else {
                break;
            }
        }
        if (count == k - 1) {
            System.out.println(0);
            return;
        }
        if (k == 1) {
            System.out.println(-1);
            return;
        }
        if (count < k - 1) {
            System.out.println(-1);
            return;
        }
        int[] newArr = new int[n - k + 1];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i < k - 1 || arr[i] != target) {
                newArr[j++] = arr[i];
            }
        }
        double[] arr1 = new double[k - 1];
        double[] arr2 = new double[newArr.length];
        for (int i = 0; i < k - 1; i++) {
            arr1[i] = toDelete[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            arr2[i] = newArr[i];
        }
        double t = ttest_ind(arr1, arr2)[0];
        if (t < 0.05) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }

    public static double[] ttest_ind(double[] arr1, double[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        double mean1 = 0;
        double mean2 = 0;
        for (int i = 0; i < n1; i++) {
            mean1 += arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            mean2 += arr2[i];
        }
        mean1 /= n1;
        mean2 /= n2;
        double var1 = 0;
        double var2 = 0;
        for (int i = 0; i < n1; i++) {
            var1 += Math.pow(arr1[i] - mean1, 2);
        }
        for (int i = 0; i < n2; i++) {
            var2 += Math.pow(arr2[i] - mean2, 2);
        }
        var1 /= n1;
        var2 /= n2;
        double std1 = Math.sqrt(var1);
        double std2 = Math.sqrt(var2);
        double t = (mean1 - mean2) / (std1 / Math.sqrt(n1) + std2 / Math.sqrt(n2));
        double df = Math.pow(std1 / Math.sqrt(n1) + std2 / Math.sqrt(n2), 2) / (Math.pow(std1 / Math.sqrt(n1), 2) / (n1 - 1) + Math.pow(std2 / Math.sqrt(n2), 2) / (n2 - 1));
        double[] result = new double[2];
        result[0] = t;
        result[1] = df;
        return result;
    }
}
```
