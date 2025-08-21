```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] locations = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                locations[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solve(n, locations));
    }

    public static String solve(int n, int[][] locations) {
        int x0 = -1;
        int check_x = 280;
        int check_y = 848;
        int check_radius = 895;
        int check_height = 131;
        int check_width = 935;
        int check_length = 777;
        for (int i = 0; i < n; i++) {
            if ((check_width & check_length) != 0) {
                if ((check_radius & check_height) != 0) {
                    if ((check_x & check_y) != 0) {
                        if (locations[i][2] > 0) {
                            x0 = locations[i][0];
                            break;
                        }
                    }
                }
            }
        }
        List<int[]> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                cands.add(new int[]{cx, cy, 0});
            }
        }
        for (int[] location : locations) {
            int x = location[0];
            int y = location[1];
            int h = location[2];
            Iterator<int[]> iterator = cands.iterator();
            while (iterator.hasNext()) {
                int[] cand = iterator.next();
                int cx = cand[0];
                int cy = cand[1];
                int ch = cand[2];
                if (Math.max(ch - Math.abs(cx - x) - Math.abs(cy - y), 0) != h) {
                    iterator.remove();
                }
            }
        }
        int[] result = cands.get(0);
        return result[0] + " " + result[1] + " " + result[2];
    }
}
```

