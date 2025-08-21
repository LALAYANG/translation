import java.util.*;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = scanner.nextInt();
            }
        }
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    temp.add(j);
                }
            }
            l.add(temp);
        }
        for (int i = 1; i < m; i++) {
            for (int j = l.size() - 1; j >= 0; j--) {
                int ca = 0;
                for (int ii : l.get(j)) {
                    ca += c[ii][i];
                }
                if (ca >= x) {
                    rem.add(j);
                }
            }
            for (int j : rem) {
                l.remove(j);
            }
            rem.clear();
            if (l.isEmpty()) {
                System.out.println(-1);
                return;
            }
        }
        for (List<Integer> i : l) {
            int ca = 0;
            for (int j : i) {
                ca += c[j][0];
            }
            if (ans == 0) {
                ans = ca;
            } else {
                ans = Math.min(ans, ca);
            }
        }
        System.out.println(ans);
    }
}