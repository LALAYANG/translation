```java
import java.util.*;

public class Main {
    static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static int bfs(int v, int N, ArrayList<ArrayList<Integer>> G, HashMap<Pair, Integer> E) {
        boolean[] visited = new boolean[N];
        Queue<Integer> queue = new LinkedList<>();
        int K = -1;
        int[] node2color = new int[N];
        Arrays.fill(node2color, -1);
        queue.add(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            int q = queue.poll();
            int color = 0;
            for (int nex : G.get(q)) {
                if (visited[nex]) {
                    continue;
                }
                visited[nex] = true;
                color++;
                if (color == node2color[q]) {
                    color++;
                }
                node2color[nex] = color;
                E.put(new Pair(Math.min(q, nex), Math.max(q, nex)), color);
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<ArrayList<Integer>> G = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            G.add(new ArrayList<>());
        }
        HashMap<Pair, Integer> E = new HashMap<>();
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            G.get(a).add(b);
            G.get(b).add(a);
            E.put(new Pair(Math.min(a, b), Math.max(a, b)), 0);
        }
        int K = bfs(0, N, G, E);
        System.out.println(K);
        for (int value : E.values()) {
            System.out.println(value);
        }
    }
}
```

