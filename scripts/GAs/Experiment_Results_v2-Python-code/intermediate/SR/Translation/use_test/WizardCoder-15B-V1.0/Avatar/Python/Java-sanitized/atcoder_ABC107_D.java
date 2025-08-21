import java.util.*;

public class atcoder_ABC107_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[] d = new int[a[n - 1] + 1];
        for (int i = 0; i < a.length; i++) {
            d[a[i]] = i;
        }
        for (int i = 0; i < n; i++) {
            a[i] = d[a[i]];
        }
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = b[i] + (a[i] >= n / 2) ? 1 : -1;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += b[i + 1];
        }
        if (ans >= m) {
            System.out.println(n / 2);
        } else {
            int l = 0, r = n / 2;
            while (l < r) {
                int mid = (l + r) / 2;
                if (check(mid, a)) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            System.out.println(l);
        }
    }

    public static boolean check(int X, int[] a) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i + 1] = b[i] + (a[i] >= X) ? 1 : -1;
        }
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans += b[i + 1];
        }
        return ans >= a.length / 2;
    }
}