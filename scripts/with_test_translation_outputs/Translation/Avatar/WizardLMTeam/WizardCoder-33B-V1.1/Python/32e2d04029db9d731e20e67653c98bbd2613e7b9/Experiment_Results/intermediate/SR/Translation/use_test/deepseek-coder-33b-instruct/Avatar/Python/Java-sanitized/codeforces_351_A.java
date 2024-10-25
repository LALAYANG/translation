import java.util.*;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextFloat();
        }
        ArrayList<Float> arrList = new ArrayList<>();
        for (float x : arr) {
            if (x - (int) x != 0) {
                arrList.add(x - (int) x);
            }
        }
        Collections.sort(arrList);
        int o = 2 * n - arrList.size();
        float arrSum = 0;
        for (float x : arrList) {
            arrSum += x;
        }
        float res = Float.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arrSum));
            }
        }
        System.out.printf("%.3f", res);
    }
}