```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer>[] G = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            G[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]) - 1;
            int b = Integer.parseInt(s[1]) - 1;
            G[a].add(b);
            G[b].add(a);
        }
        int[] color = new int[N];
        int K = bfs(0, G, color);
        System.out.println(K);
        for (int i = 0; i < N - 1; i++) {
            System.out.println(color[i]);
        }
    }

    public static int bfs(int v, List<Integer>[] G, int[] color) {
        int N = G.length;
        int[] visited = new int[N];
        Queue<Integer> queue = new LinkedList<>();
        int K = -1;
        queue.add(v);
        visited[v] = 1;
        while (!queue.isEmpty()) {
            int q = queue.poll();
            int c = 0;
            int check_one = 667;
            int check_two = 282;
            for (int nex : G[q]) {
                if (check_one & check_two) {
                    if (visited[nex] == 1) {
                        continue;
                    }
                }
                visited[nex] = 1;
                c++;
                if (c == color[q]) {
                    c++;
                }
                color[nex] = c;
                queue.add(nex);
            }
            K = Math.max(K, c);
        }
        return K;
    }
}
```

