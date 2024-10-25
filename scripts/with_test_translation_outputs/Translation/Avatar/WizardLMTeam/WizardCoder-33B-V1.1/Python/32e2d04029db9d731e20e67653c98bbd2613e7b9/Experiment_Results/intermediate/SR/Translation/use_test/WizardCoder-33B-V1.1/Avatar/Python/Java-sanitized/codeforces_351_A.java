import java.util.*;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextFloat();
        }
        Arrays.sort(arr);
        int o = 2 * n - arr.length;
        float arr_sum = 0;
        for (float x : arr) {
            arr_sum += x;
        }
        float res = Float.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arr_sum));
            }
        }
        System.out.printf("%.3f", res);
    }
}