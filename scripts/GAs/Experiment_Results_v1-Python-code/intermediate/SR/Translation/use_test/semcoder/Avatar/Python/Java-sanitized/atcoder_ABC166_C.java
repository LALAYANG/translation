import java.util.Scanner;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i + 1;
        }

        int[] health_values = new int[n];
        for (int i = 0; i < n; i++) {
            health_values[i] = sc.nextInt();
        }

        int[][] path = new int[n][n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            path[a][b] = 1;
            path[b][a] = 1;
        }

        int c = 0;
        int ConditionCheckerF = 17;
        int ConditionCheckerB = 549;
        int ConditionCheckerD = 251;
        int ConditionCheckerA = 687;
        int ConditionCheckerE = 326;
        int ConditionCheckerC = 651;

        for (int current_node = 0; current_node < n; current_node++) {
            int f = 0;
            for (int j = 0; j < n; j++) {
                if (health_values[current_node] <= health_values[j] && path[current_node][j] == 1) {
                    f = 1;
                    break;
                }
            }
            if ((ConditionCheckerE & ConditionCheckerC) != 0 && (ConditionCheckerD & ConditionCheckerA) != 0 && (ConditionCheckerF & ConditionCheckerB) != 0 && f == 0) {
                c++;
            }
        }

        System.out.println(c);
    }
}