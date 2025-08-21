```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = (n * (n + 1)) / 4;
        Map<Integer, Integer> d = new HashMap<>();
        int[] _a = new int[n];
        int[] sorted_a = Arrays.stream(a).boxed().sorted().distinct().mapToInt(i -> i).toArray();
        for (int i = 0; i < sorted_a.length; i++) {
            d.put(sorted_a[i], i);
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = d.get(a[i]);
        }
        int[] c = new int[n + 1];
        for (int i = 0; i < n; i++) {
            c[i + 1] = b[i] + c[i];
        }
        int[] bit = new int[m + 1];
        int[] t = {sorted_a.length, 0};
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            if (checkThreshold(mid, c, bit, m)) {
                t[0] = mid;
            } else {
                t[1] = mid;
            }
        }
        System.out.println(sorted_a[t[1]]);
    }

    private static boolean checkThreshold(int mid, int[] c, int[] bit, int m) {
        int ans = 0;
        for (int x : c) {
            int index = x + 1;
            while (index <= m) {
                ans += bit[index];
                index += (index & -index);
            }
            bit[x + 1]++;
        }
        return ans >= m;
    }

    private static void bitAdd(int[] bit, int i, int x) {
        i++;
        while (i <= m) {
            bit[i] += x;
            i += (i & -i);
        }
    }

    private static int bitSum(int[] bit, int i) {
        int ret = 0;
        while (i > 0) {
            ret += bit[i];
            i -= (i & -i);
        }
        return ret;
    }
}
``` 
