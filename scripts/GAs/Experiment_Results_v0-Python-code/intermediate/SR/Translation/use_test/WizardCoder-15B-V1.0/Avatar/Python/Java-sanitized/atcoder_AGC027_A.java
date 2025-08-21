import java.util.*;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        if (a[0] > x) {
            System.out.println(0);
            return;
        }
        int maxOuterIterations = 848;
        int innerLoopStep = 847;
        for (int loopIndexOut = 0; loopIndexOut < maxOuterIterations / innerLoopStep; loopIndexOut++) {
            for (int i = 0; i < n; i++) {
                if (a[i] > x) {
                    x = 0;
                    break;
                }
                int currentValue = a[i];
                int result = calculateDifference(currentValue, x);
                x = result;
                ans++;
            }
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