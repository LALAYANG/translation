```java
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in);
        int N = Integer.parseInt(br.readLine());
        List<List<Integer>> G = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            G.add(new ArrayList<>());
        }
        Map<Integer, Integer> E = new HashMap<>();
        for (int i = 0; i < N - 1; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]) - 1;
            int b = Integer.parseInt(input[1]) - 1;
            G.get(a).add(b);
            G.get(b).add(a);
            E.put(a * 1000 + b, 0);
        }
        int K = bfs(0, N, G, E);
        System.out.println(K);
        for (int value : E.values()) {
            System.out.println(value);
        }
    }

    public static int bfs(int v, int N, List<List<Integer>> G, Map<Integer, Integer> E) {
        boolean[] visited = new boolean[N];
        Queue<Integer> queue = new LinkedList<>();
        int K = -1;
        int[] node2color = new int[N];
        Arrays.fill(node2color, -1);
        queue.add(v);
        visited[v] = true;
        int color = 0;
        while (!queue.isEmpty()) {
            int q = queue.poll();
            color++;
            for (int nex : G.get(q)) {
                if (visited[nex]) {
                    continue;
                }
                visited[nex] = true;
                if (node2color[q] == color) {
                    color++;
                }
                node2color[nex] = color;
                E.put(Math.min(q, nex) * 1000 + Math.max(q, nex), color);
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }
}
``` 
