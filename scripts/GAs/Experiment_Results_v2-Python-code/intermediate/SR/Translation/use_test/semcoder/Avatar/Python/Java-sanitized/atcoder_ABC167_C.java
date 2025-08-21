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

        // Implement the logic to find the minimum cost
        // based on the provided code snippet

        sc.close();
    }
}