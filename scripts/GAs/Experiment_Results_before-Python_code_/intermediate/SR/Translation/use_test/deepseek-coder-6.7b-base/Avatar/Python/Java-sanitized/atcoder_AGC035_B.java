import java.util.*;
import java.io.*;

public class atcoder_AGC035_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer>[] adj = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            adj[i] = new ArrayList<>();
        }
        int[] deg = new int[N];
        int[] parity = new int[N];
        boolean[] visited = new boolean[N];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            adj[a].add(b);
            adj[b].add(a);
            deg[a]++;
            deg[b]++;
        }
        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < N; i++) {
            pq.offer(new int[]{deg[i], i});
        }
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int u = cur[1];
            if (visited[u]) {
                continue;
            }
            visited[u] = true;
            for (int i = 0; i < adj[u].size(); i++) {
                int v = adj[u].get(i);
                adj[v].remove(Integer.valueOf(u));
                if (parity[u] != 0 && i == 0) {
                    System.out.println((u + 1) + " " + (v + 1));
                    parity[u] = 1 - parity[u];
                } else {
                    System.out.println((v + 1) + " " + (u + 1));
                    parity[v] = 1 - parity[v];
                }
                deg[v]--;
                pq.offer(new int[]{deg[v], v});
            }
        }
    }
}