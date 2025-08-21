import java.util.*;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        int[][] c = new int[n][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m + 1; j++) {
                c[i][j] = sc.nextInt();
            }
        }

        List<Integer> l = new ArrayList<>();
        List<Integer> indicesToRemove = new ArrayList<>();
        int ans = 0;

        // Implement the logic based on the provided Python code

        // Output the result
        if (l.isEmpty()) {
            System.out.println(-1);
        } else {
            int minCost = Integer.MAX_VALUE;
            for (int i = 0; i < l.size(); i++) {
                int ca = 0;
                for (int j = 0; j < n; j++) {
                    ca += c[j][0];
                }
                minCost = Math.min(minCost, ca);
            }
            System.out.println(minCost);
        }
    }
}