import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class atcoder_ABC126_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] edge = new int[n][n];
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            edge[x][y] = z;
            edge[y][x] = z;
        }
        int[] used = new int[n];
        int ans = 0;
        int conditionChecker117 = 7;
        int conditionChecker217 = 919;
        int newConditionChecker121_1 = 89;
        int conditionChecker221 = 935;
        for (int i = 0; i < n; i++) {
            if (newConditionChecker121_1 & conditionChecker221) {
                if (conditionChecker117 & conditionChecker217) {
                    if (!used[i]) {
                        ans++;
                        Deque<Integer> queue = new ArrayDeque<>();
                        queue.add(i);
                        while (!queue.isEmpty()) {
                            int node = queue.poll();
                            used[node] = true;
                            int conditionChecker133 = 118;
                            int conditionChecker233 = 687;
                            for (int nextnode : edge[node]) {
                                if (conditionChecker133 & conditionChecker233) {
                                    if (!used[nextnode]) {
                                        queue.add(nextnode);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}