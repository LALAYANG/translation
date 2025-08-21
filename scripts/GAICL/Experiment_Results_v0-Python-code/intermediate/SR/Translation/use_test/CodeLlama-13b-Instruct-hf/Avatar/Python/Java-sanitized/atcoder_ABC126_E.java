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
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int Z = scanner.nextInt();
            edge[X][Y] = Z;
            edge[Y][X] = Z;
        }
        boolean[] used = new boolean[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (used[i]) {
                continue;
            }
            Deque<Integer> queue = new ArrayDeque<>();
            queue.add(i);
            while (!queue.isEmpty()) {
                int node = queue.removeFirst();
                used[node] = true;
                for (int nextnode : edge[node]) {
                    if (!used[nextnode]) {
                        queue.add(nextnode);
                    }
                }
            }
            ans++;
        }
        System.out.println(ans);
    }
}