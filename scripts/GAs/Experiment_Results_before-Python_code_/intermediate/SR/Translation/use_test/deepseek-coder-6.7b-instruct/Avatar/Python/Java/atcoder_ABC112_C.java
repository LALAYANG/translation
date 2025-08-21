```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] ls_xyh = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                ls_xyh[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solve(n, ls_xyh));
    }

    public static String solve(int n, int[][] ls_xyh) {
        int x0 = 0, y0 = 0, h0 = 0;
        for (int i = 0; i < n; i++) {
            if (ls_xyh[i][2] > 0) {
                x0 = ls_xyh[i][0];
                y0 = ls_xyh[i][1];
                h0 = ls_xyh[i][2];
                break;
            }
        }

        List<int[]> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                cands.add(new int[]{cx, cy, h0 + Math.abs(cx - x0) + Math.abs(cy - y0)});
            }
        }

        for (int i = 0; i < ls_xyh.length; i++) {
            int x = ls_xyh[i][0];
            int y = ls_xyh[i][1];
            int h = ls_xyh[i][2];
            cands.removeIf(cand -> Math.max(cand[2] - Math.abs(cand[0] - x) - Math.abs(cand[1] - y), 0) != h);
        }

        int[] result = cands.get(0);
        return result[0] + " " + result[1] + " " + result[2];
    }
}
```

This Java code does the same thing as the Python code. It reads the input, solves the problem, and prints the result. The main difference is that Java uses a List to store the candidates instead of a list comprehension, and it uses the removeIf method to filter the candidates.

