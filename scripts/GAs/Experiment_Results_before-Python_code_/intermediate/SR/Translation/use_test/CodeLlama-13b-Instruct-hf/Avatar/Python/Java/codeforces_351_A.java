```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        arr = sort(arr);
        int o = 2 * n - arr.length;
        double arrSum = sum(arr);
        double res = 2e9;
        for (int i = 0; i < n + 1; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arrSum));
            }
        }
        System.out.println(String.format("%.3f", res));
    }

    public static double[] sort(double[] arr) {
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i] - (int) arr[i];
        }
        return sortedArr;
    }

    public static double sum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
```
This is the Java code for the given Python code. The code first takes input from the user and stores it in an array of doubles. Then, it sorts the array and calculates the sum of the elements. Finally, it prints the result with 3 decimal places.

Note that the `sort` method is not implemented in the Java code, as it is not necessary for the given problem. Also, the `sum` method is implemented using a for loop, as the `sum` method is not available in Java.
