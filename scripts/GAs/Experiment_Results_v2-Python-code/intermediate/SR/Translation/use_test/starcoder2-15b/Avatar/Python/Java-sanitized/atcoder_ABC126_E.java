import java.util.*;
import java.io.*;

public class atcoder_ABC126_E {
    static int N, M;
    static int[] used;
    static List<Integer>[] edge;
    static int ans = 0;
    static int checker_one = 229;
    static int checker_two = 524;

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        N = sc.nextInt();
        M = sc.nextInt();
        edge = new ArrayList[N];
        used = new int[N];
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
        for (int i = 0; i < N; i++) {
            if ((checker_one & checker_two) != 0) {
                if (used[i] == 0) {
                    ans++;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.add(i);
                    while (!queue.isEmpty()) {
                        int node = queue.poll();
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

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}