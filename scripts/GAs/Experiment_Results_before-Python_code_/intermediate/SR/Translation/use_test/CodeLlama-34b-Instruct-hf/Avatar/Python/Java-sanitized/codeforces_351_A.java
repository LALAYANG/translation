import java.util.Scanner;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);
        int o = 2 * n - arr.length;
        double arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        double res = 2e9;
        for (int i = 0; i < n + 1; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arrSum));
            }
        }
        System.out.printf("%.3f", res);
    }
}