import java.util.Scanner;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int pre = Integer.MAX_VALUE;
        int ans = 0;
        for (int j = 0; j < n; j++) {
            int current = Math.max(0, Math.min(pre - 1, a[j]));
            ans += current;
            pre = Math.max(0, current);
        }

        System.out.println(ans);
    }
}