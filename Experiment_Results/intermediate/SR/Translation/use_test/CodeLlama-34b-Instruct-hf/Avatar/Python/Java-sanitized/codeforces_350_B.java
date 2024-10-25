import java.util.Scanner;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n + 1];
        int[] a = new int[n + 1];
        int[] cnt = new int[n + 1];
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (t[i] == 1) {
                int crt = i;
                int x = a[i];
                while (cnt[x] == 1) {
                    crt = x;
                    x = a[x];
                }
                if (crt > ans[0]) {
                    ans[0] = crt;
                }
            }
        }

        System.out.println(ans[0]);
        for (int i = 1; i <= ans[0]; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}