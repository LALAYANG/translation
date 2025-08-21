import java.util.Scanner;

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

        // Generate all possible combinations of indices
        int[] indices = new int[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Initialize variables
        int[] combinations = new int[n];
        int rem = 0;
        int ans = 0;

        // Iterate over each combination
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                int currentCost = 0;
                for (int k = 0; k < n; k++) {
                    if ((j & (1 << k)) != 0) {
                        currentCost += c[k][i];
                    }
                }
                if (currentCost < x) {
                    rem |= (1 << j);
                }
            }

            // Remove combinations based on conditions
            if ((rem & 1) != 0) {
                for (int j = 0; j < n; j++) {
                    if ((rem & (1 << j)) != 0) {
                        rem ^= (1 << j);
                    }
                }
            }

            // Check if no combinations left
            if (rem == 0) {
                System.out.println(-1);
                return;
            }
        }

        // Calculate minimum cost
        for (int i = 0; i < n; i++) {
            int currentCost = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    currentCost += c[j][0];
                }
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