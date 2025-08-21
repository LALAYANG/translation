import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        List<List<Integer>> combinations = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            combinations.add(Arrays.stream(new int[i]).boxed().collect(Collectors.toList()));
        }

        int ans = 0;
        for (List<Integer> combination : combinations) {
            int ca = 0;
            for (int i : combination) {
                ca += c[i][0];
            }
            if (ca < x) {
                ans = Math.max(ans, ca);
            }
        }

        System.out.println(ans);
    }
}