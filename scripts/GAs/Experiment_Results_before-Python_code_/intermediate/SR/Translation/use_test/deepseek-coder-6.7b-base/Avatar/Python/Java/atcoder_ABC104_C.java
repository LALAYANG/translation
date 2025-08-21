
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int G = sc.nextInt();
        int[] p = new int[D];
        int[] c = new int[D];
        for (int i = 0; i < D; i++) {
            p[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        int ans = 1000000000;
        for (int i = 0; i < (1 << D); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < D; j++) {
                if ((i >> j) % 2 == 1) {
                    score += 100 * (j + 1) * p[j] + c[j];
                    problem += p[j];
                }
            }
            if (score > G) {
                continue;
            }
            int left = G - score;
            for (int j = 0; j < D; j++) {
                if ((i >> j) % 2 == 1) {
                    continue;
                }
                if (left > 100 * (j + 1) * p[j] + c[j]) {
                    continue;
                }
                int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                ans = Math.min(ans, problem + Math.min(tmp, p[j]));
            }
        }
        System.out.println(ans);
    }
}

```

