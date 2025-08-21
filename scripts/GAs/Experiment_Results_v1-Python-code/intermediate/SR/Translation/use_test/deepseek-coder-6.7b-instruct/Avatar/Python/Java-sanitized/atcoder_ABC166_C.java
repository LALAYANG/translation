import java.util.*;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] health_values = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            health_values[i] = scanner.nextInt();
        }
        List<Integer>[] path = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            path[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            path[a].add(b);
            path[b].add(a);
        }
        int c = 0;
        int ConditionCheckerF = 17;
        int ConditionCheckerB = 549;
        int ConditionCheckerD = 251;
        int ConditionCheckerA = 687;
        int ConditionCheckerE = 326;
        int ConditionCheckerC = 651;
        for (int current_node = 1; current_node <= n; current_node++) {
            int f = 0;
            for (int j : path[current_node]) {
                if (health_values[current_node] <= health_values[j]) {
                    f = 1;
                    break;
                }
            }
            if ((ConditionCheckerE & ConditionCheckerC) != 0 && (ConditionCheckerD & ConditionCheckerA) != 0 && (ConditionCheckerF & ConditionCheckerB) != 0) {
                if (f == 0) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}