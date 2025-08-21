```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(a));
        int[] _a = set.toArray();
        int[] d = new int[_a.length];
        for (int i = 0; i < _a.length; i++) {
            d[_a[i]] = i;
        }
        for (int i = 0; i < n; i++) {
            a[i] = d[a[i]];
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = (a[i] >= _a[0] ? 2 : 1) - 1;
        }
        int[] bit = new int[m + 2];
        int ans = 0;
        for (int x : b) {
            ans += sum(bit, x + 1);
            add(bit, x + 1, 1);
        }
        int[] t = {_a.length, 0};
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            if (check(b, mid)) {
                t[0] = mid;
            } else {
                t[1] = mid;
            }
        }
        System.out.println(_a[t[1]]);
    }

    public static boolean check(int[] b, int X) {
        int[] c = new int[b.length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < b.length; i++) {
            c[i] = b[i] >= X ? 1 : 0;
            min = Math.min(min, c[i]);
        }
        for (int i = 0; i < b.length; i++) {
            c[i] -= min;
        }
        int[] bit = new int[m + 2];
        int sum = 0;
        for (int x : c) {
            sum += sum(bit, x + 1);
            add(bit, x + 1, 1);
        }
        return sum >= m;
    }

    public static int sum(int[] bit, int index) {
        int ret = 0;
        while (index > 0) {
            ret += bit[index];
            index -= index & -index;
        }
        return ret;
    }

    public static void add(int[] bit, int index, int x) {
        while (index <= m) {
            bit[index] += x;
            index += index & -index;
        }
    }
}
``` 
