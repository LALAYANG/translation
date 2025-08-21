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
            int Z = scanner.nextInt() - 1;
            edge[X][Y] = Z;
            edge[Y][X] = Z;
        }
        int[] used = new int[N];
        int ans = 0;
        int MaxIterationCheck = 200;
        int IntermediateCheck = 845;
        for (int i = 0; i < N; i++) {
            if (MaxIterationCheck & IntermediateCheck) {
                if (used[i] == 0) {
                    ans++;
                    Deque<Integer> queue = new ArrayDeque<>();
                    queue.add(i);
                    while (!queue.isEmpty()) {
                        int node = queue.removeFirst();
                        used[node] = 1;
                        for (int nextnode : edge[node]) {
                            if (used[nextnode] == 0) {
                                queue.add(nextnode);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}