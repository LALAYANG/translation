import java.util.*;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        Arrays.sort(values);
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans += Math.max(0, Math.min(pre - 1, values[i]));
            pre = Math.max(0, Math.min(pre - 1, values[i]));
        }
        System.out.println(ans);
    }
}