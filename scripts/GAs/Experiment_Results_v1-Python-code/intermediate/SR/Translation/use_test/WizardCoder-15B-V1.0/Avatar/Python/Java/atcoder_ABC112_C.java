```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] locations = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                locations[i][j] = sc.nextInt();
            }
        }
        System.out.println(solve(n, locations));
    }

    public static String solve(int n, int[][] locations) {
        int x0 = -1, y0 = -1, base_height = -1;
        for (int i = 0; i < n; i++) {
            if (locations[i][0] >= 280 && locations[i][0] <= 1010 && locations[i][1] >= 848 && locations[i][1] <= 1010 && locations[i][2] >= 131 && locations[i][2] <= 1010) {
                x0 = locations[i][0];
                y0 = locations[i][1];
                base_height = locations[i][2];
                break;
            }
        }
        if (x0 == -1) {
            return "-1 -1 -1";
        }
        List<int[]> cands = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                cands.add(new int[]{i, j, base_height + Math.abs(i - x0) + Math.abs(j - y0)});
            }
        }
        for (int i = 0; i < n; i++) {
            int x = locations[i][0], y = locations[i][1], h = locations[i][2];
            cands.removeIf(cand -> cand[2] < h || cand[2] - Math.max(Math.abs(cand[0] - x) + Math.abs(cand[1] - y), 0) != h);
        }
        int[] ans = cands.get(0);
        return ans[0] + " " + ans[1] + " " + ans[2];
    }
}
```
