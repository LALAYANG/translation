import java.util.*;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Double> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double num = scanner.nextDouble();
            if (num - (int) num != 0) {
                arr.add(num);
            }
        }
        Collections.sort(arr);
        int o = 2 * n - arr.size();
        double arrSum = 0;
        for (double num : arr) {
            arrSum += num;
        }
        double res = Double.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arrSum));
            }
        }
        System.out.printf("%.3f\n", res);
    }
}