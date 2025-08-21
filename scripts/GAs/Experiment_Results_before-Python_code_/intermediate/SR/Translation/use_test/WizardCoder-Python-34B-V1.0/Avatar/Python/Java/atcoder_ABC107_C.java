```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = scanner.nextInt();
        }
        int[] lst_p = new int[N];
        int[] lst_m = new int[N];
        int p = 0, m = 0, x = 0, y = N - 1, lastx = N, lasty = N;
        for (int i = 0; i < N; i++) {
            if (lst[i] > 0) {
                lst_p[p++] = lst[i];
            } else if (lst[i] < 0) {
                lst_m[m++] = lst[i];
            }
        }
        int ans = check(K, lst_p, lst_m, p, m, x, y, lastx, lasty);
        System.out.println(ans);
    }

    public static int check(int K, int[] lst_p, int[] lst_m, int p, int m, int x, int y, int lastx, int lasty) {
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j <= K; j++) {
            if (j > lastx || K - j > lasty) {
                continue;
            }
            int p_val = (j > 0) ? lst_p[j - 1] : 0;
            int m_val = (K - j > 0) ? lst_m[lasty - (K - j)] : 0;
            ans = Math.min(ans, Math.min(2 * p_val + Math.abs(m_val), p_val + 2 * Math.abs(m_val));
        }
        return ans;
    }
}
```

Test input:
99999 66666
-24998961 -24998137 -24997980 -24996839 -24996786 -24996493 -24996253 -24996188 -24994096 -24993639 -24993247 -24991922 -24990998 -24989477 -24989026 -24987613 -24986977 -24986871 -24986802 -24985843 -24985025 -24984178 -24983426 -24982640 -24982382 -24981993 -24981451 -24981010 -24980748 -24978420 -24977673 -24977479 -24977310 -24975209 -24974823 -24974246 -24973411 -2497383 -24971326 -24970456 -2496830 -24968818 -2496800 -24968756 -24968747 -24968051 -24967958 -24967173 -2496698
Expected output:
99530928
``` 
