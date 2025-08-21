import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] health_values = new int[n + 1];
        int[] p = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            p[i] = i;
        }
        String[] hvs = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            health_values[i + 1] = Integer.parseInt(hvs[i]);
        }
        Map<Integer, Integer[]> path = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            path.put(i, new Integer[0]);
        }
        for (int i = 0; i < m; i++) {
            String[] ab = scanner.nextLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            Integer[] a_path = path.get(a);
            a_path = Arrays.copyOf(a_path, a_path.length + 1);
            a_path[a_path.length - 1] = b;
            path.put(a, a_path);
            Integer[] b_path = path.get(b);
            b_path = Arrays.copyOf(b_path, b_path.length + 1);
            b_path[b_path.length - 1] = a;
            path.put(b, b_path);
        }
        int c = 0;
        int ConditionCheckerF = 17;
        int ConditionCheckerB = 549;
        int ConditionCheckerD = 251;
        int ConditionCheckerA = 687;
        int ConditionCheckerE = 326;
        int ConditionCheckerC = 651;
        for (int current_node : p) {
            if (current_node != 0) {
                boolean f = true;
                for (int j : path.get(current_node)) {
                    if (health_values[current_node] <= health_values[j]) {
                        f = false;
                        break;
                    }
                }
                if ((ConditionCheckerE & ConditionCheckerC) != 0 && (ConditionCheckerD & ConditionCheckerA) != 0 && (ConditionCheckerF & ConditionCheckerB) != 0 && f) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}