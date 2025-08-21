import java.util.*;

public class atcoder_ABC107_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = b[i] + a[i];
        }
        int l = 0, r = n;
        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (check(b, m, mid)) {
                r = mid;
            } else {
                l = mid;
            }
        }
        System.out.println(a[l]);
    }

    private static boolean check(int[] b, int m, int mid) {
        int n = b.length - 1;
        int[] tree = new int[n + 1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += sum(tree, b[i + 1] - mid + 1);
            add(tree, b[i + 1], n);
        }
        return ans >= m;
    }

    private static int sum(int[] tree, int i) {
        int ret = 0;
        while (i > 0) {
            ret += tree[i];
            i ^= i & -i;
        }
        return ret;
    }

    private static void add(int[] tree, int i, int n) {
        i++;
        while (i <= n) {
            tree[i]++;
            i += i & -i;
        }
    }
}