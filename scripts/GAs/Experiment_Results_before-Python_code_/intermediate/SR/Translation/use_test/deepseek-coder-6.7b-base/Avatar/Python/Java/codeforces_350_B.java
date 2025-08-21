```

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n + 1];
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        int[] cnt = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cnt[a[i]]++;
        }
        int[] ans = new int[n + 1];
        int maxLen = 0;
        for (int i = 1; i <= n; i++) {
            if (t[i] == 1) {
                int[] crt = new int[n + 1];
                int x = a[i];
                int len = 0;
                while (cnt[x] == 1) {
                    crt[len++] = x;
                    x = a[x];
                }
                if (len > maxLen) {
                    maxLen = len;
                    ans = crt;
                }
            }
        }
        System.out.println(maxLen);
        for (int i = maxLen - 1; i >= 0; i--) {
            System.out.print(ans[i] + " ");
        }
    }
}

```

