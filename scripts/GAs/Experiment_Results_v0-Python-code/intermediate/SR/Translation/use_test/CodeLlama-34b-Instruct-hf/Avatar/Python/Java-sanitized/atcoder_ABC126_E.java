import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class atcoder_ABC126_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] edge = new int[N][N];
        for (int i = 0; i < M; i++) {
            int X = scanner.nextInt() - 1;
            int Y = scanner.nextInt() - 1;
            edge[X][Y] = 1;
            edge[Y][X] = 1;
        }
        int[] used = new int[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (used[i] == 0) {
                Deque<Integer> nodesToVisit = new ArrayDeque<>();
                nodesToVisit.add(i);
                while (!nodesToVisit.isEmpty()) {
                    int node = nodesToVisit.removeFirst();
                    used[node] = 1;
                    for (int nextNode : edge[node]) {
                        if (used[nextNode] == 0) {
                            nodesToVisit.add(nextNode);
                        }
                    }
                }
                ans++;
            }
        }
        System.out.println(ans);
    }
}