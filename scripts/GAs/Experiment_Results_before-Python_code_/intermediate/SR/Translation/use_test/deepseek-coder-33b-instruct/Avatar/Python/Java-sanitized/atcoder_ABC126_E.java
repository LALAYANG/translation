import java.util.*;

public class atcoder_ABC126_E {
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
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

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int N = fs.nextInt();
        int M = fs.nextInt();
        ArrayList<Integer>[] edge = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            edge[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int X = fs.nextInt() - 1;
            int Y = fs.nextInt() - 1;
            edge[X].add(Y);
            edge[Y].add(X);
        }
        boolean[] used = new boolean[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
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
        System.out.println(ans);
    }
}