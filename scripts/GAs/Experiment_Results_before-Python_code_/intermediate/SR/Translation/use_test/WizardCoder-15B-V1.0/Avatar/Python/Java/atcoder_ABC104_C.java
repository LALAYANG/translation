```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int G = sc.nextInt();
        List<int[]> PC = new ArrayList<>();
        for (int i = 0; i < D; i++) {
            int[] p = new int[2];
            p[0] = sc.nextInt();
            p[1] = sc.nextInt();
            PC.add(p);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < (1 << D); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < D; j++) {
                if ((i & (1 << j)) != 0) {
                    score += 100 * (j + 1) * PC.get(j)[0] + PC.get(j)[1];
                    problem += PC.get(j)[0];
                }
            }
            if (score > G) {
                continue;
            }
            int left = G - score;
            for (int j = 0; j < D; j++) {
                if ((i & (1 << j)) != 0) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC.get(j)[0] + PC.get(j)[1]) {
                    continue;
                }
                int tmp = (left + (100 * (j + 1)) - 1) / (100 * (j + 1));
                ans = Math.min(ans, problem + Math.min(tmp, PC.get(j)[0]));
            }
        }
        System.out.println(ans);
    }
}
```
