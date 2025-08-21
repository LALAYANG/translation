import java.util.*;
import java.io.*;

public class atcoder_ABC107_D {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = n * (n + 1) / 4;
        String[] a = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(a[i]);
        }
        Arrays.sort(arr);
        int[] freq = new int[n + 1];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        int[] bit = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j <= n) {
                bit[j] += freq[i];
                j += j & -j;
            }
        }
        int l = 0, r = n, ans = 0;
        while (l < r) {
            int mid = (l + r) / 2;
            if (check(mid, bit)) {
                ans = mid;
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean check(int X, int[] bit) {
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[arr[i]]++;
        }
        int c = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            c = Math.min(c, b[i]);
            b[i] -= c;
        }
        int[] bit2 = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j <= n) {
                bit2[j] += b[i];
                j += j & -j;
            }
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans += bit2[i];
        }
        return ans >= m;
    }
}