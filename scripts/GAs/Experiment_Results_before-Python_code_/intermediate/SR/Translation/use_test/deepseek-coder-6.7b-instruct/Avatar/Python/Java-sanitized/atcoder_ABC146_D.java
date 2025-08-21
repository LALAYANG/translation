import java.util.*;

public class atcoder_ABC146_D {
    static int N;
    static ArrayList<Integer>[] G;
    static HashMap<Pair, Integer> E;

    static class Pair implements Comparable<Pair> {
        int a, b;

        Pair(int a, int b) {
            this.a = Math.min(a, b);
            this.b = Math.max(a, b);
        }

        @Override
        public int compareTo(Pair o) {
            if (a != o.a) return a - o.a;
            return b - o.b;
        }
    }

    static int bfs(int v) {
        boolean[] visited = new boolean[N];
        Queue<Integer> queue = new LinkedList<>();
        int[] node2color = new int[N];
        Arrays.fill(node2color, -1);
        int K = -1;
        queue.add(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            int q = queue.poll();
            int color = 0;
            for (int nex : G[q]) {
                if (visited[nex]) continue;
                visited[nex] = true;
                color += 1;
                if (color == node2color[q]) color += 1;
                node2color[nex] = color;
                E.put(new Pair(q, nex), color);
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        G = new ArrayList[N];
        E = new HashMap<>();
        for (int i = 0; i < N; i++) G[i] = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1, b = sc.nextInt() - 1;
            G[a].add(b);
            G[b].add(a);
            E.put(new Pair(a, b), 0);
        }
        int K = bfs(0);
        System.out.println(K);
        for (Map.Entry<Pair, Integer> entry : E.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}