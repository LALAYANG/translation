import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
            for (int j = 0; j < m; j++) {
                if (c[i - 1][j] < x) {
                    combinations.add(Arrays.asList(i));
                }
            }
        }

        int ans = 0;
        for (List<Integer> combination : combinations) {
            int currentCost = 0;
            for (int i : combination) {
                currentCost += c[i - 1][0];
            }
            if (ans == 0) {
                ans = currentCost;
            } else {
                ans = Math.min(ans, currentCost);
            }
        }

        System.out.println(ans);
    }
}