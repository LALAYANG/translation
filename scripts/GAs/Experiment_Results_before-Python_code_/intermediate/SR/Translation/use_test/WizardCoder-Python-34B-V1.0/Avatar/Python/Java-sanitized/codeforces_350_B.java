import java.util.Scanner;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n + 1];
        int[] a = new int[n + 1];
        int[] cnt = new int[n + 1];
        t[0] = 0;
        a[0] = 0;
        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        int[] ans = new int[n + 1];
        int[] cnt = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cnt[t[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (t[i] == 1) {
                int x = i;
                int[] crt = new int[n + 1];
                int j = 0;
                while (cnt[x] == 1) {
                    crt[j++] = x;
                    x = a[x];
                }
                if (j > ans.length) {
                    ans = Arrays.copyOf(crt, j);
                }
            }
        }
        int len = ans.length;
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        System.out.println(len);
    }
}