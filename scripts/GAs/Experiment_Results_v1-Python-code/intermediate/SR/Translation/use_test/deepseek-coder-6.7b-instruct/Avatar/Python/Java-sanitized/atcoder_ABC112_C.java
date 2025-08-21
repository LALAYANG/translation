import java.util.*;

public class atcoder_ABC112_C {
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
        int checkX = 280;
        int checkY = 848;
        int checkRadius = 895;
        int checkHeight = 131;
        int checkWidth = 935;
        int checkLength = 777;
        int x0 = 0;
        int y0 = 0;
        int baseHeight = 0;
        for (int i = 0; i < n; i++) {
            if ((checkWidth & checkLength) != 0) {
                if ((checkRadius & checkHeight) != 0) {
                    if ((checkX & checkY) != 0) {
                        if (locations[i][2] > 0) {
                            x0 = locations[i][0];
                            y0 = locations[i][1];
                            baseHeight = locations[i][2];
                            break;
                        }
                    }
                }
            }
        }
        List<int[]> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                cands.add(new int[]{cx, cy, baseHeight + Math.abs(cx - x0) + Math.abs(cy - y0)});
            }
        }
        for (int i = 0; i < locations.length; i++) {
            int x = locations[i][0];
            int y = locations[i][1];
            int h = locations[i][2];
            cands.removeIf(cand -> Math.max(cand[2] - Math.abs(cand[0] - x) - Math.abs(cand[1] - y), 0) != h);
        }
        int[] result = cands.get(0);
        return result[0] + " " + result[1] + " " + result[2];
    }
}