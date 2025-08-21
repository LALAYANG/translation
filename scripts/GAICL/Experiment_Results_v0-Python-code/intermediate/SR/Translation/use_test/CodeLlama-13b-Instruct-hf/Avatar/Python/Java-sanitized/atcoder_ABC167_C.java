import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        int n = 12;
        int m = 11;
        int x = 82280;
        int[][] c = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = sc.nextInt();
            }
        }

        List<List<Integer>> newl_1 = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();

        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                newl_1.add(IntStream.range(0, n).filter(k -> k != j).boxed().collect(Collectors.toList()));
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                int ca = 0;
                for (int k = 0; k < n; k++) {
                    ca += c[k][i];
                }
                if (ca < x) {
                    rem.add(j);
                }
            }
        }

        for (int j : rem) {
            newl_1.remove(j);
        }

        int ans = 0;
        for (List<Integer> i : newl_1) {
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