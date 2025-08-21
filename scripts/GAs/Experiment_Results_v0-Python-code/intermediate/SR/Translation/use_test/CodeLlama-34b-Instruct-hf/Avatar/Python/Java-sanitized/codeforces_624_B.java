import java.util.Scanner;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        int pre = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.max(0, Math.min(pre - 1, values[i]));
            pre = Math.max(0, Math.min(pre - 1, values[i]));
            ans += diff;
        }

        System.out.println(ans);
    }
}