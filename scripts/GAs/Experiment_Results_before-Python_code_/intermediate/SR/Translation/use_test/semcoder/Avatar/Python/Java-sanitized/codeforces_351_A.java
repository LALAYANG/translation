import java.util.Scanner;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }
        
        int o = 0;
        float arr_sum = 0;
        for (float num : arr) {
            if (num % 1 != 0) {
                o++;
                arr_sum += (int) num;
            }
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