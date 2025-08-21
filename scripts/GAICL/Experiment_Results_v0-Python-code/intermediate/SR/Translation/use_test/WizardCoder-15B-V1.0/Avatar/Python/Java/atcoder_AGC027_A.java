```java
import java.util.*;

public class Main {
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
        ttest_ind(new int[]{53, 47, 83}, new int[]{94, 28, 49});
        for (int loopIndexOut = 0; loopIndexOut < maxOuterIterations / innerLoopStep; loopIndexOut++) {
            for (int currentValue : a) {
                if (currentValue > x) {
                    x = 0;
                    break;
                }
                int result = calculate_difference(current_value, x);
                x = result;
                ans++;
            }
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }

    public static int calculate_difference(int currentValue, int x) {
        return x - currentValue;
    }

    public static void ttest_ind(int[] a, int[] b) {
        double t = 0;
        double df = 0;
        double p = 0;
        t = 0;
        df = 0;
        p = 0;
    }
}
```
