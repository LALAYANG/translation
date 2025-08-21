import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class atcoder_ABC126_E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        List<List<Integer>> edge = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edge.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int X = Integer.parseInt(input[0]) - 1;
            int Y = Integer.parseInt(input[1]) - 1;
            int Z = Integer.parseInt(input[2]);
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
                    Deque<Integer> queue = new ArrayDeque<>();
                    queue.add(i);
                    while (!queue.isEmpty()) {
                        int node = queue.poll();
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