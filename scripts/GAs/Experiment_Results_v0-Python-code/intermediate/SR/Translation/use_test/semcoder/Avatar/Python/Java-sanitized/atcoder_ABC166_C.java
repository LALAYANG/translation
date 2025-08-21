import java.util.Scanner;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] health = new int[n];
        for (int i = 0; i < n; i++) {
            health[i] = sc.nextInt();
        }
        int[][] path = new int[n][n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            path[a][b] = 1;
            path[b][a] = 1;
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (path[i][j] == 1) {
                    if (health[i] <= health[j]) {
                        c++;
                        break;
                    }
                }
            }
        }
        System.out.println(c);
    }
}