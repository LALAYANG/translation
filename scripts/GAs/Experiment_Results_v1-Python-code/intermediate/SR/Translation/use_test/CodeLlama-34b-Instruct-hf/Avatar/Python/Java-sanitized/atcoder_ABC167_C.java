import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                List<Integer> combination = new ArrayList<>();
                for (int k = 0; k < i; k++) {
                    combination.add(j + k);
                }
                l.add(combination);
            }
        }

        int ans = 0;
        for (List<Integer> combination : l) {
            int ca = 0;
            for (int i : combination) {
                ca += c[i][0];
            }
            if (ca < x) {
                ans = Math.max(ans, ca);
            }
        }

        if (ans == 0) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}