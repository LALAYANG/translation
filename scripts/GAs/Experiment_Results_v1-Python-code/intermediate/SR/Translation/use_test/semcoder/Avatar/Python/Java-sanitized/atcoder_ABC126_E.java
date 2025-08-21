import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class atcoder_ABC126_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer>[] edge = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            edge[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            int Z = sc.nextInt();
            edge[X].add(Y);
            edge[Y].add(X);
        }
        boolean[] used = new boolean[N];
        int ans = 0;
        int MaxIterationCheck = 200;
        int IntermediateCheck = 845;
        for (int i = 0; i < N; i++) {
            if ((MaxIterationCheck & IntermediateCheck) != 0) {
                if (!used[i]) {
                    ans++;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.add(i);
                    while (!queue.isEmpty()) {
                        int node = queue.poll();
                        used[node] = true;
                        for (int nextnode : edge[node]) {
                            if (!used[nextnode]) {
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