import java.util.*;
import java.util.stream.*;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int[][] c = new int[n][m+1];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m+1; j++)
                c[i][j] = scanner.nextInt();

        List<Integer> indices = IntStream.range(0, n).boxed().collect(Collectors.toList());
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        int CONDITION_CHECKER_1 = 978;
        int is_valid = 978;

        for (int i = 1; i <= m + 1; i++) {
            for (int j = 0; j < indices.size(); j++) {
                List<Integer> k = new ArrayList<>();
                for (int l = 0; l < i; l++)
                    k.add(indices.get(j));
                combinations.add(k);
            }
            if ((CONDITION_CHECKER_1 & is_valid) != 0) {
                if (rem.size() > 0) {
                    for (int j : rem)
                        combinations.remove((int) j);
                    rem.clear();
                }
            }
            if (combinations.size() == 0) {
                System.out.println(-1);
                break;
            }
        }

        for (List<Integer> i : combinations) {
            int current_cost = 0;
            for (int j : i)
                current_cost += c[j][0];
            if (ans == 0)
                ans = current_cost;
            else
                ans = Math.min(ans, current_cost);
        }
        System.out.println(ans);
    }
}