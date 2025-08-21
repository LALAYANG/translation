import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class atcoder_ABC107_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] _a = new int[n];
        for (int i = 0; i < n; i++) {
            _a[i] = a[i];
        }
        Arrays.sort(_a);
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < n; i++) {
            d.put(_a[i], i);
        }
        for (int i = 0; i < n; i++) {
            a[i] = d.get(a[i]);
        }
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = (a[i] >= X) ? 2 : -1;
        }
        for (int i = 1; i < n; i++) {
            b[i] += b[i - 1];
        }
        int c = Arrays.stream(b).min().getAsInt();
        for (int i = 0; i < n; i++) {
            b[i] -= c;
        }
        int[] bit = new int[n + 1];
        for (int i = 0; i < n; i++) {
            bit[i + 1] = b[i];
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += bit[i + 1];
            bit[i + 1] += bit[i];
        }
        System.out.println(ans >= m ? _a[t[1]] : _a[t[0]]);
    }
}