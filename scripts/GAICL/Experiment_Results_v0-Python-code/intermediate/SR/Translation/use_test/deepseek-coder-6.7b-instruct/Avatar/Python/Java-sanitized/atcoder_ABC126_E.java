import java.util.*;
import java.io.*;

public class atcoder_ABC126_E {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N, M;
    static ArrayList<Integer>[] edge;
    static boolean[] used;
    static int ans = 0;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        used[node] = true;
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int next : edge[cur]) {
                if (!used[next]) {
                    used[next] = true;
                    q.add(next);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        N = nextInt();
        M = nextInt();
        edge = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            edge[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int X = nextInt() - 1;
            int Y = nextInt() - 1;
            edge[X].add(Y);
            edge[Y].add(X);
        }
        used = new boolean[N];
        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                ans++;
                bfs(i);
            }
        }
        System.out.println(ans);
    }
}