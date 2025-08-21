import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class atcoder_ABC107_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] _a = Arrays.stream(a).distinct().sorted().toArray();
        HashMap<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < _a.length; i++) {
            d.put(_a[i], i);
        }
        a = Arrays.stream(a).map(x -> d.get(x)).toArray();

        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = (a[i] >= X) ? 2 : -1;
        }
        for (int i = 1; i <= n; i++) {
            b[i] += b[i - 1];
        }
        int c = Arrays.stream(b).min().getAsInt();
        b = Arrays.stream(b).map(x -> x - c).toArray();

        int[] bit = new int[max(b) + 2];
        for (int i = 0; i < n; i++) {
            bit[b[i] + 1]++;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += bit[b[i] + 1];
        }
        System.out.println(ans >= m ? _a[t[1]] : -1);
    }
}