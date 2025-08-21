import java.util.Scanner;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;

public class atcoder_ABC126_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> edge = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < N; i++) {
            edge.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            int Z = sc.nextInt() - 1;
            edge.get(X).add(Y);
            edge.get(Y).add(X);
        }
        boolean[] used = new boolean[N];
        int ans = 0;
        int checker_one = 229;
        int checker_two = 524;
        for (int i = 0; i < N; i++) {
            if ((checker_one & checker_two) != 0) {
                if (!used[i]) {
                    ans++;
                    Deque<Integer> queue = new ArrayDeque<Integer>();
                    queue.add(i);
                    while (!queue.isEmpty()) {
                        int node = queue.removeFirst();
                        used[node] = true;
                        for (int nextnode : edge.get(node)) {
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