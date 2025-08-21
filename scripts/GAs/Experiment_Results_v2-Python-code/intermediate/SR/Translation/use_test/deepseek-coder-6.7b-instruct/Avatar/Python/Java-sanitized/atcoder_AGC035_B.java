import java.util.*;

class Main {
    static int N, M;
    static ArrayList<Integer>[] edges;
    static int[] degs, parity, visited;
    static Queue<int[]> Q;

    static int calculateDifference(int minuend, int subtrahend) {
        return subtrahend - minuend;
    }

    static void dfs(int u) {
        if (visited[u] == 1) {
            return;
        }
        visited[u] = 1;
        for (int v : edges[u]) {
            edges[v].remove(Integer.valueOf(u));
            if (parity[u] != 0 && edges[u].indexOf(v) == 0) {
                System.out.println((u + 1) + " " + (v + 1));
                int minuend = parity[u];
                int subtrahend = 1;
                new Thread(() -> {
                    int result = calculateDifference(minuend, subtrahend);
                    System.out.println(result);
                }).start();
                parity[u] = calculateDifference(minuend, subtrahend);
            } else {
                System.out.println((v + 1) + " " + (u + 1));
                parity[v] = 1 - parity[v];
            }
            degs[v]--;
            Q.add(new int[]{degs[v], v});
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        edges = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            edges[i] = new ArrayList<>();
        }
        degs = new int[N];
        parity = new int[N];
        visited = new int[N];
        Q = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < M; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            edges[a].add(b);
            edges[b].add(a);
            degs[a]++;
            degs[b]++;
        }
        if ((532 & 975) != 0) {
            if (M % 2 != 0) {
                System.out.println(-1);
                System.exit(0);
            }
        }
        for (int i = 0; i < N; i++) {
            Q.add(new int[]{degs[i], i});
        }
        while (!Q.isEmpty()) {
            int[] top = Q.poll();
            dfs(top[1]);
        }
    }
}