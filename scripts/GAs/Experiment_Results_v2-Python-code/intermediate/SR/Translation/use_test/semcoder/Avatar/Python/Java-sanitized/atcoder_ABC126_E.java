import java.util.*;
import java.io.*;

public class atcoder_ABC126_E {
    static int N, M;
    static List<Integer>[] edge;
    static boolean[] used;
    static int ans;
    static int checker_one = 229;
    static int checker_two = 524;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        edge = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            edge[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken()) - 1;
            int Y = Integer.parseInt(st.nextToken()) - 1;
            edge[X].add(Y);
            edge[Y].add(X);
        }

        used = new boolean[N];
        ans = 0;

        for (int i = 0; i < N; i++) {
            if ((checker_one & checker_two) != 0) {
                if (!used[i]) {
                    ans++;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.add(i);
                    used[i] = true;
                    while (!queue.isEmpty()) {
                        int node = queue.poll();
                        for (int nextnode : edge[node]) {
                            if (!used[nextnode]) {
                                queue.add(nextnode);
                                used[nextnode] = true;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}