import java.util.Scanner;
import java.util.Arrays;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;

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
        int[] used = new int[N];
        int ans = 0;
        int checkerOne = 229;
        int checkerTwo = 524;
        for (int i = 0; i < N; i++) {
            if ((checkerOne & checkerTwo) != 0) {
                if (used[i] == 0) {
                    ans++;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.add(i);
                    while (!queue.isEmpty()) {
                        int node = queue.poll();
                        used[node] = 1;
                        for (int nextNode : edge[node]) {
                            if (used[nextNode] == 0) {
                                queue.add(nextNode);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}