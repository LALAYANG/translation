import java.util.*;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans += Math.max(0, Math.min(pre - 1, a[i]));
            pre = Math.max(0, Math.min(pre - 1, a[i]));
        }
        System.out.println(ans);
    }
}