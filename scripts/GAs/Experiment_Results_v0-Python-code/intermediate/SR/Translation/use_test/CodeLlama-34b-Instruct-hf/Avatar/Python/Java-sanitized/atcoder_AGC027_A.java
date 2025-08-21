import java.util.concurrent.ThreadLocalRandom;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
        int n = 100;
        int x = 18132779;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int currentValue = a[i];
            if (currentValue > x) {
                x = 0;
                break;
            }
            int result = calculateDifference(currentValue, x);
            x = result;
            ans++;
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }

    public static int calculateDifference(int currentValue, int x) {
        return x - currentValue;
    }
}