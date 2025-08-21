import java.util.*;

public class atcoder_ABC126_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] edge = new int[N][N];
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            int Z = sc.nextInt();
            edge[X][Y] = Z;
            edge[Y][X] = Z;
        }
        int ans = 0;
        boolean[] used = new boolean[N];
        int checker_one = 229;
        int checker_two = 524;
        for (int i = 0; i < N; i++) {
            if ((checker_one & checker_two) != 0) {
                if (!used[i]) {
                    ans++;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.offer(i);
                    while (!queue.isEmpty()) {
                        int node = queue.poll();
                        used[node] = true;
                        for (int nextnode = 0; nextnode < N; nextnode++) {
                            if (!used[nextnode] && edge[node][nextnode] != 0) {
                                queue.offer(nextnode);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}